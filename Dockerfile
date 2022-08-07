FROM openjdk:11 as build
WORKDIR /workspace/app

RUN apt-get update && \
    apt-get install dos2unix && \
    apt-get clean
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN dos2unix mvnw

RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:11
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.TestJava.BackendRotarMatriz.BackendRotarMatrizApplication"]
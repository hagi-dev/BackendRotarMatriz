# Api Rest Rotacion de matriz de numeros 

<img alt="Logo" align="right" src="https://www.fontana.com.ar/wp-content/uploads/2018/10/spring-boot-logo.png" width="40%" />


- [Usar la Api](##usando la api) – como usar la api.
- [Documentacion-UI localhost](http://localhost:8080/swagger-ui.html) – como poder usar la api con la documentacion(swagger-ui).


## Vista Rapida
tienes que clonar el repository a tu entorno local para ejecutar las siguientes comandos

```sh
docker build -t backend-rotar_matriz .
docker run -p 8080:8080  backend-rotar_matriz  
```

_luego ejecutar los comandos anteriores_

Entonces abre en el navegador [http://localhost:8080/](http://localhost:8080/) y si te contesta con bienvenido ala "Bienvenido ala Api de rotacion de matriz" tu api esta funcionando bien.<br>
Para entrar ala documentacion echa con swagger abre el navegador en [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) .

<p align='center'>
<img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659899209/in6ifwv2i9bxkjt0fieh.png'>
</p>

### Comience de inmediato

tienes que tener instalado docker para poder usar los contenedores o puedes descargarlo en:
- [para Windowns](https://docs.docker.com/desktop/install/windows-install/)
- [para ubuntu](https://docs.docker.com/engine/install/ubuntu/)
- [para Mac](https://docs.docker.com/desktop/install/mac-install/)</br>

con docker instalado solo correra los comandos de arriba

## endpoints

- Post rotal matriz [http://localhost:8080/matrix/rotate/counterclockwise](http://localhost:8080/matrix/rotate/counterclockwise)
- Get Bienvenida ala api [http://localhost:8080/](http://localhost:8080/)
## usando la api

**si desear correr la api sin docker tienes que tener instalado JDK version 11 de java** (pero si vas a correr la api con docker no es necesario instalar el jdk version 11 de java).

pasos para usar la api:

### Primero ejecutamos los comandos en la raiz para iniciar la api

```sh
docker build -t backend-rotar_matriz .
docker run -p 8080:8080  backend-rotar_matriz  
```

### Entrar ala documentacion de swagger-ui 
una vez que se ejecute los comandos anteriores se ingresara a [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) para poder probar como funciona la Api 
y se encontrara con un ainterfaz grafica como:

<p align='center'>
<img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659899209/in6ifwv2i9bxkjt0fieh.png'>
</p>

- luedo expamdimos el matriz controller
  <p align='center'>
    <img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659903434/mbpevlaz9nqfna20rr9t.png'>
  </p>
  
- luego seleccionamos Try it out para hacer una peticion 

  <p align='center'>
    <img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659903797/hkhtaqmafsfwarmtkgna.png'>
  </p>

- lugo modificamos el cuerpo llenado la matriz NXN de numeros

  <p align='center'>
    <img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659903866/vp5xhdf3fqeivno7cqal.png'>
  </p>

- y precionamos excecute para realizar la peticion

  <p align='center'>
    <img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659903866/regrwbaprpbzph9qutaw.png'>
  </p>

- vemos la respuesta de la matriz  que roto antihorariamente

  <p align='center'>
    <img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659903866/wobehmoincnpaq9w7x1n.png'>
  </p>

- tambien la respuesta cuando enviamos un array vacion nos da un status 401

  <p align='center'>
    <img src='https://res.cloudinary.com/dxtt5pny0/image/upload/v1659903866/z2od6qrcrtdsklikpv57.png'>
  </p>

-------------------------------------------------


Arbol de directorias de la Api Rotacion de matriz 
```
BackendRotarMatriz
├── README.md
├── pom.xml
├── DockerFile
├── .gitignore
├── mvnw
├── .mvn
│   
└── src
    ├── main
    │   ├──java
    │   │  └──con.TestJava.BackendRotarMatriz
    │   │     ├──beans
    │   │     ├──configuration
    │   │     ├──context
    │   │     ├──controller
    │   │     ├──exceptions
    │   │     ├── persistence
    │   │     ├──service
    │   │     └──BackendRotarMatrizApplication.jar
    │   └──resource
    │ 
    │ 
    └── test
```



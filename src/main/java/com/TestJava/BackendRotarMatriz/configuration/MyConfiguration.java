package com.TestJava.BackendRotarMatriz.configuration;

import com.TestJava.BackendRotarMatriz.beans.rotateMatrixCounterclockwise.RotateMatrix90DegImplements;
import com.TestJava.BackendRotarMatriz.beans.rotateMatrixCounterclockwise.RotateMatrixCounterclockwise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public RotateMatrixCounterclockwise rotateMatrix(){
        return new RotateMatrix90DegImplements();
    }
}

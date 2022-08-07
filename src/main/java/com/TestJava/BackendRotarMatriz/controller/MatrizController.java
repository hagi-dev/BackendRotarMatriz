package com.TestJava.BackendRotarMatriz.controller;

import com.TestJava.BackendRotarMatriz.exceptions.RotateMatrixExceptions;
import com.TestJava.BackendRotarMatriz.persistence.entity.Numbers;
import com.TestJava.BackendRotarMatriz.service.MatrizService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matrix/rotate")
public class MatrizController {
    MatrizService matrizService;

    public MatrizController(MatrizService matrizService) {
        this.matrizService = matrizService;
    }

    @PostMapping("/counterclockwise")
    public Numbers rotateMatrixCounterclockwise(@RequestBody Numbers arrayNumbersTwoDimensional){
        try {

            return matrizService.rotateMatrixCounterclockwise(arrayNumbersTwoDimensional);

        }catch (Exception exception){
            throw new RotateMatrixExceptions("{message: error or format send incorrect, array NxN, example [[1,2],[3,4]]}", HttpStatus.NOT_FOUND);
        }
    }
}

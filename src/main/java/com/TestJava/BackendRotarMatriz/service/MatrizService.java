package com.TestJava.BackendRotarMatriz.service;

import com.TestJava.BackendRotarMatriz.beans.rotateMatrixCounterclockwise.RotateMatrixCounterclockwise;
import com.TestJava.BackendRotarMatriz.exceptions.RotateMatrixExceptions;
import com.TestJava.BackendRotarMatriz.persistence.entity.Numbers;
import com.TestJava.BackendRotarMatriz.utils.CheckMatrix;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MatrizService {
    /**
     * the RotateMatrixCounterclockwise is found in directory beans
     * and is to interface for use dependency injection
     */
     RotateMatrixCounterclockwise rotateMatrix;
     CheckMatrix checkMatrix;

    public MatrizService(RotateMatrixCounterclockwise rotateMatrix) {
        this.rotateMatrix = rotateMatrix;
    }

    /**
     * rotateMatrix is a Method service for rotate the matrix of numbers
     */
    public Numbers rotateMatrixCounterclockwise(Numbers arrayNumbersTwoDimensional){
        if(arrayNumbersTwoDimensional.getNumbers().length == 0){
            throw new RotateMatrixExceptions("{message: the array is empty}", HttpStatus.BAD_REQUEST);
        }
        if(!checkMatrix.checkMatrixNxN(arrayNumbersTwoDimensional)){
            throw new RotateMatrixExceptions("{message: the matrix is not NxN}", HttpStatus.BAD_REQUEST);
        }
        return rotateMatrix.rotateMatrixNumbers(arrayNumbersTwoDimensional);
    }

}

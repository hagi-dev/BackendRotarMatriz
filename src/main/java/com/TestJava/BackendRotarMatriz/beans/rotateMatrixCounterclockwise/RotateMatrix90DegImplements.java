package com.TestJava.BackendRotarMatriz.beans.rotateMatrixCounterclockwise;

import com.TestJava.BackendRotarMatriz.persistence.entity.Numbers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;

import java.util.Arrays;


public class RotateMatrix90DegImplements implements RotateMatrixCounterclockwise {
    @Override
    public Numbers rotateMatrixNumbers(Numbers arrayNumbersTwoDimensional){
        int[][] arrayNumbers = arrayNumbersTwoDimensional.getNumbers();
        int arrayLength= arrayNumbers.length;
        int[][] resultArray = new int[arrayLength][arrayLength];
        for(int i=0 ; i <arrayLength;i++){
            for(int j=0 ; j <arrayLength;j++){
                resultArray[arrayLength-1-j][i] = arrayNumbers[i][j];
            }
        }
        arrayNumbersTwoDimensional.setNumbers(resultArray);
        return arrayNumbersTwoDimensional;
    }
}

package com.TestJava.BackendRotarMatriz.utils;

import com.TestJava.BackendRotarMatriz.persistence.entity.Numbers;
import org.springframework.stereotype.Component;

@Component
public class CheckMatrix {
    /**
     * check if is a array NxN and if is type int [][]
     * @param(Numbers numbers)
     */
    public static boolean checkMatrixNxN(Numbers numbers){
        if(!(numbers.getNumbers() instanceof int[][])){
            return false;
        }
        int [][] arrayNumbers= numbers.getNumbers();
        int lengthDimension1= arrayNumbers.length;
        int lengthDimension2 = arrayNumbers[0].length;
        if(!(lengthDimension2==lengthDimension1)){
            return false;
        }

        return true;
    }
}

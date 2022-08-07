package com.TestJava.BackendRotarMatriz.persistence.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
/**
 *model entity of Numbers
 */

@Data
@Repository
public class Numbers {
    int[][] numbers;

    @Override
    public String toString() {
        return Arrays.deepToString(numbers);
    }
}

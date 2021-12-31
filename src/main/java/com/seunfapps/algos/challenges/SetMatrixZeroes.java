package com.seunfapps.algos.challenges;

import java.util.*;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        /*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

        You must do it in place.*/


        //this is not really in place, it uses extra memory.
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }

    public void setZeroesInPlace(int [][] matrix){
        //this approach, once you find a zero, set the first element in the row to zero.
        //also set the first element of the column to zero
        //that way, instead of using a Set to track, we use the array itself, in place, no extra memory.


        for(int i = 0; i <  matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 0; i <  matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][0] == 0){

                }
            }
        }
    }
}

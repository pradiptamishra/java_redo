package com.codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotatingArray {
    public int[] solution(int[] A, int N) {
        if (A.length==0){
            return A;
        }
        int i= A.length % N;
        int[] oldArray = new int[i];
        int[] newArray = new int[i];
        for (int j = 0; j < i; j++) {
            newArray[j] = A[j];
        }

        for (int j = 0; j <N; j++) {
            for (int k = 0; k < i; k++) {
                oldArray[k] = newArray[k];
            }

            newArray[0]=oldArray[i-1];
            for (int k=0; k<i-1;k++) {

                newArray[k+1]=oldArray[k];


            }

        }
        return newArray;
    }
}

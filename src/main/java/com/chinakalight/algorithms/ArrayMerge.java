package com.chinakalight.algorithms;

import java.util.Arrays;

public class ArrayMerge {

    public static void main(String [] args){
        int[] fA = {12, 34, 35, 44, 45};
        int[] sA = {1, 4, 6, 11, 13, 13, 14, 19, 20};

        int[] mA = new int[fA.length + sA.length];
        int fC = 0, sC = 0, mC = 0;

        while( fC < fA.length  &&  sC < sA.length ) {
            if(fA[fC] < sA[sC]){
                mA[mC++] = fA[fC++];
            }else{
                mA[mC++] = sA[sC++];
            }
        }

        // handle the remaining elements
        while(fC < fA.length)
            mA[mC++] = fA[fC++];

        while(sC < sA.length)
            mA[mC++] = sA[sC++];

        System.out.println("Merged Array: " + Arrays.toString(mA));

    }

}

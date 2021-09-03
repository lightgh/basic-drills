package com.chinakalight.algorithms.basicdrills;

import java.util.Arrays;
import java.util.Random;

public class ArrayDrill {

    public static void main(String[] args) {

        int arrayLength = 300;
        int[] fA = new int[arrayLength];
        for(int i = 0; i < fA.length; i++ ){
            System.out.println(fA[i]);
            fA[i] = new Random().nextInt();
            System.out.println(fA[i]);
        }

        int[] sA = new int[arrayLength + 450];

        for(int i = 0; i < sA.length; i++){
            System.out.println(sA[i]);
            int tmpVal = new Random().nextInt();
            sA[i] = tmpVal < 1? tmpVal * -1 : tmpVal;
            System.out.println(sA[i]);
        }

        System.out.println(Arrays.toString(fA));
        System.out.println(Arrays.toString(sA));

        int mA[] = new int[fA.length + sA.length + 200];

        int ic = 0;
        for(; ic < fA.length; ic++ ){
            mA[ic] = fA[ic];
        }

        for(int k=0; ic < mA.length && k < sA.length; ic++, k++){
            mA[ic] = sA[k];
        }

        System.out.println(Arrays.toString(mA));

    }
}




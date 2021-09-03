package com.chinakalight;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        System.out.println("This is a simple program in mac intellij java");
        int[] a = {12, 34};
        int[] b = {2, 3};

        System.out.println("Before Sorted Array Were Merged: " + Arrays.toString(a) + " " + Arrays.toString(b));
        int [] sortedArray = mergeArrays(a, b);
        System.out.println("Sorted Arrays: " + Arrays.toString(sortedArray));

        int aL = sortedArray.length;

        double median = 0.0;
        if(aL %2 == 0){
            median = (sortedArray[aL/2 - 1] + sortedArray[aL/2 + 1])/2;
        }else{
            median = sortedArray[aL/2 + 1];
        }

        System.out.println(median);

    }

    private static int[] mergeArrays(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] finalArray = new int[a.length + b.length];

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                finalArray[k++] = a[i++];
            }else{
                finalArray[k++] = b[j++];
            }
        }

        while(i < a.length){
            finalArray[k++] = a[i++];
        }

        while(j < b.length){
            finalArray[k++] = b[j++];
        }

        return finalArray;
    }

}

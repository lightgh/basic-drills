package com.chinakalight.algorithms;
import java.util.Arrays;

public class ArrayMerging {
    public static void main(String[] args) {
        int [] firstArrays = {12, 43, 56, 90, 98, 143};
        int [] secondArrays = {78, 89, 90, 91, 92, 99, 100, 101, 120, 121, 122, 123, 132, 133};

        int[] mergedArray = sortedArray(firstArrays, secondArrays);

        System.out.println("OUT-COME-");
        print(mergedArray);

    }

    public static void print(int[] intArray){
        System.out.println("ARRAY-CONTENT: " + Arrays.toString(intArray));
    }

    public static int[] sortedArray(int fArray[], int sArray[]){
        int icount = 0, fCount = 0, sCount = 0;
        int fLength = fArray.length, sLength = sArray.length;

        int finalArray[] = new int[fLength + sLength];

        while (fCount < fLength && sCount < sLength){
            if(fArray[fCount] < sArray[sCount]){
                finalArray[icount++] = fArray[fCount++];
            }else{
                finalArray[icount++] = sArray[sCount++];
            }
        }
        System.out.println("FIRST:");
        print(finalArray);

        //Process the remaining element:
        while(sCount < sLength){
            finalArray[icount++] = sArray[sCount++];
        }

        System.out.println("SECOND:");
        print(finalArray);
        while(fCount < fLength){
            finalArray[icount++] = fArray[fCount++];
        }


        System.out.println("THIRD:");
        print(finalArray);

        return finalArray;
    }
}

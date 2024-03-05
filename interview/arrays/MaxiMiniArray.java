package com.arrays;

import java.util.Arrays;
import java.util.Collections;

/*Find Max and min of Given array*/
public class MaxiMiniArray {



    public static void main(String[] args) {

        int a[] = {1, 2, 9, 37, 83, 92};
        System.out.println("Find maximum and minimu");
        findMinMax(a);
        Arrays.sort(a);
        System.out.println("Sorting array a[]-->" + Arrays.toString(a));

        Integer b[] = {134, 273, 94, 37, 83, 92};
        System.out.println("Sorting arrays using Arrays.sort()->Integer b[] = {134, 273, 94, 37, 83, 92}");
        Arrays.sort(b);
        System.out.println("-->" + Arrays.toString(b));

        System.out.println("Sorting arrays Reverse order using  Arrays.sort(b, Collections.reverseOrder()) " +
                "->Integer b[] = {134, 273, 94, 37, 83, 92}");
        Arrays.sort(b, Collections.reverseOrder());
        for (int num : b) {
            System.out.println(num);
        }



    }

    private static void findMinMax(int[] arr) {

        int max=arr[0];
        int min=arr[0];
        int arrLength=arr.length;

        //check array is empty
        if(arr==null || arrLength==0){
            System.out.println("Array is Empty");
        }

        for(int i=0;i<arrLength;i++ ){
            if(arr[i]>max){
               max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("Maximum of Array: "+max);
        System.out.println("Minimum of Array: "+min);

    }

}


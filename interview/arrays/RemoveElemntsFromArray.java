package com.arrays;

import java.util.Arrays;

/*Remove the particular elements from given array and print size of array
 *  int arr[]={1,2,3,4,5}; remove elemt 3*/
public class RemoveElemntsFromArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int elementToRemove = 3;
        System.out.println("Array before Removing Element:" + Arrays.toString(arr));

        int indexToremove = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                indexToremove = i;
            }
        }

        //printing new Array
        int newIndex = 0;
        int newArr[] = new int[arr.length - 1];

        for (int j = 0; j < arr.length; j++) {
            if (j != indexToremove) {
                newArr[newIndex] = arr[j];
                newIndex = newIndex + 1;
            }

        }
        arr = newArr;
        System.out.println("Array after Removing Element:" + Arrays.toString(newArr));
    }

}

package com.interview;

import java.util.Arrays;

/*find sub arrays and find sum of subArrays
* i/p=> {1,2,3} and k=3
* o/p=> 2*/

public class SumOfSubArray {
    public static void main(String[] args) {


        int arr[]={1,2,3};
//        int startIndex=1;
//        int lastIndex=2;
//
//        int subArr[]= Arrays.copyOfRange(arr,startIndex,lastIndex);
//        for(int i=0;i<subArr.length;i++){
//            System.out.println(subArr);
//        }
//        System.out.println(Arrays.toString(subArr));

        int k=3;
        int result=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
                for(int j=i;j< arr.length;j++){
                    sum=sum+arr[i];
                    if(sum==k){
                        result++;
                    }
            }
//            System.out.println("number of subarray"+k);
//            System.out.println("sum subarray"+result);
        }
        System.out.println("number of subarray k=3"+k);
        System.out.println("sum subarray result should be 2"+result);
    }
}

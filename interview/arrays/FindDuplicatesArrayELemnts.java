package com.arrays;

public class FindDuplicatesArrayELemnts {
    public static void main(String[] args) {

        int arr[]= {1,2,4,5,1,2,6,7,6};

        System.out.println(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println("\ni value "+arr[i]);
            for(int j=i+1;j< arr.length;j++){
                System.out.println("j value "+arr[j]);

                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }


            }
        }
    }
}

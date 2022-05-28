package com.company;

import java.util.Arrays;

public class Math {

    public static void main(String[] args) {

        int array[] = new int[10]; //Declaration

        int array1[] = {11,43,44,22,88,77,2,9,100,22}; //Initialization

        printArray(array1);

        bubbleSort(array1);
        System.out.println( );
        printArray(array1);
        System.out.println( );
        System.out.println( );
        System.out.println("Smallest of array is : " + array1[0]);
        System.out.println("Maximum of array is : " + array1[array1.length-1]);
        int n= 5;
        System.out.println("Nth value of array is : " + array1[n-1]);



    }

    private static void bubbleSort(int[] array1) {
        int temp = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 1; j < (array1.length-i); j++){
                if(array1[j-1] > array1[j]){
                    //swap elements
                    temp = array1[j-1];
                    array1[j-1] = array1[j];
                    array1[j] = temp;
                }

            }
        }
    }

    private static void printArray(int[] array1) {
        for(int i = 0; i< array1.length; i++){
            System.out.print(array1[i] + " , ");
        }
    }

}



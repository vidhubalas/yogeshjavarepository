package com.company;

public class SortingDemo {
    public static void main(String args[]){

        SortingDemo pt = new SortingDemo();
        int  arr[]={43,5,44,1,33,7};
        int arr1[]={20,3,40,7,5,1};
        int arr2[]={4,3,2,10,12,1,5,6};
        int arr3[]={10, 80, 30, 90, 40, 50, 70};
        System.out.println("Selection Sort array is : ");

        pt.print(arr);
        pt.selectionSort(arr);
        System.out.println("The sorted array is : ");
        pt.print(arr);

        System.out.println("Bubble Sort is : ");

        pt.print(arr1);
        pt.bubbleSort(arr1);
        System.out.println("The sorted array is : ");
        pt.print(arr1);

        System.out.println("Insertion Sort is : ");

        pt.print(arr2);
        pt.insertionSort(arr2);
        System.out.println("The sorted array is : ");
        pt.print(arr2);

        System.out.println("Quick Sort is : ");

        pt.print(arr3);
        pt.quickSort(arr3,0, arr3.length-1);
        System.out.println("The sorted array is : ");
        pt.print(arr3);
    }

    private void print(int arr[]){
        for(int i=0; i< arr.length; i++)
        System.out.print(arr[i] + " , ");
        System.out.println();
    }

    private void selectionSort(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min=j;

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private void bubbleSort(int[] arr) {
        for(int i=0; i< arr.length-1; i++)
            for(int j=0; j< arr.length-i-1; j++)
               if (arr[j]>arr[j+1]){

                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
        }

    private void insertionSort(int[] arr) {

        int temp;
        for(int i=1; i< arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            print(arr);
        }
    }

    private void quickSort(int[] arr,int low,int high){

        if (low<high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }


    }

    private int partition(int[] arr, int low, int high) {
         int temp;
         int pivot = high;
         int i = low-1;                    //count of element less than pivot
        for(int j = low; j<= high -1; j++){
            if(arr[j] < arr[pivot]){
                i++;                       // counting no. of elements less than pivot
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        temp = arr[i+1];                   // placing pivot at correct position
        arr[i+1] = arr[pivot];
        arr[pivot] = temp;                  //arr[] = {10, 80, 30, 90, 40, 50, 70}
        print(arr);
        return i+1;
    }
}


package com.company;

public class Replace {
    public static void main(String[] args) {
        int n=1004, num=0;

        System.out.println("Result :" + convertFive2(n));
    }
    public static int convertFive(int n) {
        int rem=0;
        while(n!=0){
            rem = n%10; // rem = 4 ; rem2 =0
            n = n/10; // 1004/10 = 100
            if(rem==0){
                System.out.print(5);
            }else{
                System.out.print(rem);
            }

        }
        System.out.println();
        return n;
    }

    public static int convertFive2(int n) {
        System.out.println("Size : " + Integer.toString(n).length());
        int arr[]=new int[Integer.toString(n).length()];
        int size= Integer.toString(n).length();
        int rem=0;
        while(n!=0){
            rem = n%10; // rem = 4 ; rem2 =0
            n = n/10; // 1004/10 = 100
            if(rem==0){
                arr[size-1]=5;
                size--;
                System.out.print(5);
            }else{
                arr[size-1]=rem;
                size--;
                System.out.print(rem);
            }

        }
        System.out.println();
        return Integer.parseInt(arr.toString());
    }
}

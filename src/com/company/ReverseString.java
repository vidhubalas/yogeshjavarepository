package com.company;

public class ReverseString {
    public static void main(String[] args){

        String reverse = "i:like:this:world";
        String temp[] = reverse.split(":");
        for(int i=temp.length-1; i>=0; i--)
            System.out.print(temp[i] + ".");
         String str = "Geeks";
         char arr[] = str.toCharArray();
        System.out.println();

        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
            sb.append(arr[i]);
        }
        System.out.println(arr.toString());
    }
}

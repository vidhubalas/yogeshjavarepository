package com.company;

import java.util.Arrays;

public class MergeString {
    public static void main(String[] args) {

        String s1 = "Hey";
        String s2 = "World";
        MergeString s = new MergeString();
        s.merge(s1,s2);

    }

    public void merge(String s1, String s2) {
        String result = "";
        int min = 0;
        if (s1.length() > s2.length())
            min = s2.length();
        else
            min = s1.length();
        char arr1[] = new char[s1.length() + s2.length()];

        int j = 0;
        for (int i = 0; i < min; i++) {
            arr1[j++] = s1.charAt(i);
            arr1[j++] = s2.charAt(i);
        }
        if(s1.length() > min){
            for (int i = min; i < s1.length(); i++)
                arr1[j++] = s1.charAt(i);
        }
        if(s2.length() > min){
            for (int i = min; i < s2.length(); i++)
                arr1[j++] = s2.charAt(i);
        }
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < s1.length()+ s2.length(); i++) {
            b.append(arr1[i]);
            System.out.println(b.toString());
        }

        System.out.println("Final String : " + b.toString());
    }
}
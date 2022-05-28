package com.company;

public class Practise {
    public static void main(String[] args) {

        System.out.println(divisibleBy4("940948824551711527614232216857618927954312"));
        //System.out.println(divisibleBy4("4"));
    }
    public static int divisibleBy4(String N){
        //int n = Integer.parseInt(N);
        int n=0;
        if(N.length()>2)
        n = Integer.parseInt(String.valueOf(N.charAt(N.length()-2)) + String.valueOf(N.charAt(N.length()-1)));
        else
            n= Integer.parseInt(N);
        System.out.println(n);

        if(n % 4==0)
            return 1;
        else
            return 0;
    }
}

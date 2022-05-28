package com.company;

public class DivisibleBy11 {
    public static void main(String[] args) {
        //System.out.println(DivisibleBy11("86416"));
        System.out.println(DivisibleBy11_2("76945"));
    }
    public static int DivisibleBy11 (String S){
        long n =Long.parseLong(S);
        if(n % 11 == 0)
            return 1;
        else
            return 0;
    }
    public static int DivisibleBy11_2 (String S) {
        int c1=0, c2=0;
        for(int i=0; i<S.length(); i=i+2){
            c1 = Character.getNumericValue(S.charAt(i)) + c1;
            if(i+1 < S.length())
            c2 = Character.getNumericValue(S.charAt(i+1)) + c2;
        }

        if((c1-c2) % 11 == 0)
            return 1;
        else
            return 0;
    }
}

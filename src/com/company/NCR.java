package com.company;

public class NCR {
    public static void main(String[] args) {
        int n = 778, r = 116,result;
        //long result = (factorial(n)/(factorial(r)*factorial(n-r)))%1000000000+7;
        if(r>n) {
            result = 0;
        } else {
            result = (int) (factorial(n) / (factorial(r) * factorial(n - r)));
        }
        System.out.println(result);
        System.out.println(result % 1000000007);
    }
    private static long factorial(int n) {
        long fact =1;
        for(int i=1; i<=n; i++){
            fact = (fact*i)%1000000007;
        }
        System.out.println("fact : "+fact );
        return fact;
    }
}


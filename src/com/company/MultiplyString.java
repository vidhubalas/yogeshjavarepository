package com.company;

import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args) {
        String s1 = "505041410988047";
        String s2 = "3318139";
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        String result = String.valueOf(b1.multiply(b2));
        System.out.println(b1.multiply(b2));

    }
}

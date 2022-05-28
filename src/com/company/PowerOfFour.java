package com.company;

public class PowerOfFour {
    public static void main(String[] args) {
        long n = 1, rem = 0; // 4x4x4
        boolean power = false;
        while (n > 0) {
            rem = n % 4; //24%4=0
            if (rem != 0) {
                System.out.println("0");
                power = false;
                break;
            }
            n = n / 4; //24/4 =6
            if (n == 1) {
                System.out.println("1");
                power = true;
                break;
            }
        }
    }
}


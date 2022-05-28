package com.company;

public class Calc {
    public int add(int a,int b){
        System.out.println("Add integers");
        return a + b;

    }
    public float add(float a,float b){
        System.out.println("Add float");
        return a + b;
    }

    public int subtract(int a,int b){
        System.out.println("Subtract integers");
        return a - b;

    }
    public float subtract(float a,float b){
        System.out.println("Subtract float");
        return a - b;

    }

    public static void main(String[] args) {
        int i1=10,i2=5;
        float f1=10.0f,f2=7.876f;
        Calc c= new Calc();
        System.out.println(c.add(i1,i2));
        System.out.println(c.add(f1,f2));
        System.out.println(c.subtract(i1,i2));
        System.out.println(c.subtract(f1,f2));

    }
}

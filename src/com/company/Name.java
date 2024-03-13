package com.company;

import java.util.Scanner;

public class Name {
private String secretKey = "abc";
    private String key = "adobe_client_secret";
    String token = "1212121";
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String name1 = input.nextLine();
        System.out.println("Enter second name : ");
        String name2 = input.nextLine();
        concatinateName(name1, name2);
        concatinateName(args[0], args[1]);

    }

    private static void concatinateName(String name1, String name2) {
        System.out.println("Name : " + name1 + " " + name2);
    }
}

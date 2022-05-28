package com.company;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 10};
        int arr2[] = {3, 4, 5, 6, 11};
        int arr3[] = new int[20];
        System.out.println(doUnion(arr1, arr1.length,arr2, arr2.length));
        /*for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int k = arr1.length;
        int j = 0;
        boolean valuePresent = false;
        while (j < arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) {
                    valuePresent = true;
                    break;
                }
            }
            if (valuePresent == false)
                arr3[k++] = arr2[j];
            else
                valuePresent = false;
            j++;
        }
        System.out.println(k);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " , ");

        }*/
    }

    public static int doUnion(int a[], int n, int b[], int m) {
        HashSet union = new HashSet();
        if (n < m) {
            for (int i = 0; i < n; i++) {
                union.add(a[i]);
                union.add(b[i]);
            }
            for (int i = n; i < m; i++) {
                union.add(b[i]);
            }
        } else {
            for (int i = 0; i < m; i++) {
                union.add(a[i]);
                union.add(b[i]);
            }
            for (int i = m; i < n; i++) {
                union.add(a[i]);
            }
        }
        System.out.println(union);
        return union.size();
    }
}

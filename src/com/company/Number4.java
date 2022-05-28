package com.company;

public class Number4 {
    public static void main(String[] args) {
        int N=9,k=0,count=0,rem=0;
        boolean present = false;
        for(int i =1;i<=N;i++){
            k=i;
            present = false;
            while(k!=0){
                rem = k % 10;
                k = k / 10;
                if(rem==4){
                    present = true;
                }
            }
            if(present)
                count++;
        }
        System.out.println(count);
    }
}

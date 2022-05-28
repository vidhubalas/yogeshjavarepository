package com.company;

public class RepeatingCharacters {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        int p=0;
        boolean isPresent = false;
        char uc[] = new char[S.length()];
        int ucc[] = new int[S.length()];
        char arr[] = S.toCharArray();
        for(int i=0; i<S.length(); i++){
            for(int j=0; j<S.length(); j++){
            if(arr[i] == uc[j]) {
                ucc[j] = ucc[j] + 1;
                isPresent = true;
                break;
            }
            if(!isPresent){
                uc[j]=arr[i];
                ucc[j] = ucc[j] + 1;
                p = p+1;
            }
            }
        }
        for(int i=0; i<S.length(); i++){
            if(ucc[i]>1){
                System.out.println(uc[i]);
                break;
            }
        }
    }
}

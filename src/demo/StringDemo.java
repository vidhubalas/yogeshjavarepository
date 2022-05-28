package demo;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = new String("Hello World!");
        String str3 = "hello World!";
        System.out.println(str1);
        System.out.println(str2);
        if (str1==str3){ // compares the reference using '=='
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if (str1==str2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //
        if (str1!= null && str1.equalsIgnoreCase(str3)){ // Compare values using equals method
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if (str1!=null && str1.equals(str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

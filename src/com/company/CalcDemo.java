package com.company;

public class CalcDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator(10,2);
        Scientific s = new Scientific(10,3);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
        System.out.println(s.power());
    }
}
class Calculator{
  protected int a;
  protected int b;
  public Calculator(){
      System.out.println("I'm in default constructor");
  }
  public Calculator(int a, int b){
      System.out.println("Im in two argument constructor");
      this.a=a;
      this.b=b;
  }
  public int add(){ //function definition
      return a+b;
  }
    public int sub(){ //function definition
        return a-b;
    }
    public int mul(){ //function definition
        return a*b;
    }
    public int div(){ //function definition
        return a/b;
    }
 }

 class Scientific extends Calculator{
    public Scientific(int a, int b){
        super(a,b);
        System.out.println("In Two argument scientific");
    }
    public int power(){
        int pow=1;
        for(int i=0; i<b; i++){
            pow = a * pow;
        }
        return pow;
    }
 }


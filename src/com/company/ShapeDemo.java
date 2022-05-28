package com.company;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c = new Shape(10,2);
        System.out.println(c.area());
        System.out.println(c.circumference());
        System.out.println("-----------------SQUARE----------------");
        Square s = new Square(5,5);
        System.out.println(s.area());
        System.out.println(s.circumference());
        System.out.println("------------------RECTANGLE---------------");
        Rectangle r = new Rectangle(10,5);
        System.out.println(r.area());
        System.out.println(r.circumference());
    }
}
class Shape{
  protected int a;
  protected int b;
  public Shape(){
      System.out.println("I'm in default constructor");
  }
  public Shape(int a, int b){
      System.out.println("Im in two argument constructor");
      this.a=a;
      this.b=b;
  }
    public int area(){
        return a*b;
    }
    public int circumference() {
        return 2*(a+b);
    }

 }

 class Square extends Shape{
    public Square(int a, int b){
        super(a,b);
        System.out.println("In Two argument scientific");
    }
    public int area(){
        return a*a;
        }
    public int circumference(){
        return 4*a;
    }
    }

class Rectangle extends Shape{
    public Rectangle(int a, int b){
        super(a,b);
        System.out.println("In Two argument scientific");
    }
    public int area(){
        return a*b;
    }
    public int circumference(){
        return (2*a)+(2*b);
    }
}



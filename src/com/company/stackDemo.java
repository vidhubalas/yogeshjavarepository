package com.company;

public class stackDemo {
    private static int MAX = 10;
    private int array[] = new int[MAX];
    private int top = -1;

    public boolean isFull(){
     if (top == MAX)
        return true;
     return false;
    }
    public boolean isEmpty(){
        if (top == -1)
            return true;
        return false;
    }
    public void push(int a){
    array[++top] = a;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        } else{
            return array[top--];
        }
        return 0;
    }

    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(array[i] + " , " );
        }

    }

    public static void main(String[] args) {
        stackDemo s = new stackDemo();
        int i = 10;
        s.push(i);
        i = 20;
        s.push(i);
        s.printStack();
        System.out.println();
        System.out.println("Top value before : " + s.top );
        System.out.println("popped value from stack....." + s.pop());
        System.out.println("Top value after : " + s.top);
        System.out.println("popped value from stack....." + s.pop());
        System.out.println("popped value from stack....." + s.pop());
    }

}


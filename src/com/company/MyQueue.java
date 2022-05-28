package com.company;

public class MyQueue {
    private static int MAX = 10;
    private int [] queue = new int[MAX];
    private int front;
    private int rear;

    //int 10 F R
    //int 0 R
    public void addToQueue(int value){
        if(rear == MAX){
            System.out.println("Queue is full");
        }else{
            queue[rear++ ] = value;
        }
    }

    public int getElementFromQueue(){
        if (front == rear){
            System.out.println("Queue is empty");
        } else {
            int value = queue[front];
            queue[front] = -1;
            front++;
            return value;
        }
          return 0;
    }
    public int getElementFromQueue(int position){
        if (front == rear || position > MAX){
            System.out.println("Queue is empty or Invalid Position");
        } else {
            return queue[position];
        }
        return 0;
    }

    public void printQueue(){
        for(int i=0;i<rear;i++){
            System.out.println("Element i[ "+i+" ]" + queue[i]);
        }
}

public static void main(String args[]){
        MyQueue q1 = new MyQueue();
    q1.addToQueue(11);
    q1.addToQueue(22);
    q1.addToQueue(33);
    q1.addToQueue(55);
    q1.addToQueue(66);
    q1.addToQueue(77);
    q1.addToQueue(88);
    q1.addToQueue(99);
    q1.addToQueue(5);
    q1.addToQueue(43);
    q1.printQueue();
/*    System.out.println(" First " + q1.getElementFromQueue() );
    System.out.println(" Second " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    System.out.println(" Third " + q1.getElementFromQueue() );
    q1.printQueue();*/
    int position = 5;
    System.out.println(position + " : " + q1.getElementFromQueue(position));
     position = 1;
    System.out.println(position + " : " + q1.getElementFromQueue(position));
     position = 8;
    System.out.println(position + " : " + q1.getElementFromQueue(position));
     position = 0;
    System.out.println(position + " : " + q1.getElementFromQueue(position));
}
}

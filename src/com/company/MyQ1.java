package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyQ1 {
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

    public int deleteFromQueue(){
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

    public int getElementFromQueue(){
        if (front == rear){
            System.out.println("Queue is empty");
        } else {

            return queue[front++];
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

//OVERLOADING getelElementQueue is a overloaded function
    public void printQueue(){
        for(int i=0;i<rear;i++){
            System.out.println("Element i[ "+i+" ]" + queue[i]);
        }
    }

    public static void main(String args[]){

        MyQ1 q1 = new MyQ1();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int value;
            System.out.println("Enter number of values : ");
            int n = Integer.parseInt(reader.readLine());
            for(int i=0;i<n;i++) {
                System.out.println("Enter value : ");
                value = Integer.parseInt(reader.readLine());
                q1.addToQueue(value);
            }

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

            System.out.println("Deleted from Queue : " + q1.deleteFromQueue());
            System.out.println("Deleted from Queue : " + q1.deleteFromQueue());
            System.out.println("Deleted from Queue : " + q1.deleteFromQueue());

            System.out.println("Enter position to be get : ");
            int position = Integer.parseInt(reader.readLine());


            System.out.println(position + " : " + q1.getElementFromQueue(position));
            position = 1;
            System.out.println(position + " : " + q1.getElementFromQueue(position));
            position = 2;
            System.out.println(position + " : " + q1.getElementFromQueue(position));
            position = 0;
            System.out.println(position + " : " + q1.getElementFromQueue(position));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}


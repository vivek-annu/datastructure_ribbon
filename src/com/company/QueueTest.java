package com.company;

import java.util.Arrays;

public class QueueTest {

    private int ar[];
    private int top;
    private int capacity;

    public QueueTest() {
        capacity = 10;
        ar = new int[capacity];

    }

    public int getSize() {
        return top;
    }

    public int push(int data) {

        if (top < capacity) {
            ar[top] = data;
        } else {


            capacity = capacity * 2;
            int newAr[] = new int[capacity];
            for (int i = 0; i < ar.length; i++) {
                newAr[i] = ar[i];
            }
            newAr[top] = data;
            ar = newAr;
        }
        top++;
        return data;
    }

    public void printData() {
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {


        QueueTest stack = new QueueTest();
        stack.printData();

        for (int i = 0; i <10; i++) {


            stack.push(88 + i);


        }
        stack.printData();
        ;
        System.out.println(stack.peek());
        stack.printData();
        System.out.println(stack.pop());
       stack.printData();
        System.out.println(stack.pop());
        stack.printData();



    }

    public int peek(){
        if(top>0){
            return ar[0];
        }else {
            throw new RuntimeException("Stack doesn't have any data");
        }
    }



    public int pop(){
        if(top>0){
            int data= ar[0];
            for (int i = 1; i <ar.length ; i++) {
                ar[i-1]=ar[i];

            }
            ar[ar.length-1]=0;
            top--;

            return data;


        }else {
            throw new RuntimeException("Stack doesn't have any data");
        }
    }

}

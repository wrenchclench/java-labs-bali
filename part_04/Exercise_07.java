package part_04;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

public class Exercise_07 {
    private int top;
    int size;
    char[] stack ;

    public int StackMethods(int arraySize){
        size=arraySize;
        stack= new char[size];
        top=-1;
        return arraySize;
    }

    public void push(char value){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        else{

            top=top+1;
            stack[top]=value;
        }
    }

    public void pop(){
        if(!isEmpty())
            top=top-1;
        else{
            System.out.println("Stack is empty");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
}

class StackDemo {
    public static void main(String[] args) {
        System.out.println();

    }
}
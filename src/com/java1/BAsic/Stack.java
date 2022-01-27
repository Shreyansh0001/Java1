//push,pop,isempty,isfull,printstack

package com.java1.BAsic;

class Stack{
    int arr[];
    int capacity;
    int top;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void sum(){
        System.out.println("Sum is another test");
    }


    public void push(int x){
        if (isFull()){
            System.out.println("Stack Full");
            System.exit(1);
        }
        System.out.println("INSERTING " + x + " IN THE STACK");
        arr[++top] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main (String args[])
    {
        Stack stack = new Stack(3);
        stack.push(45);
        stack.push(65);
        stack.push(34);

        stack.printStack();

        stack.pop();
        System.out.println("");
        stack.printStack();
    }

}


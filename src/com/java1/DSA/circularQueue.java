package com.java1.DSA;

public class circularQueue {

    int SIZE = 5;
    int front, rear;
    int items[] = new int[SIZE];

    circularQueue(){
        front = -1;
        rear = -1;
    }

    boolean isFull()
    {
        if(front == 0 && rear == SIZE -1)
        {
            return true;
        }
        if(front == rear + 1 ){
            return true;
        }
        else
        return false;
    }

    boolean isEmpty()
    {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else
        {
            if (front == -1)
                front = 0;
            rear = (rear + 1)% SIZE;
            items[rear] = x;
            System.out.println("Inserted " + x);
        }
    }



    int dequeue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            element = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }




    void display()
    {
        int i;
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Front -> " + front);
            System.out.println("Queue Contents");
            for(i = front;i != rear; i = (i+1) % SIZE){
                System.out.println(items[i]);
            }
            System.out.println(items[i]);

            /* explanation for the for loop:
             Since the rear value is changing and there is a situation possible where front is 3 and rear is 2
             So we are incrementing the "i" value with the form: i = (i+1)%SIZE upto a point where i is not equal to rear
             When i value is equal to rear we will exit the loop and the print the value at i pos which is equal to rear
             separately.
            */

            System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String args[]){
        circularQueue cQ = new circularQueue();
        cQ.dequeue();

        cQ.enqueue(45);
        cQ.enqueue(4);
        cQ.enqueue(53);
        cQ.enqueue(475);
        cQ.enqueue(47);

        cQ.enqueue(6);

        cQ.display();

        System.out.println("Item removed ->" + cQ.dequeue());

        cQ.display();
        cQ.enqueue(7);
        cQ.display();

        cQ.enqueue(8);
    }

}

package com.java1.BAsic;

//enqueue, dequeue, isempty, isfull, peak, print

public class queue {
    int size =5;
    int que[] = new int[size];
    int front,rear;

    queue(){
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
       if ( front ==0 && rear == (size -1))
           return true;
       else
       return false;
    }

    public boolean isEmpty(){
        if (front == -1)
            return true;
        else
            return false;
    }

    public void enqueue(int x){
        if (isFull()){
            System.out.println("Queue is Full");
        }
        else{
            if (front == -1)
                front = 0;
            que[++rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    public int dequeue(){
        int x;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            x = que[front];
            if (front >= rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
            }
            System.out.println("Deleted -> " + x);
            return x;
        }
    }

    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(que[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String args[]){
        queue q = new queue();
        Stack s = new Stack(2);
        q.dequeue();

        // enQueue 5 elements
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(8);
        q.enqueue(5);

        // 6th element can't be added to because the queue is full
        q.enqueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.dequeue();

        // Now we have just 4 elements
        q.display();
    }
}

/*
* To Enqueue use this formular to get th rear (rear = (front + count) % capacity)
* To Dequeue use this formula to get the new front (front = (front + 1) % capacity)
* */

public class circularArrayQueue<T> implements MyQueue<T> {

    private static int maxSize = 10;
    private int [] Items;
    private int rear;
    private int front;
    private int count;

    public circularArrayQueue(){
        this.front = -1; // points to no valid index initially
        this.rear = -1;
        this.count = 0;
        this.Items = new T[maxSize];
    }

    public boolean isEmpty(){ return (this.count ==0); }
    public boolean isFull(){ return (this.count == this.maxSize); }
    public int calucateRear(){ return ((front + count) % maxSize); }
    public int calucateFront(){ return ((front + 1) % maxSize); }

    public void enqueue(T e){
        if(!(isFull())){
            int index = calucateRear();
            this.Items[index] = e;
            this.count++;
        }
    }

    public T dequeue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return;
        } else {
            int index = calucateFront();
            T dataValue = this.Items[index];
            this.count--;

            if (count == 1){
                front = rear = -1;
            } else {
                front--;
            }
            return  dataValue;
        }
    }

    public T queueFront() {
        if (!(isEmpty())){
            return (this.Items[front]);
        }
    }

    public T queueRear(){
        if(!(isEmpty()){
            return this.Items[rear];
        }
    }

    public void ShowData () { 
        if (isEmpty()) {
            System.out.println("\nQueue is Empty");
        } else {
            if (this.front == this.rear){
                System.out.println(this.Items[front]);
            } else {
                for (int i = front; i <= rear; i++)
                    System.out.print(this.Items[i] +"\t");
            }
        }
    }
}
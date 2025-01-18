/*
* To Enqueue use this formular to get th rear (rear = (front + count) % capacity)
* To Dequeue use this formula to get the new front (front = (front + 1) % capacity)
* */

public class CircularArrayQueue<T> implements QueueInterface<T> {

    // private int maxSize = 10;
    private T [] Items;
    private int size;
    private int capacity = 10;;
    private int front;

    public CircularArrayQueue(){
        this.front = -1; // points to no valid index initially
        this.size = 0;
    }

    public boolean isEmpty(){ return (this.size ==0); }
    public boolean isFull(){ return (this.size == this.capacity); }

    // utility functions
    public int calculateRearPosition(){ return ((this.front + this.size) % this.capacity); }
    public int calculateFrontPosition(){ return ((this.front + 1) % this.capacity); }

    public void Enqueue(T element){
        if(!(isFull())){
            int index = calculateRearPosition();
            this.Items[index] = element;
            this.size++;
        }
    }

    public void Dequeue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
        } else {
            if (this.size == 1){
                this.front = this.size = -1;
            } else {
                int frontIndex = calculateFrontPosition();
                this.front = frontIndex;
            }
            this.size--;
        }
    }

    public T Front() {
        if (!(isEmpty()))
            return (this.Items[calculateFrontPosition()]);
        return null;
    }

    public T Rear(){
        if(!(isEmpty()))
            return this.Items[calculateRearPosition()];
        return null;
    }
}
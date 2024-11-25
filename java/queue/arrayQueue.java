package data_structures_and_algorithms.java.queue;

public class arrayQueue<T> implements MyQueue<T> {

    static int maxSize = 20;
    static int frontIndex = 0;
    private int size;
    private Item[];

    void arrayQueue(){
        this.size = 0;
        this.Item[maxSize];
    }
    public isEmpty(){return ((this.size == 0) && (frontIndex == 0));}
    public isFull(){return this.size == this.maxSize;}
    public void enqueue(T e){
        if (!(this.isFull()))
            this.Item[this.size] = e;
    }
    public void dequeue(){
        if (!(this.isEmpty())){
            for (int i=1; i < this.size; i++){
                this.Item[i-1] = this.Item[i];
            }
            this.size--;
        }
    }
    public T front(){
        if !(this.isEmpty())
            return this.Item[frontIndex]
    }
}

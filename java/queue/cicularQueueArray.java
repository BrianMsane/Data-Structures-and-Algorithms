
public class circularArrayQueue<T> implements MyQueue<T> {

    static int maxSize = 10;
    private int [] Items;
    private int rear;
    private int front;
    private int count;

    public circularArrayQueue(){
        this.front = -1;
        this.rear = -1;
        this.count = 0;
        this.Items = new Object[maxSize];
    }

    public boolean isEmpty(){return (this.count ==0;)}
    public boolean isFull(){return (this.count = this.maxSize);}

    public void enqueue(T e){
        if ((front == 0 && rear == maxSize-1) || (rear == (front -1) % (maxSize-1))){
            System.out.println("The queue is full");
        } else if(front == -1){
            front = rear = 0;
            Items[rear] = e;
            count++;
        } else if(rear == maxSize-1 && front != 0){
            rear = 0;
            Items[rear] = e;
            count++;
        } else{
            rear++;
            Items[rear] = e;
        }
    }

    public void dequeue(){
        if (front = -1){
            System.out.println("The queue is empty");
        }
        int data = Items[front];
        Items[front] = -1;
        if (front == rear){
            front = -1;
            rear = -1;
        } else if(front == maxSize -1){
            front = 0;
        } else {
            front++;
        }
    }

    public T queueFront(){
        if (this.count > 0){
            if (this.front == -1)
                return (this.Items[0])
            else
                return (this.Items[front]);
        }
        return -1;
    }

    public void ShowData () { 
        if (Front == -1) {
            System.out.println("\nQueue is Empty");
            return; 
        } 
        System.out.println("\nElements in Circular Queue are: ");
        if (Rear >= Front) {
            for (int i = Front; i <= Rear; i++)
                System.out.print(Items[i] +"\t"); 
        } else { 
            for (int i = Front; i < Count; i++) 
            System.out.print(Items[i] +"\t"); 
            for (int i = 0; i <= Rear; i++) 
            System.out.print(Items[i]+"\t"); 
        } 
    }
}
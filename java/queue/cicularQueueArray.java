
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
        this.Items = new T[maxSize];
    }

    public boolean isEmpty(){return (this.count ==0;)}
    public boolean isFull(){return (this.count == this.maxSize);}

    public void enqueue(T e){
        if ((front == 0 && rear == maxSize-1) || (rear == (front -1) % (maxSize-1))){
            System.out.println("The queue is full");
        } else if(front == -1){
            // edge cases where the array is empty
            // set front and rear to point to 0 and enqueue the element in front 
            // then increment the count
            front = rear = 0;
            Items[rear] = e;
            count++;
        } else if(rear == maxSize-1 && front != 0){
            // if the rear is at the end but the front is not in the first index
            // set the rear to 0 and enqueue the element there
            rear = 0;
            Items[rear] = e;
            count++;
        } else {
            rear++;
            Items[rear] = e;
        }
    }

    public void dequeue(){
        if (front == -1){
            System.out.println("The queue is empty");
            return;
        }
        int data = Items[front];
        Items[front] = -1;
        if (front == rear){
            // they are both pointing to the first element
            // set the array to empty
            front = rear = -1;
        } else if (front == maxSize -1){
            // front is at the end of the array, wrap it to 0
            front = 0;
        } else {
            // increment
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
    }

    public void ShowData () { 
        if (Front == -1) {
            System.out.println("\nQueue is Empty");
            return; 
        } 
        System.out.println("\nElements in Circular Queue are: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++)
                System.out.print(Items[i] +"\t"); 
        } else { 
            for (int i = front; i < count; i++) 
            System.out.print(Items[i] +"\t"); 
            for (int i = 0; i <= rear; i++) 
            System.out.print(Items[i]+"\t"); 
        } 
    }
}
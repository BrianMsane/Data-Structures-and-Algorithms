public class LinkedQueue<T> implements QueueInterface<T> {

    class Node{
        T data;
        Node next;

        public Node(){}
        public Node(T data){this.data = data;}
        public Node(T data, Node link){
            this.data = data;
            this.next = link;
        }
    }

    Node front;
    Node rear;

    public boolean isEmpty() {return (this.front == null && this.rear == null); }
    public boolean isFull() {return false;}

    public void Enqueue(T element) {
        Node newNode = new Node(element);
        if(isEmpty()){
            this.front = this.rear = newNode;
        } else {
            this.rear = newNode;
        }
    }

    public void Dequeue() {
        if(isEmpty()){
            Node currFront = this.front;
            this.front = currFront.next;
        }
    }

    public T Front() {
        if(!isEmpty())
            return this.front.data;
        return null;
    }

    public T Rear() {
        if(!isEmpty())
            return this.rear.data;
        return null;
    }
}

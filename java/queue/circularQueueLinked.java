
class CircularQueueLinked<T> implements QueueInterface<T> {

    class Node {
        private T data;
        private Node next;

        public Node(){}
        public Node(T newdata) {
            data = newdata;
            next = null;
        }
    }

    private Node front, rear;

    public CircularQueueLinked() { front = rear = null; }
    public boolean isFull(){ return false; }
    public boolean isEmpty(){ return (this.front == null && this.rear == null); }

    public void Enqueue(T value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
            this.rear.next = this.front;
        }
    }

    public void Dequeue() {
        if (isEmpty()){
           System.out.println("The queue is empty so you cannot dequeue it!");
        } else {
            Node currentFront = this.front;
            this.front = currentFront.next;
        }
    }

    public T Front() {
        if (!(this.front == null))
            return this.front.data;
        return null;
    }

    public T Rear() {
        if (!(this.rear == null))
            return this.rear.data;
        return null;
    }
}

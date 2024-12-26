
class circularQueueLinked<T> {

    class Node<T> {
        private T data;
        private Node next;

        public Node(T newdata) {
            data = newdata;
            next = null;
        }
    }

    private Node front, rear;

    public circularQueueLinked() { front = rear = null; }
    public boolean isFull(){ return false; } // never gets full, theoretically
    public boolean isEmpty(){ return (this.front == null && this.rear == null); }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
            this.rear.next = this.front;
        }
    }

    public T deQueue() {
        if (this.front == null){
            return -1;
        } else if (this.front == this.rear){

            value = this.front.data;
            this.front = this.rear = null;
            return value;
        } else {
            Node temp = this.front;
            value = temp.data;
            this.front = this.front.next;
            this.rear.next = this.front;
            return value;
        }
    }

    public T getFront() {
        if (this.front == null) {
            return -1;
        }
        return this.front.data;
    }

    public T getRear() {
        if (rear == null)
            return -1;
        return rear.data;
    }

    public void showData() {
        if (this.front == null) {
            return;
        } else {
            current = this.front;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != this.front);
            System.out.println();
        }
    }
}


class DemoApp {
    public static void main(String[] args) {
        Queue q<Integer> = new Queue();

        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        enQueue(q, 20);

        System.out.println("Front value = " + front(q));
        System.out.println("Rear value = " + rear(q));

        printQueue(q);

        System.out.println("Deleted value = " + deQueue(q));
        System.out.println("Deleted value = " + deQueue(q));
        printQueue(q);
    }
}
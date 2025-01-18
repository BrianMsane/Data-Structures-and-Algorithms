// package data_structures_and_algorithms.java.stack;


public class LinkedStack<T> implements StackInterface<T> {

    public class Node {
        private T data;
        private Node next;
    
        // constructor overloading
        public Node(){}
        public Node (T data, Node next){
            this.data = data;
            this.next = next;
        }
        public Node (T data){
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    public  LinkedStack(){ this.top = null;}
    public boolean isEmpty(){return (this.top == null);}
    public boolean isFull(){return false;} // never full, theoretically

    public void Push(T element){
        Node newNode = new Node(element);
        if(isEmpty()){
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    public T Pop(){
        if (!(this.isEmpty())){
            var currentTop = this.top;
            this.top = this.top.next;
            return currentTop.data;
        }
        return null;
    }

    public void showData(){
        if(!(isEmpty())){
            var current = this.top;
            while (current != null){
                System.out.println("\t" + current.data);
                current = current.next;
            }
            System.out.println();
        }
    }

    public T Top(){
        if(!isEmpty())
            return this.top.data;
        return null;
    }
}

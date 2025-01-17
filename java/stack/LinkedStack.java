package data_structures_and_algorithms.java.stack;


public class LinkedStack<T> implements StackInterface<T> {

    public class Node<T> {
        private T data;
        private Node<T> next;
    
        // constructor overloading
        public Node(){}
        public Node (T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        public Node (T data){
            this.data = data;
            this.next = null;
        }
    }

    Node<T> top;
    
    public  LinkedStack(){ top = null;}
    public boolean isEmpty(){return (top == null);}
    public boolean isFull(){return false;} // never full, theoretically

    public void Push(T e){
        Node<T> newNode = new Node<T>(e);
        if(isEmpty()){
            top = newNode;
        } else {
            newNode = top;
            top = newNode;
        }
    }

    public void Pop(){
        if (!(this.isEmpty()))
            Node<T> top = this.top;
            this.top = this.top.next;
            return top;
    }

    public void showData(){
        if(!(isEmpty())){
            current = this.top;
            while (current != null){
                System.out.println("\t" + current.data);
                current = current.next;
            }
            System.out.println();
        }
    }
    public T Top(){
        if(!(isEmpty()))
            return this.top.data;
    }
}

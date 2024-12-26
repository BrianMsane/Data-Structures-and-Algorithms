package data_structures_and_algorithms.java.stack;


public class Node<T> {
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

public class myLinkedStack<T> implements MyStack<T> {
    
    public linkedStack(){top = null;}
    public boolean isEmpty(return top == null;)
    public boolean isFull(return false;) // never full, theoretically

    public void Push(T e){
        Node newNode<T> = new Node(e);
        if(isEmpty()){
            top = newNode;
        } else {
            newNode = top;
            top = newNode;
        }
    }

    public void Pop(){
        if (!(this.isEmpty()))
            Node top = this.top;
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
            return this.head.data;
    }
}


public class DemoApp{
    public static void main(){
        myLinkedStack S<String> = new myLinkedStack();
        S.Push("Bruno");
        S.Push("Garnarcho");
        S.Push("Maguire");
        S.Push("Ten Hag");
        S.Pop();
        S.showData();
    }
}
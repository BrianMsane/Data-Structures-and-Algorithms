package data_structures_and_algorithms.java.stack;


public class Node<T> {
    T data;
    Node next;

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

public class linkedStack<T> implements MyStack<T> {
    
    public linkedStack(){top = null;}
    public boolean isEmpty(return top == null;)
    public boolean isFull(return false;)
    public void Push(T e){
        Node<T> newNode = new Node(e, top);
        top = newNode;
    }
    public void Pop(){
        if (!(this.isEmpty()))
            this.top = this.top.next;
    }
    public void showData(){
        while (this.top != null){
            System.out.println("\t" + this.top.data);
            this.top = this.top.next;
        }
        System.out.println();
    }
}


public class DemoApp{
    public static void main(){
        MyStack<String> S = new MyArrayStack();
        S.Push("Bruno");
        S.Push("Garnarcho");
        S.Push("Maguire");
        S.Push("Ten Hag");
        S.Pop();
        S.showData();
    }
}
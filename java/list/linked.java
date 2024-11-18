package data_structures_and_algorithms.java.list;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}


public class linkedList<T> implements Innerlist<T> {
    public static void main(String[] args) {
        
    }

    public MyArrayList(){head = null;}


    @Override
    public boolean isEmpty() {
        return (head == null); // when the head still points to nothing, it is empty
    }

    public boolean isFull(){
        return false; // never gets full, theoritically
    }

    @Override
    public void Insert(T e) {
        Node<T> NewNode = new Node (e, head);
        head = NewNode;
    }

    @Override
    public void Delete(T e) {
        return;
    }

    @Override
    public void showData() {
        return;
    }
}

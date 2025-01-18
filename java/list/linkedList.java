// package data_structures_and_algorithms.java.list;


public class LinkedList<T> implements ListTemplate<T> {

    // to get access to private attributes, it should be inside the class of interest
    public class Node {
        private T data;
        private Node next;

        // constructor overloading
        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void linkedList(){ this.head = null; }
    public boolean isEmpty() { return (this.head == null); }
    public boolean isFull(){ return false; } // never gets full, theoretically

    public int Find(T e){
        // implements sequential or linear search
        // use a different node to traverse list so you cannot 
        // lose the previous node each time you progress forward

        if (!isEmpty()){
            int count = 0;
            Node current = this.head;
            while (current != null){
                if(current.data == e)
                    return count;
                count += 1;
                current = current.next;
            }
        }
        return -1;
    }

    public void Insert(T element){
        Node newNode = new Node(element);
        if(isEmpty()){
            this.head =  newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void Delete(T element) {
        Node current = this.head;
        Node prevNode = null;
        while(current != null){
            prevNode = current;
            if (current.data == element)
                prevNode.next = current.next;
            current = current.next;
        }
    }

    public int Length(){
        if (!isEmpty()){
            int count = 0;
            Node current = this.head;
            while (current != null){
                count++;
                current = current.next;
            }
            return count;
        }
        return -1;
    }

    public T Access(int index){
        int count = 0;
        if(!isEmpty()){
            Node current = this.head;
            while(current != null){
                if(count == index)
                    return current.data;
                count++;
                current = current.next;
            }
        }
        return null;
    }

    public void Sort(String listType){
        // sorting elements or a linked list
    }

    public void showData() {
        Node currNode = this.head;
        while (currNode != null){
            System.out.print("\t"+ currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }
}

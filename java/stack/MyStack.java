package data_structures_and_algorithms.java.stack;

public class MyStack<T> implements MyStack<T> {
    
    static int maxSize = 15;
    private int size;
    private T[] Item;

    // constructor overloading
    void MyStack(){
        this.size = 0;
        this.Item = (T[]) new Object[maxsize];
    }
    void MyStack(int initialSize){
        this.maxSize = initialSize;
        this.size = 0;
        this.Item = (T[]) new Object[initialSize];
    }

    public boolean isEmpty(){return this.size == 0;}
    public boolean isFull(){return this.size == this.maxSize;}

    public T Top(){
        return this.Item[this.size - 1];
    }

    public void Pop(){
        if (!(isEmpty()))
            this.size--;
    }

    public void Push(T e){
        if (!(isFull())){
            this.Item[this.size] = e;
            this.size++;
        }
    }

    public void showData(){
        if (!(isEmpty())){
            for (int i = 0; i < this.size; i++){
                System.out.println("\t" + this.Item[i]);
            }
        }
        System.out.println();
    }
}


public class Demo{
    public static void main(String [] args){
        MyStack<Integer> S = new MyArrayStack();
        S.Push(8);
        S.Push(10);
        S.showData();
        S.isFull();
    }
}
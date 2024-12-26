package data_structures_and_algorithms.java.stack;

public class myArrayStack<T> implements stack<T> {
    
    private int maxSize = 15;
    private int size;
    private T[] Items;

    // constructor overloading
    void MyStack(){
        this.size = 0;
        this.Items = T[] new Object[maxsize];
    }
    void MyStack(int initialSize){
        this.maxSize = initialSize;
        this.size = 0;
        this.Items = (T[]) new Object[initialSize];
    }

    public boolean isEmpty(){return this.size == 0;}
    public boolean isFull(){return this.size == this.maxSize;}

    public T Top(){
        return this.Items[this.size - 1];
    }

    public void Pop(){
        if (!(isEmpty())){
            T top = this.Items[--this.size]; // pre-decrement operator :D
            this.size--;
            return top;
        }
    }

    public void Push(T e){
        if (!(isFull())){
            this.Items[this.size] = e;
            this.size++;
        }
    }

    public void showData(){
        if (!(isEmpty())){
            for (int i = 0; i < this.size; i++){
                System.out.println("\t" + this.Items[i]);
            }
        }
        System.out.println();
    }


public class Demo{
    public static void main(String [] args){
        MyStack S<Integer> = new myArrayStack();
        if (S.isEmpty())
            System.out.println("The stack is empty initially!");
        S.Push(8);
        S.Push(10);
        S.showData();
        S.isFull();
    }
}
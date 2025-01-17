
public class ArrayStack<T> implements StackInterface<T> {
    
    private int maxSize = 15;
    private int size;
    private T[] Items;

    // constructor overloading
    public ArrayStack(){
        this.size = 0;
    }

    public boolean isEmpty(){return this.size == 0;}
    public boolean isFull(){return this.size == this.maxSize;}

    public T Top(){
        return this.Items[this.size - 1];
    }

    public void Pop(){
        if (!(isEmpty())){
            this.size--;
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
}

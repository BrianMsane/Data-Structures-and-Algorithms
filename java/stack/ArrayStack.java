
public class ArrayStack<T> implements StackInterface<T> {
    
    private int maxSize = 15;
    private int size;
    private T[] Items;

    // constructor overloading
    public ArrayStack(){ this.size = 0; }
    public boolean isEmpty(){return this.size == 0;}
    public boolean isFull(){return this.size == this.maxSize;}

    public T Top(){
        if(!isEmpty())
            return this.Items[this.size -1];
        return null;
    }

    public T Pop(){
        if (!(isEmpty())){
            T currrentTop = this.Top();
            this.size--;
            return currrentTop;
        }
        return null;
    }

    public void Push(T element){
        if (!(isFull())){
            this.Items[this.size++] = element;
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


public class ArrayQueue<T> implements QueueInterface<T> {

    private int maxSize = 20;
    // private int frontIndex = 0;
    private int size;
    private T [] Items;

    public ArrayQueue(){ this.size = 0; }
    public boolean isEmpty(){ return (this.size == 0); }
    public boolean isFull(){ return (this.size == this.maxSize); }

    public void Enqueue(T element){
        if (!(this.isFull()))
            this.Items[this.size] = element;
    }

    public void Dequeue(){
        if (!(this.isEmpty())){
            for (int i = 1; i < this.size; i++){
                this.Items[i - 1] = this.Items[i];
            }
            this.size--;
        }
    }

    public T Front(){
        if (!isEmpty())
            return this.Items[0];
        return null;
    }

    public T Rear(){
        if(!isEmpty())
            return this.Items[this.size -1];
        return null;
    }
}

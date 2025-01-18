
public class ArrayList<T> implements ListTemplate<T>{
    private int maxSize = 15;
    private int size;
    private T[] Items;

    public ArrayList (){this.size = 0; }
    public boolean isFull(){ return this.size == maxSize; }
    public boolean isEmpty(){ return this.size == 0; }
    public int Length(){ return this.size; }
    public T Access(int index){ return (this.Items[index]); }

    public int Find(T element){
        // traverse the list and find the element matching the given element,
        // return its index position
        if (!(this.isEmpty())) {
            int index = 0;
            while (index < this.size) {
                if (this.Items[index] == element)
                    return index;
                index++;
            }
        }
        return -1;
    }

    public void Insert(T e) {
        // insert at the next available index if the array is not yet full
        if (!(this.isFull())){
            this.Items[this.size++] = e; // post increment operator :D
        }
    }

    public void Delete(T element) {
        if (!(this.isEmpty())){
            int index = 0;
            while (index < this.size){
                if (this.Items[index] == element){
                    swap(this.Items, index, this.size - 1);
                    this.size--;
                } else {
                    index++;
                }
            }
        }
    }

    public void Sort(String listType){
        // implement a sorting algorithms
        if (listType == "unordered" || listType == "Unordered"){
            // implement bubble sored
            for (int i = 0; i < this.Items.length - 1; i++) {
                for (int j = 0; j < this.Items.length - i; j++){
                    if (this.Items[j] > this.Items[j + 1]){ // assumption is that we'll be working with int
                        swap(this.Items, j, j+1);
                    }
                }
            }
        } else {
            return; // The assumption is that the list is sorted already for ordered lists
        }
    }

    public void showData() {
        for (int index =0; index < this.size; index++){
            System.out.println(this.Items[index]);
        }
    }

    private void swap(T[] list, int i, int j){
        // utility function
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
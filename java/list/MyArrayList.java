package data_structures_and_algorithms.java.list;

public class MyArrayList<T> implements Innerlist{
    private int maxSize = 15;
    private int size;
    private T[] Items;

    // constructor overloading
    public MyArrayList (){
        this.size = 0;
        this.Itemss = new T[maxSize];
    }
    public MyArrayList (int capacity){
        this.maxSize = capacity;
        this.size = 0;
        this.Items = new T[capacity];
    }


    public boolean isFull(){ return this.size == maxSize; }
    public boolean isEmpty(){ return this.size == 0; }

    private void swap(int i, int j){
        T temp = this.Item[i];
        this.Items[i] = this.Items[j];
        this.Items[j] = temp;
    }

    public void addFirst(T e){
        current = this.Items[0];
        this.Items[0] = e;
        Insert(current);
    }

    public int find(element){
        // traverse the list and find the element matching the given element,
        // return its index position
        if (!(this.isEmpty())) {
            int index = 0;
            while (index < this.size) {
                if (this.Items[index] == element) {
                    return index;
                } else {
                    index++;
                }
            }
        }
        return -1;
    }

    public T access(index){
        return (this.Items[index]);
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
                    swap(index, this.size -1);
                    this.size--;
                } else{
                    index++;
                }
        }
    }

    public void showData() {
        for (int index =0; index < this.size; index++){
            System.out.print('\t' + this.Items[index]);
        }
        System.out.println();
        }
    }

    public class UOListDemoApp {
    public static void main(String[] args) {
        MyArrayList L<String> = new MyArrayList(); 
        L.Insert ("musa"); 
        L.Insert ("Lucky"); 
        L.Insert ("jane"); 
        L.ShowData (); 
        L.Delete("Lucky"); 
        L.ShowData (); 
        L.Delete ("musa"); 
        L.ShowData (); 

        var list = new MyArrayList(); // let java detect the type, and we can store any data type
        list.Insert(8);
        list.Insert("Bruno Fenarndes");
        if list.isEmpty()
            list.Insert("Maguire");
        list.delete(8);
        list.showData();
    }
}
package data_structures_and_algorithms.java.list;

public class MyArrayList implements Innerlist{
    static int maxSize = 15;
    private int size;
    private String[] Item;

    public MyArrayList (){
        this.size=0;
        this.Item = new String[maxSize];
    }
    
    public boolean isFull(){
        return this.size == maxSize;
    }

    private void swap(int i, int j){
        String temp = this.Item[i];
        this.Item[i] = this.Item[j];
        this.Item[j] = temp;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void Insert(String e) {
        if (!(this.isFull())){
            this.Item[this.size] = e;
            this.size++;
        }
    }

    @Override
    public void Delete(String e) {
        int index=0;
        if (!(this.isEmpty())){
            while (index < this.size && this.Item[index] != e){
                index++;
            }
            if (this.Item[index] == e && index <= this.size-1){
                swap(index, this.size -1);
                this.size--;
            }
        }
    }
    
    @Override
    public void showData() {
        for (int index =0; index < this.size; index++){
            System.out.println('\t' + this.Item[index]);
            System.out.println();
        }
    }
}


public class UOListDemoApp {
    public static void main(String[] args) {
        MyList L = new MyArrayList(); 
        L.Insert ("musa"); 
        L.Insert ("Lucky"); 
        L.Insert ("jane"); 
        L.ShowData (); 
        L.Delete("Lucky"); 
        L.ShowData (); 
        L.Delete ("musa"); 
        L.ShowData (); 
    }
}
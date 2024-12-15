// used to store elements sequentially assuming contiguous memory location
// the array mapping function makes it super fast to access elements
// We need to know ahead of time time the number of elements to store and once we declare it, we can't change the size (static)

/*
Operations
==========

1. Instantiate an array L     O(1)
2. L.Insert(e)                O(n)
3. L.Delete(e)                O(n)
4. L.Find(e)                  O(n)
5. L.isEmpty()                O(1)
6. L.isFull()                 O(1)
*/

public class Main{
    public static void main(String[] args){
        int size = 7;
        int[] numbers = new int[size]; // all items initialized to 0
        numbers[0], numbers[1] = 8, 9;
        int secondNumbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));
    }
}


private class myArray<T> {
    private int[] items;
    private int count = 0;

    public myArray(int length){items = new items[length];}
    public int length(){return count;}
    public boolean isFull(){ return (count==items.length);}
    public boolean isEmpty(){ return count == 0; }

    public void insert(T e){
        if (isEmpty()){
           int[] newItems = new int[count * 2];
           for (int i=0; i < count; i++){
                newItems[i] = items[i];
           }
           items = newItems;
           items[count] = e;
        } else {
            items[count++] = e; // post-increment
        }
    }

    public void removeAt(int index){
        // delete utility function
        if (index < count && index > 0){
            temp = items[index];
            items[index] = items[count];
            items[count] = temp;
            count--;
        }
    }

    public void delete(T e){
        for (int i=0; i<count; i++){
            if (items[i] == e){
                removeAt(i)
            }
        }
    }

    public T find(T item){
        int looper = 0;
        while (looper <= looper){
            if (items[looper] == item){
                return looper;
            }
            lopper++;
        }
        return -1;
    }

    public void print(){
        for (int i=0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}

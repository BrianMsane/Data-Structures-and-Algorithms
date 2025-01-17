#include <iostream>
#include "Node.h"
#include "Utils.h"

template <class T>
class LinkedList {
    private:
        Node<T>* head;

    public:
        LinkedList(): head(nullptr) {}

        bool isFull(){ return false; s}
        bool isEmpty{ return head == nullptr;}

        void traversal(){
            Node current = head;
            while(current != nullptr){
                std::cout << current.data;
                current = current.link;
            }
            std::cout << std::endl;
        }

        void insert(T element){
            // inserts at the first node
            newNode = new Node(element);
            if (isEmpty){
                head = newNode;
            } else {
                newNode.link = head.link;
                head = newNode;
            }
        }

        void insertAfterElement(T element, T given){
            // inserts after a given value
            Node newNode = new Node(element);
            if (isEmpty){
                return;
            } else {
                current = head;
                while(head != nullptr){
                    if (current.data == given){
                        nextAfterCurrent = current.link;
                        current.link = newNode;
                        newNode.link = nextAfterCurrent;
                    }
                    current = current.link;
                }
            }
        }

        void insertEnd(T element){
            // inserts at the end of the node
            Node newNode = new Node(element);
            Node current = head;
            while(current != nullptr){
                if (current.link == nullptr){
                    current.link = newNode;
                } else {
                    current = current.link;
                }
            }
        }

        void sort(){
            // sort elements of a linked list
        }

        int search(T element){
            if (!isEmpty()){
                Node current = head;
                int index = 0;
                while(current != nullptr){
                    if (current.data == element){
                        return index;
                    }
                    index++;
                }
            }
        }

        T access(int index){
            current = head;
            int currentIndex = 0;
            while(current != null){
               currentIndex += 1;
               if (index == currentIndex) {
                    return current.data;
               }
            }
        }

        void contat(LinkedList other){

        }
};



template <class T>
class ArrayList{
    private:
        int maxSize = 15;
        int size = 0;
        int array[maxSize];
    public:
        ArrayList(){}

        bool isFull(){ return size == maxSize;}
        bool isEmpty(){ return size == 0;}

        void traversal(){
            int index = 0;
            while (index < size){
                std::cout << array[index];
                index++;
            }
            std::cout << std::endl;
        }

        void insert(T element){
            // inserts at next available position
            if(!isFull()){
                array[size] = element;
            }
        }

        void insertFirst(T element){
            if (!isFull()){
                array[size] = element;
                swapList(array,  array[0], array[size])
            }
        }

        void insertAfterElement(T element, T after){
            int index = 0;
            while (index < size){
                if (array[index] == after){
                    array[index + 1] = element;
                    // shift the elements
                    for (int i = index; index + 1 < size; index++){
                        array[i + 1] = array[i];
                    }
                }
            }
        }

};
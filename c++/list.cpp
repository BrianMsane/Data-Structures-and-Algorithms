#include <iostream>
#include "Node.h"
#include "Utils.h"


class LinkedList {
    private:
        Node head;

    public:
        LinkedList(){ head = nullptr;}
        bool isFull(){ return false;}
        bool isEmpty{ return (head == nullptr);}

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
            newNode = new Node(element);
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
            newNode = new Node(element);
            current = head;
            while(current != nullptr){
                if (current.link == nullptr){
                    current.link = newNode;
                } else {
                    current = current.link;
                }
            }
        }
}


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

        }

        void insertAfterElement(){

        }

}
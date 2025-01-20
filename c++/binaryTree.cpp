#include <iostream>

template <class T>
class binaryTreeNode {

    // The data to be stored,
    // The pointer to the right child
    // The pointer to the left child
    private:
        T data;
        binaryTreeNode<T> leftChild;
        binaryTreeNode<T> rightChild;

    // only insert a leaf node
    public binaryTreeNode(T data){
        data = data;
        leftChild = nullptr;
        rightchild = nullptr;
    }
    pubic binaryTree(){
        data = nullptr;
        leftChild = nullptr;
        rightChild = nullptr;
    }
};

template <class T>
class binaryTree {
    private:
        binaryTreeNode head;

    public:
        binaryTree(T data){
            binaryTreeNode newNode(data);
            head = newNode;
        }
        binaryTree(){
           binaryTreeNode newNode();
           head = newNode;
        }
    
}


int main(String[] *char){
    return 0;
}
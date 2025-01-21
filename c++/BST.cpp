#include <iostream>

class BSTNode {

    // The data to be stored,
    // The pointer to the right child
    // The pointer to the left child
    private:
        int data;
        BSTNode* leftChild;
        BSTNode* rightChild;

    // only insert a leaf node
    public:
        BSTNode(){}
        BSTNode(int data){
            data = data;
            leftChild = nullptr;
            rightChild = nullptr;
        }
};

template <class T>
class BST {
    private:
        BSTNode root;

    public:
        BST(T data){
            binaryTreeNode newNode(data);
            head = newNode;
        }
        BST(){
           binaryTreeNode newNode();
           head = newNode;
        }

        bool isEmpty(){ return this->root == nullptr;}
        int heightOfTree(Node root){return (1+Math.Max(heightOfTree(root.leftChild), heightOfTree(root.rightChild)));}


        bool search(int element){
            if(!(isEmpty())){
                
                BSTNode current = this->root;
                while(current != null){
                    if(current.data == element)
                        return true;
                    else if(current.data < element)
                        current = current.leftChild;
                    else
                        current = current.rightChild
                }
            }
            return false;
        }

        void insert(int element){

        }

        void delete(int elemnet){

        }

        int numOfLeaves(){

        }

        void traverse(){
            // print to standard output or file
        }

    
    
};

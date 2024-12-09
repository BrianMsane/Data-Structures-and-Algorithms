class Node <T> {
    private T data;
    private Node leftChild;
    private Node rightChild;

    void Node(T e){
        this.data = e;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void insert(e){
        if (e < this.data){
            if (leftChild == null)
                leftChild = new Node(e);
            else
                leftChild.insert(e);
        } else if (e > data) {
            if (rightChild == null){
                rightChild = new Node(e);
            } else{
                rightChild.insert(e)
            }
        }
    }

    public T getData(){ return data; }
    public Node getLeftChild(){ return leftChild; }
    public Node getRightChild(){ return rightChild; }
    public void setData(T e){ data = e;}
    public void setLeftChild(Node left){ leftChild = left; }
    public void setRightChild(Node right){ rightChild = right; }

}


public class Traversal{


    private void inOrder(Node root){
        if (root == null){ // the base condition to avoid infinite recursion
            return;
        }
        inOrder(root.leftChild);
        System.out.println(root.data);
        inOrder(root.rightChild)
    }
    private void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild)
        System.out.println(root.data);
    }
    private void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild)
    }




    private void iterativeInOrder(Node root){
        
    }
    private void iterativePostOrder(Node root){
        
    }
    private void iterativePreOrder(Node root){
        
    }
    private void iterativeLevelOrder(Node root){
        
    }
}


class binarySearchTree <T> {

    public new Node root;
    public void binarySearchTree(){ this.root = null;}
    public boolean isEmpty(){ return (this.root == null;) }
    public boolean isLeaf(){ return (this.leftChild == null && this.rightChild == null);}

    public void traverse(Node root){
        this.traverse(root.leftChild);
        System.out.println(this.root.data);
        this.traverse(root.rightChild);
    }

    public void delete(T e){
        pos = this.find(e);
    }

    public void find(T e){
        if (this.isEmpty())
            return null;
        else {
            if (this.root.data == e){
                return this.root;
            } else{
                if (this.root.data > e){
                    this.rightChild.find(e);
                } else if (this.root.data < e) {
                    this.leftChild.find(e);
                }
            }
        }
    }

    public void insert(T e){
        if (this.isEmpty()){
            Node p = new Node(e);
        } else {
            if (this.root.data > e){
                this.root.rightChild.data = e;
            } else {
                this.root.leftChild.data = e;
            }
        }
    }

    public int heightOfNode(Node node){
        if (this.isLeaf()){
            return 0;
        } else {
            return (1 + Math.max(heightOfNode(node.leftChild), heightOfNode(node.rightChild)));
        }
    }

    public int depthOfNode(Node node){
        
    }
}
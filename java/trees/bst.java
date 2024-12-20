class Node <T> {
    private T data;
    private Node leftChild;
    private Node rightChild;

    void Node(T e){
        // always insert a leaf node
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
        Stack S = new Stack;
    }
    private void iterativePostOrder(Node root){
        Stack S = new Stack;
    }
    private void iterativePreOrder(Node root){
        // Push the root to the top of th stack
        // while this stack is not empty
            // pop and process the root
            // if P has a right child
                // for each node Y in teh left shell of the right child of P
                    // push Y ont stack S
        Stack S = new Stack;
        S.push(this.root);
        while(!(S.isEmpty())){
            System.out.println(root.leftChild);
            S.pop();
            if(root.rightChild != null){
                //
            }
        }
    }

    private void iterativeLevelOrder(Node root){
        //Enqueue the root into queue Q
        //while Q is not empty (front and rear are not null)
            // Dequeue the node at the front, process it
            // If it had children,
                // Enqueue all its children to Q
        Queue Q = new Queue();
        Q.Enqueue(root);
        while(Q.front != null && Q.rear != null){
            System.out.println(Q.Top());
            Q.Dequeue();
            if (root.leftChild != null){
                Q.Enqueue(root.leftChild);
                if (root.rightChild != null){
                    Q.Enqueue(root.rightChild);
                }
            }
        }
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

    public void find(T e){
        if (this.isEmpty())
            return null;
        else {
            if (this.root.data == e){
                return this.root;
            } else {
                if (this.root.data > e){
                    this.rightChild.find(e);
                } else if (this.root.data < e) {
                    this.leftChild.find(e);
                }
            }
        }
    }

    public void insert(T e){
        if (e < this.data){
            if (leftChild == null){
                leftChild = new Node(e);
            } else {
                leftChild.insert(e);
            }
        } else if (e > this.data){
            if (rightChild == null){
                rightChild = new Node(e);
            } else {
                rightChild.insert(e)
            }
        }
    }

    public void delete(T e){
        nodeE = this.find(e)
        if (nodeE){
            if (nodeE.isLeaf()){
                nodeE = null;
            } else {
                // find in order successor
                // promote it to this parent
                inOrderSuccessor = this.findInOrderSuccessor();
                nodeE.data  = inOrderSuccessor.data;
            }
        }
    }

    public Node findInOrderSuccessor(Node e){
        // go right once and go left as far as you can
        right = e.right;
        while (right != null){
            right  = right.leftChild;
        }
        return right;

        // handle edge case
            // if there is no right, take the next left value
        if (e.rightChild == null){
            return e.leftChild;
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
        // same as the level of the node
    }
}
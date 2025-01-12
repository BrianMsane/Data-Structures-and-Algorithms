import java.utils.Stack;

class binarySearchTree {

    class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int e){
            // always insert a leaf node only
            this.data = e;
            this.leftChild = null;
            this.rightChild = null;
        }

        public void insert(int e){
            if (e < this.data){
                if (leftChild == null)
                    leftChild = new Node(e);
                else
                    leftChild.insert(e);
            } else if (e > data) {
                if (rightChild == null){
                    rightChild = new Node(e);
                } else{
                    rightChild.insert(e);
                }
            }
        }

        public int getData(){ return data; }
        public Node getLeftChild(){ return leftChild; }
        public Node getRightChild(){ return rightChild; }
        public void setData(int e){ data = e;}
        public void setLeftChild(Node left){ leftChild = left; }
        public void setRightChild(Node right){ rightChild = right; }
    }

    public Node root;
    public binarySearchTree(){ this.root = null;}
    public binarySearchTree(int element){
        Node newNode = new Node(element);
        this.root = newNode;
    }

    public boolean isEmpty(){ return this.root == null; }
    public boolean isLeaf(Node node){ return (node.leftChild == null && node.rightChild == null);}

    public void traverse(Node root){
        // in-order traversal
        this.traverse(root.leftChild);
        System.out.println(this.root.data);
        this.traverse(root.rightChild);
    }

    public Node find(int e){
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

    public void insert(Node e){
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


    public void inOrder(Node root){
        // visit and process all nodes in the left subtree
        // visit and process the root node
        // visit and process all nodes in the right subtree

        if (root == null){ // the base condition to avoid infinite recursion
            return;
        }
        inOrder(root.leftChild);
        System.out.println(root.data);
        inOrder(root.rightChild)
    }
    public void postOrder(Node root){
        // visit and process all nodes in the left subtree
        // visit and process all nodes in the right subtree
        // visit and process the root node
        if (root == null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild)
        System.out.println(root.data);
    }
    public void preOrder(Node root){
        // visit and process the root node
        // visit and process all nodes in the left subtree
        // visit and process all nodes in the right subtree
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild)
    }

    public void iterativeInOrder(Node root){
        var S = new Stack;
    }
    public void iterativePostOrder(Node root){
        // inistialize two empty stacks
        // Push the root to the first stack
        // while first stack is not empty
        // pop node P from first stack and push it to second stack
        // push left and right children of P to first stack
        // print the contents of the second stack

        var firstStack = new Stack;
        var secondStack = new Stack;

        firstStack.push(root);
        while (!firstStack.isEmpty()){
            var top = firstStack.top();
            secondStack.push(top);
            firstStack.pop();
            if (top.leftChild != null)
                firstStack.push(top.leftChild());
            if (top.rightChild != null)
                firstStack.push(top.rightChild);
        }
        secondStack.traverse();
    }

    public void iterativePreOrder(Node root){
        // Push the root to the top of th stack
        // while this stack is not empty
        // pop and process the root
        // if P has a right child
        // for each node Y in teh left shell of the right child of P
        // push Y ont stack S
        var S = new Stack;
        S.push(this.root);
        while(!(S.isEmpty())){
            System.out.println(root.leftChild);
            S.pop();
            if(root.rightChild != null){
                //
            }
        }
    }

    public void iterativeLevelOrder(Node root){
        //Enqueue the root into queue Q
        //while Q is not empty (front and rear are not null)
        // Dequeue the node at the front, process it
        // If it had children,
        // Enqueue all its children to Q
        var Q = new Queue();
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
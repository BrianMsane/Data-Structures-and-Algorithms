import java.utils.Stack;
import java.utils.Queue;
import java.utils.Math;
import java.utils.Max;

class BinarySearchTree {

    class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(){}
        public Node(int data){
            // always insert a leaf node
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

        public void insert(int data){
            // assumption is that we do not cater for duplication of data in the tree
            if (data < this.data){
                if (leftChild == null)
                    leftChild = new Node(data);
                else
                    leftChild.insert(data);
            } else if (data > data) {
                if (rightChild == null){
                    rightChild = new Node(data);
                } else{
                    rightChild.insert(data);
                }
            }
        }

        public int getData(){ return this.data; }
        public Node getLeftChild(){ return this.leftChild; }
        public Node getRightChild(){ return this.rightChild; }
        public void setData(int data){ this.data = data;}
        public void setLeftChild(Node left){ this.leftChild = left; }
        public void setRightChild(Node right){ this.rightChild = right; }
        public boolean isLeaf(Node node){ return (node.leftChild == null && node.rightChild == null);}
    }

    public Node root;
    public BinarySearchTree(){ this.root = null;}
    public BinarySearchTree(int element){
        Node newNode = new Node(element);
        this.root = newNode;
    }

    public boolean isEmpty(){ return this.root == null; }
    public void Traverse(Node root){inOrder(root); }

    public int HeightOfTree(Node root){
        if(isEmpty())
            return 0;
        return (1+(Math.Max(HeightOfTree(root.leftChild) + HeightOfTree(root.rightChild))));
    }

    public Node Find(int element){
        if (this.isEmpty())
            return null;
        else {
            if (this.root.data == element){
                return this.root;
            } else {
                if (this.root.data > element){
                    root.rightChild.Find(element);
                } else if (this.root.data < element) {
                    root.leftChild.Find(element);
                }
            }
        }
    }

    public void Insert(int element){
        if (element < root.data){
            if (root.leftChild == null){
                root.leftChild = new Node(element);
            } else {
                root.leftChild.insert(element);
            }
        } else if (element > root.data){
            if (root.rightChild == null){
                root.rightChild = new Node(element);
            } else {
                root.rightChild.insert(element);
            }
        }
    }

    public void Delete(int element){
        Node nodeE = this.Find(element);
        if (nodeE != null){
            if (nodeE.isLeaf()){
                nodeE = null;
            } else {
                // find in order successor
                // promote it to this parent
                Node inOrderSuccessor = this.findInOrderSuccessor(nodeE);
                nodeE.data  = inOrderSuccessor.data;
                inOrderSuccessor = null;
            }
        }
    }

    public Node findInOrderSuccessor(Node e){
        // go right once and go left as far as you can
        // if there is no right, take the next left value
        if (e.rightChild == null){
            return e.leftChild;
        } else {
            Node right = e.rightChild;
            while (right != null){
                right  = right.leftChild;
            }
            return right;
        }
    }

    public int heightOfNode(Node node){
        if (node.isLeaf())
            return 0;
        return (1 + Math.max(heightOfNode(node.leftChild), heightOfNode(node.rightChild)));
    }

    public int depthOfNode(Node node){
        // same as the level of the node
        return 0;
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
        inOrder(root.rightChild);
    }

    public void postOrder(Node root){
        // visit and process all nodes in the left subtree
        // visit and process all nodes in the right subtree
        // visit and process the root node
        if (root == null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
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
        preOrder(root.rightChild);
    }

    public void iterativeInOrder(Node root){
        var S = new Stack();
        //
    }
    public void iterativePostOrder(Node root){
        // inistialize two empty stacks
        // Push the root to the first stack
        // while first stack is not empty
        // pop node P from first stack and push it to second stack
        // push left and right children of P to first stack
        // print the contents of the second stack

        var firstStack = new Stack();
        var secondStack = new Stack();

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
        var S = new Stack();
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
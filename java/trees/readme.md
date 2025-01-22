# Trees

This is a non-linear data structure in which items are arranged in a sorted items and it represents a hierarchical relationship which exists among several data items. It is said to resemble the parent-child relationship. According to graph theory a tree is a set of one or more data values such that that:

- Theres is a special data item called the root of the tree
- Its remaining data values are partitioned into mutually exclusive subsets, each of which being a tree itself. They can also be referred to as the subtrees of the root

Natual tree grow upwards, from the ground up while tree data structures grow downwards from the top to the bottom.

## Terminology

| Term             | Meaning                                                                                                                                      |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| Root             | This is a special data item which comes first in the hierarchical arrangement of data items. It does not have a parent.                      |
| Node             | Each data item in a tree is called a node and it specifies the data and links to its children in the structure                               |
| Degree of a Node | This is the number of children or subtrees that grow from the given node                                                                     |
| Leaf Nodes       | A node of degree 0; meaning that it neither has a left child nor does it have a right child                                                  |
| Internal Nodes   | Any nodes besides the root and leaf nodes                                                                                                    |
| Siblings         | Nodes which share the same parent                                                                                                            |
| Level            | The entire tree structure is leveled in such a way that the root is always at level 0, and its immediate children are at level 1, and so on. |
| Path             | It is a sequence of consecutive edges from some node to a destination node                                                                   |
| Depth            | It is the maximum level of any node in a given tree.                                                                                         |

## Operations

- Insert(element)
- Delete(element)
- Traverse(order) // can be inorder, pre-order, post-order, or level order traversal
- Find(element) // return true if the element is found otherwise false
- Leaves() // displays all leaf nodes
- isEmpty() // checks if the tree is empty and return true if it is otherwise false

## Binary Tree

A binary tree consists of a finite set of elements that can be partitioned into three distict subsets called the root, left subtree and right subtree. If there are no elements in the binary tree, it is called an empty binary tree, otherwise non-empty. A binary tree is a tree with an additional property that each node can only have up to 2 children. The possible number of children allowed are 0, 1, and 2.

Practically, when representing a binary tree node you should keep information about the 1) data value stored in that node, 2) the link to the left subtree, and 3) the link to the right subtree. The left and right subtrees can also be referred to as left and right children of the node, respectively; in that case, the node then becomes the parent to these two siblings.

A node is called a leaf node in a binary tree if it does not have the right and left children; meaning that the pointers points to nothing or null.

## Binary Search Tree

A binary search tree is a binary tree with an additional property that the left child is less that the parent, which is also less than the right child and the underlying notation is: left < root < right. It has all the operations of a binary tree and it is much easy for us to insert, delete, and find a specific data value from the tree because our search is guided by the property mentioned above.

## Running Times

| Operation       | Running Time | Reason                                                                                                                                                                                                                |
| --------------- | ------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Insert(element) | O(h)         | To insert you first have to find the perfect position, guidided by the stated property, and then insert the data there. The process of finding the position takes h comparisoins and here h is the hieght of the tree |
| Delete(element) | O(h)         | To delete a node, if it exists, you first have to find the node and then you should delink it from the structure and the process of finding also takes h comparisons here                                             |
| Find(element)   | O(h)         | Already mentioned the operation's running time reason                                                                                                                                                                 |
| Traverse()      | O(n)         | To traverse, visit all nodes, you have to go through n nodes and here n is the number of nodes in the tree                                                                                                            |

## Implementation

To implement nodes of a binary tree we have to use a pointer based implementation to allow the tree's nodes to be linked together and also allow it to grow and shrink as needed. Each node in the implementation is going to have data, pointer to left child, and pointer to the right child. So we have to define a class for the node structure in the binary tree where we can opt to make it more generic such that the data to be stored can be of any type, defined by the user in each use case.

The data type of the right and left child is the node class itself as it also points to an element which will store the three required items.

From there we have to define the class for the binary search tree and then initialize a root pointer which is going to be used to point to the first node, root, in the three. The type of this node is Node. In this class, it is where we define all the operations for a binary search tree.

## Traversal

One of the most fundamental and vital operation of a tree, any variety, it traversal which can be defined as the operation of visiting and process all nodes in the tree. Processing can be anything for instance, printing them out. There are four most popular algorithms that can be used when traversing a tree and those are:

| Algorithm   | Description                                                                                                                                                                | Notation                      |
| ----------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| Inorder     | Here we first visit the left child, then the root, before we go for the right child. The output of this traversal should be an ascending order of the elements in the tree | left-parent-right             |
| Preorder    | Here we first process the root or parent, we opt for the left child and then right child                                                                                   | parent-left-right             |
| Postorder   | Here we start by visiting the left child and the right child before we go to the root or parent                                                                            | left-right-parent             |
| Level order | According to the levels of the tree, where the root is in level 0, its immediate children in level 1, and so on, we visit all the nodes left to the right                  | level by level, left to right |

These algorithms can practically be implemented using recurcive and iterative algorithms an we discuss these algorithms in the next section using pseudocode.

### Recursive Algorithms

#### Inorder traversal

Begin <br>
Visit and process all nodes in the left subtree of the root<br>
Visit and process the root node<br>
Visit and process in the right subtree of the root<br>
End

#### Preorder Traversal

Begin<br>
Visit and process the root node<br>
Visit and process all nodes in the left subtree<br>
Visit and process all nodes in the right subtree<br>
End

#### Postorder Traversal

Begin<br>
Visit and process all the nodes in the left subtree<br>
Visit and process all the nodes in the right subtree<br>
Visit and process the root node<br>
End

#### Level order Traversal

Begin<br>
For I = 1 to max level<br>
Visit and process leve I nodes in the left to right order<br>
End

### Iterative Algorithms

#### Inorder

Begin<br>
Initialize an empty stack S<br>
For each node P on the left shell of the root node<br>
Push P on the stack<br>
While the stack is not emtpy<br>
Begin<br>
Pop and process U from the stack<br>
If U has a right child then<br>
Begin<br>
For each node Y on the left shell of the right child of U<br>
Push Y on to the stack<br>
End<br>
End<br>
End

#### Preorder

Begin<br>
For each node P in the left shell of the root<br>
Begin<br>
If node P has a right child Y then Push Y onto the stack<br>
End<br>

While the stack is not emtpy<br>
Begin<br>
Let P be the node on top of the stack<br>
Pop and process node P<br>
For each node J in the left shell pf P do<br>
Begin<br>
If J has a right child Y then push Y onto the stack<br>
End<br>
End<br>
End

#### Postorder

Begin<br>
Initialize two empty stacks, S1 and S2<br>
Push the root node onto S1<br>
While S1 is not empty<br>
Begin<br>
Pop node P from S1 and push it to S2<br>
Push the left and right children P onto S1<br>
End<br>
Print all the content of S2<br>
End

#### Level order

Begin<br>
Enqueue the root node onto Queue Q<br>
While Q is not empty<br>
Dequeue node P in front of Q<br>
Process and mark P as vistited<br>
If P has children<br>
Enqueue the children of P from the left to right<br>
End

## B-Tree

## B+Tree

## (a,b)-Tree

## 2-3 Tree

## Note

The left shell of a node is the set of all nodes in the path from X to the leftmost node of the subtree rooted from X. It is inclusive of X.

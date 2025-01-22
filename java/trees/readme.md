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

## Operations

- Insert(element)
- Delete(element)
- Traverse(order) // can be inorder, pre-order, post-order, or level order traversal
- Find(element) // return true if the element is found otherwise false
- Leaves() // displays all leaf nodes
- isEmpty() // checks if the tree is empty and return true if it is otherwise false

## Running Time

## Implementation

## Binary Tree

## Binary Search Tree

## B-Tree

## B+Tree

## (a,b)-Tree

## 2-3 Tree

# Chapter 4 - Trees and Graphs

### Route Between Nodes:
Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

### Minimal Tree: 
Given a sorted (increasing order) array with unique integer elements, write an algo­
rithm to create a binary search tree with minimal height.

### List of Depths: 
Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).

### Check Balanced: 
Implement a function to check if a binary tree is balanced. For the purposes of this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one.

### Validate BST: 
Implement a function to check if a binary tree is a binary search tree.

### Successor: 
Write an algorithm to find the "next" node (i.e., in-order successor) of a given node
in a binary search tree. You may assume that each node has a link to its parent.

### Build Order: You are given a list of projects and a list of dependencies 
(which is a list of pairs of projects, where the second project is dependent 
on the first project). All of a project's dependencies must be built before 
the project is. Find a build order that will allow the projects to be built. 
If there is no valid build order, return an error.
EXAMPLE
Input:
projects: a, b, c, d, e, f
dependencies: (a, d), (f, b), (b, d), (f, a), (d, c) Output: f, e, a, b, d, c

### First Common Ancestor: 
Design an algorithm and write code to find the first common ancestor of two nodes 
in a binary tree. Avoid storing additional nodes in a data structure. 
NOTE: This is not necessarily a binary search tree.

### BST Sequences: 
A binary search tree was created by traversing through an array from left to right 
and inserting each element. Given a binary search tree with distinct elements, 
print all possible arrays that could have led to this tree.
EXAMPLE
Output: {2, 1, 3}, {2, 3, 1}

### Check Subtree: 
Tl and T2 are two very large binary trees, with Tl much bigger than T2. Create an
algorithm to determine if T2 is a subtree of Tl.
A tree T2 is a subtree of Tl if there exists a node n in Tl such that the subtree 
of n is identical to T2. That is, if you cut off the tree at node n, 
the two trees would be identical.

### Random Node: 
You are implementing a binary tree class from scratch which, in addition to insert, 
find, and delete, has a method getRandomNode() which returns a random node from the tree. 
All nodes should be equally likely to be chosen. Design and implement an algorithm for getRandomNode, 
and explain how you would implement the rest of the methods.

### Paths with Sum: 
You are given a binary tree in which each node contains an integer value 
(which might be positive or negative). Design an algorithm to count the number of 
paths that sum to a given value. The path does not need to start or end at the root
 or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

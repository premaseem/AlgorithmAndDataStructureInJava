package me.premaseem.datastructure.binaryTree;

// Binary Search Tree
public class BST {
    Node root;

    public void insert(int key){

        Node newNode = new Node(key);

        if (root == null){
            root = newNode;
            System.out.println("Root node inserted");
            return;
        }

        Node current = root;
        Node parent;
        while(true){
            parent = current;
            if(key < current.key){
                current = current.leftNode;
                if (current == null){
                    parent.leftNode = newNode;
                    return;
                }
            }else{
                current = current.rightNode;
                if (current == null){
                    parent.rightNode = newNode;
                    return;
                }
            }
        }
    }


    public int searchMin(){
        Node current = root;

        while(true){
            current = current.leftNode;
            if (null == current.leftNode){
                return current.key;
            }
        }
    }

    public int searchMax(){
        Node current = root;
        Node last=null;
        while(current != null){
            last = current;
            current = current.rightNode;
        }
        return last.key;
    }

    public void printBST(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.key);

        printBST(node.leftNode);
        printBST(node.rightNode);
    }



    Node targetNode = null;

    public boolean deleteNode(int key){

    Node parentNode = root;
    Node currentNode = root;

    boolean isLeftNode = false;

    while(currentNode.key != key){
        parentNode = currentNode;
        if (key < currentNode.key){
            isLeftNode = true;
            currentNode = currentNode.leftNode;
        }else{
            isLeftNode = false;
            currentNode = currentNode.rightNode;
        }
        if (currentNode == null){
            return false;
        }
    }

    Node nodeToDelete = currentNode;

    // if node is leaf node, delete it which means assign parent of nodetoDelete as null
    if (nodeToDelete.leftNode == null && nodeToDelete.rightNode == null){
        if (nodeToDelete == root){
            root = null;
        } else
        if(isLeftNode){
            parentNode.leftNode = null;
        }else {
            parentNode.rightNode = null;
        }
    }else if(nodeToDelete.rightNode == null){
        if (nodeToDelete == root){
            root = null;
        } else
        if(isLeftNode){
                parentNode.leftNode = nodeToDelete.leftNode;
            } else {
                parentNode.rightNode = nodeToDelete.leftNode;
            }
        } else if (nodeToDelete.leftNode == null){
        if (nodeToDelete == root){
            root = null;
        } else
        if(isLeftNode){
            parentNode.leftNode = nodeToDelete.rightNode;
        } else {
            parentNode.rightNode = nodeToDelete.rightNode;
        }
    } else
        // if node has 2 children
       {
           Node successorNode = getSuccssorNode(nodeToDelete);

           if (nodeToDelete == root){
               root = successorNode;
           } else if (isLeftNode){
               parentNode.leftNode = successorNode;
           } else {
               parentNode.rightNode = successorNode;
           }
           successorNode.leftNode = nodeToDelete.leftNode;
        }

        return true;
    }

    public Node getSuccssorNode(Node nodeToDelete){
        Node successorParent = nodeToDelete;
        Node successor=nodeToDelete;
        Node current = nodeToDelete;

        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.leftNode;
        }
        // if successor is not a  right child
        if(successor != nodeToDelete.rightNode){
            successorParent.leftNode = successor.rightNode;
            successor.rightNode = nodeToDelete.leftNode;
        }
        return successor;

    }

    public void findNode(Node node, int key){
       if (node == null) {
           return;
       }
       if (node.key == key){
           this.targetNode = node;
           return;
       }
       findNode(node.leftNode, key);
       findNode(node.rightNode, key);

    }
}

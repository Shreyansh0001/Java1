package com.java1.DSA;


public class TreeTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int d){
            data = d;
            left = right = null;
        }
    }
    Node root;

    TreeTraversal(){
        root = null;
    }

    void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);

    }

    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        inOrder(node.left);
        inOrder(node.right);

    }

    static void insertNode(int data) {
        Node new_node = new Node(data);
    }


    public static void main(String[] args) {
    TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        tree.inOrder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postOrder(tree.root);
    }
}

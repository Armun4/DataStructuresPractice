package com.example;

import java.util.ArrayList;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;
        while (current != null){
            if(value < current.value)
                current = current.leftChild;
            else if(value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }
    public void swapRoot(){
        Node temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    public  void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root){
        if(isEmpty()) return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);

    }


    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if(isEmpty()) return;

        traverseInOrder(root.leftChild);
        traversePreOrder(root);
        traversePreOrder(root.rightChild);
    }


    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
        if(root == null) return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }


    public int height(){
         return height(root);
    }
    private int height(Node root){
        if (isEmpty()) return -1;
        if(isLeaf(root)) return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }


    public int min(){
        return min(root);
    }
    private int min(Node root){
        if(isLeaf(root))return root.value;

            int left = min(root.leftChild);
            int right = min(root.rightChild);

            return Math.min(Math.min(left, right), root.value);

    }

    public boolean equals(Tree other){
        if(other ==  null) return false;
            return equals(root, other.root);

    }
    private boolean equals(Node first, Node second){
        if (first == null && second == null)
            return true;
        if(first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        return false;
    }

    public boolean isBinarySearchTree(){
        return
                isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
    private boolean isBinarySearchTree(Node root, int min, int max){
    if(root == null)
        return true;
    if(root.value < min || root.value > max)
        return false;

    return
            isBinarySearchTree(root.leftChild, min,root.value - 1)
            && isBinarySearchTree(root.rightChild, root.value, max);
    }

    public ArrayList<Integer> getNodesAtDistance(int d){
        ArrayList<Integer> list = new ArrayList();
        getNodesAtDistance(root, d, list);
        return list;

    }
    private void getNodesAtDistance(Node root, int d, ArrayList<Integer> list){
        if(root == null)
            return;
        if (d == 0){
          list.add(root.value);
        }

        getNodesAtDistance(root.leftChild, d-1, list);
        getNodesAtDistance(root.rightChild, d-1, list);
    }

    public void traverseLevelOrder(){
        for (int i = 0; i <= height(); i++){
            for(int value: getNodesAtDistance(i))
                System.out.println(value);
        }
    }

    private boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }

    private boolean isEmpty() {
        return root == null;
    }
}
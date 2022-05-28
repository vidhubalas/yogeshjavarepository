package com.company;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
    BinarySearchTree bt = new BinarySearchTree();
        bt.add(15);
        bt.add(11);
        bt.add(43);
        bt.add(7);
        bt.add(1);
        bt.add(44);
        bt.add(33);
        System.out.println(bt.containsValue(7));
    }
}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class BinarySearchTree{
    Node root;
    public void add(int value){
        root = addRecursive(root,value);
        System.out.println(root);
    }

    private Node addRecursive(Node current, int value) {
    if (current ==  null){
        return new Node(value);    //new object of type node
    }else if(value<current.value){
        current.left = addRecursive(current.left,value);
    }else if(value>current.value){
        current.right = addRecursive(current.right,value);
    }
    return current;
    }

    private boolean containsRecursive(Node current, int value) {
        if(current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        return value < current.value ? containsRecursive(current.left,value) : containsRecursive(current.right,value);
    }

    public boolean containsValue(int value){
        return containsRecursive(root,value);
    }
}

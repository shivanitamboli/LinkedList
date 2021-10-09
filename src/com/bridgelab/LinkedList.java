package com.bridgelab;
public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insertInMiddle(myFirstNode,mySecondNode);
        myLinkedList.displayNode();
        //To delete the first element in the sequence
        myLinkedList.popFirstNode();
        myLinkedList.displayNode();
    }
}
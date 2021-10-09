package com.bridgelab;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * This method is used to add elements to the LinkedList
	 */
	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}

		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}
	}

	/**
	 * This method is used to append elements to the LinkedList
	 * 
	 * @param newNode
	 */

	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;

		if (this.head == null)
			this.head = newNode;

		else {
			tail.setNext(newNode);
			tail = newNode;

		}
	}

	public void displayNode() {
		INode current = head;

		System.out.print("Nodes are: ");
		while (current != null) {
			if (current.getNext() != null) {
				System.out.print(current.getKey() + " - ");
				current = current.getNext();
			} else {
				System.out.println(current.getKey());
				current = current.getNext();
			}
		}

	}
}

package com.bridgelab;

public class MyNode<k> {
	private k key;
	private MyNode next;

	public MyNode(k key) {
		this.key = key;
		this.next = null;
	}

	public k getKey() {
		return key;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public void setKey(k key) {
		this.key = key;
	}
}

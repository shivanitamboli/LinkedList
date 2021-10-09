package com.bridgelab;

public interface INode<K> {
	void setkey(K Key);

	K getKey();

	void setNext(INode next);

	INode getNext();

}
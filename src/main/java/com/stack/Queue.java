package com.stack;

public class Queue {

	private final LinkedList list;

	public Queue() {
		this.list = new LinkedList();
	}

	public void enqueue(INode mynode) {
		list.append(mynode);
	}

	public void print() {
		list.print();
	}

}

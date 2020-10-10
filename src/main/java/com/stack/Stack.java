package com.stack;

import com.stack.INode;
import com.stack.LinkedList;

public class Stack {

	private final LinkedList list;

	public Stack() {
		this.list = new LinkedList();
	}

	public void push(INode mynode) {
		list.add(mynode);
	}

	public void print() {
		list.print();
	}

}

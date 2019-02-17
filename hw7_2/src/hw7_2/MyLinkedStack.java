package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {

	private Node head = null;
	private Node top;
	private int stackSize = 0;

	private class Node {
		int data;
		Node link;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		return (top == null);
	}


	public void push(int data) {
		Node newNode = new Node(data);
	      newNode.link = top;
	      top = newNode;
	}

	public int pop() {
		if(isEmpty()) {
	         throw new EmptyStackException();
	      }
	      else {
	         int result = top.data;
	         top = top.link;
	         return result;
	      }

	}
	public int peek() {
		 if(isEmpty()) {
	         throw new EmptyStackException();
	      }
	      else
	         return top.data;
	   }

}

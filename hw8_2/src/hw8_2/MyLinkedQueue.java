package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {

	class Node {
		int data;
		Node link;
	}

	private Node front;
	private Node rear;
	private int count;

	public MyLinkedQueue() {
		front = null;
		rear = null;
		count = 0;
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void enQueue(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.link = null;
		if (isEmpty()) {
			front = newNode;
			rear = newNode;
			count++;
		} else {
			rear.link = newNode;
			rear = newNode;
			count++;
		}
	}

	public int deQueue() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException("Deleting fail! Linked Queue is empty!!");
		} else {
			int item = front.data;
			front = front.link;
			count--;
			if (front == null)
				rear = null;
			return item;
		}
	}

	public int peek() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException("Peeking fail! Circular Queue is empty!!");
		} else {
			return front.data;

		}

	}
	public int size() {
		return count;
	}
	

}

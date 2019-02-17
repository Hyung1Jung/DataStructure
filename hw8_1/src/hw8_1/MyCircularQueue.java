package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {

	private int[] itemArray;
	private int queueSize;
	private int front;
	private int rear;
	private int count;

	public MyCircularQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new int[queueSize];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == queueSize;
	}

	public void enQueue(int item) {
		if (isFull()) {
			System.out.println("Inserting fail! Circular Queue is full!!");
		} else {
			rear = (rear + 1) % queueSize;
			itemArray[rear] = item;
			count++;
		}
	}

	public int deQueue() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException("Peeking fail! Circular Queue is empty!!");
		} else {
			front = (front + 1) % queueSize;
			count--;
			return itemArray[front];
		}
	}

	public int peek() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException("Peeking fail! Circular Queue is empty!!");
		} else {
			return itemArray[(front + 1) % queueSize];
		}
	}
	
	public int size() {
		return count;
	}
}

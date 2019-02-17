package hw7_3;

public class MyCharacterStack {
	Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(char value) {
		Node node = new Node(value, top);
		top = node;
	}

	public char peek() throws Exception {
		if (top == null)
			throw new Exception();
		return top.value;
	}

	public char pop() throws Exception {
		if (top == null)
			throw new Exception();
		char value = top.value;
		top = top.next;
		return value;
	}

	class Node {
		char value;
		Node next;

		public Node(char value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}

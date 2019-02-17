package hw6_1;

public class MyLinkedList {

	private Node head = null;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.link = head;
			head = newNode;
		}

	}

	private class Node {
		int data;
		Node link;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
			this.link = null;
		}
	}

	public int size() { // size - ����Ʈ�� ���̸� ����
		int length = 0;
		Node temp = head;

		while (temp != null) {
			length++;
			temp = temp.link;
		}

		return length;
	}

	public void addLast(int data) { // addLast - �������� �Ű������� �޾� ����Ʈ�� �������� ����
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
			temp = newNode;

		}
	}

	public int removeFirst() { // removeFirst - ����Ʈ�� ���� �� ����(������)�� �����Ͽ� ����
		if (head == null) {
			return -1;
		} else if (head.link == null) {
			int result = head.data;
			head = null;
			return result;
		} else {
			Node temp = head;
			int result = temp.data;
			temp = temp.link;
			head = temp;
			return result;

		}
	}

	public int removeLast() { // removeLast - ����Ʈ�� ������ ����(������)�� �����Ͽ� ����
		int value;
		Node temp1 = head;
		Node temp2 = null;

		if (head == null) {
			return -1;
		} else if (head.link == null) {
			value = head.data;
			head = null;
			return value;
		} else {
			Node t = head;
			while (t.link.link != null)
				t = t.link;

			int data = t.link.data;
			t.link = null;

			return data;
		}
	}

	public String toString() {
		Node temp = head;
		String str = "List = ( ";
		if (head == null) {
			return str + ")";
		} else {
			while (temp.link != null) {
				str += temp.data + " ";
				temp = temp.link;
			}
			str += temp.data;
			return str + ")";
		}

	}
}

package lab6_2;

public class MyDoublyLinkedList {
	private Node head = null;

	// �ܼ� ���Ḯ��Ʈ�� ��带 ǥ���ϴ� ��� Ŭ����
	private class Node {
		// ����Ʈ�� ù��¹ ��带 ����ų ����(head) - null�� �ʱ�ȭ ��
		int data;
		Node llink;
		Node rlink;

		Node(int data) {
			this.data = data;
		}
	}

	@Override
	public String toString() {
		String list = "list = ";
		Node temp = head;
		while (temp != null) {
			list += temp.data + " ";
			temp = temp.rlink;
		}
		return list;
	}

	public void addFirst(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if (head != null) {
			newNode.rlink = head;
			head.llink = newNode;
			head = newNode;
		} else {
			head = newNode;
		}
	}

	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
	public void printList() {
		if (head == null) {
			System.out.println("( )( )");
		} else {
			System.out.print("( ");
			Node temp = head;
			while (temp.rlink != null) {
				System.out.print(temp.data + " ");
				temp = temp.rlink;
			}
			System.out.print(temp.data + " ");
			System.out.print(") ");

			System.out.print("( ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.llink;
			}
			System.out.print(") ");
		}

		// ......... �ϼ��ϼ���.

	}
}

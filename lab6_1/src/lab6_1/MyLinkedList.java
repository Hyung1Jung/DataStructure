package lab6_1;

public class MyLinkedList {
	private Node head = null;

	// �ܼ� ���Ḯ��Ʈ�� ��带 ǥ���ϴ� ��� Ŭ����
	private class Node {
		// ����Ʈ�� ù��¹ ��带 ����ų ����(head) - null�� �ʱ�ȭ ��
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}		

		
		@Override
		public String toString() {
			String list = "list = ";
			Node temp = head;
			while(temp != null) {
				list += temp.data+ " ";
				temp = temp.link;
			}
			return list;
		}

	public void addFirst(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		newNode.link = head;
		head = newNode;
	}
}

package lab6_1;

public class MyLinkedList {
	private Node head = null;

	// 단순 연결리스트의 노드를 표현하는 노드 클래스
	private class Node {
		// 리스트의 첫번쨔 노드를 가리킬 변수(head) - null로 초기화 됨
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

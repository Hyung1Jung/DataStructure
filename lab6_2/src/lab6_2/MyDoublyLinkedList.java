package lab6_2;

public class MyDoublyLinkedList {
	private Node head = null;

	// 단순 연결리스트의 노드를 표현하는 노드 클래스
	private class Node {
		// 리스트의 첫번쨔 노드를 가리킬 변수(head) - null로 초기화 됨
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

	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
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

		// ......... 완성하세요.

	}
}

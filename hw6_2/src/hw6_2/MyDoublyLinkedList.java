package hw6_2;
import java.util.NoSuchElementException;

public class MyDoublyLinkedList {

	private class Node{
		int data;
		Node rlink = null;
		Node llink = null;

		public Node() {};
		public Node(int value) {
			this.data = value;
		}

	}

	Node head = null;

	public void addFirst(int value) {

		if(head == null)
			head = new Node(value);
		else {
			Node temp = new Node(value);

			temp.rlink = head;
			head.llink = temp;
			head = temp;
		}

	}

	@Override
	public String toString() {
		String str = "list = ";
		Node temp = head;

		while(temp != null) {
			str += (temp.data + " ");
			temp = temp.rlink;
		}
		return str;
	}


	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
	public void printList() {
		String str= "list = ";
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			Node temp = head;

			while(temp.rlink != null){
				str += (temp.data + " ");
				temp = temp.rlink;
			}
			str += (temp.data + "        ");


			while(temp != null){
				str += ( temp.data + " ");
				temp = temp.llink;
			}

			System.out.println(str);
		}
	}


	public int size() {				//size - 리스트의 길이를 리턴
		int size = 0;
		Node temp = head;

		while(temp != null) {
			size++;
			temp = temp.rlink;
		}

		return size;
	}

	public void addLast(int num) {					//addLast - 정수값을 매개변수로 받아 리스트의 마지막에 삽입    
		Node temp = head;

		if(head == null)
			head = new Node(num);
		else {
			while(temp.rlink != null) 
				temp = temp.rlink;
			temp.rlink = new Node(num);
			temp.rlink.llink = temp;
		}
	}

	public int removeFirst() {				//removeFirst - 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴  
		Node temp = head;
		int data = 0;

		if(head == null)
			throw new NoSuchElementException();
		else if(head.rlink == null) {
			data = head.data;
			head = null;
		}
		else {
			head.rlink.llink = null;
			data = head.data;
			head = head.rlink;
		}

		return data;
	}


	public int removeLast() {				//removeLast - 리스트의 마지막 원소(정수값)을 삭제하여 리턴
		Node next = head;
		Node now = null;
		int data=0;


		if(head == null)
			throw new NoSuchElementException();
		else if(head.rlink == null) {
			data = head.data;
			head = null;
		}
		else {
			while(next.rlink != null) {
				now = next;
				next = next.rlink;
			}
			data = next.data;
			now.rlink = null;
		}

		return data;
	}

	public boolean remove(int num) {		//remove - 정수값을 매개변수로 받아 리스트에서 검색하여 있으면 삭제하고 true 리턴, 아니면 false 리턴  (정수값이 여러개면 맨 앞의 것을 삭제)
		Node now = head;
		Node pre = null;


		if(head == null)
			throw new NoSuchElementException();
		else if(head.rlink == null) {
			if(head.data == num) {
				head = null;
				return true;
			}
			return false;
		}
		else if(head.data == num) {
			head = head.rlink;
			return true;
		}
		else {
			while(now != null) {
				if(now.data == num) {
					if(now.rlink == null) {
						pre.rlink = null;
						return true;
					}
					else {
						pre.rlink = now.rlink;
						now.rlink.llink = pre;
						return true;
					}
				}

				else {
					pre = now;
					now = now.rlink;
				}

			}
		}

		return false;
	}
}

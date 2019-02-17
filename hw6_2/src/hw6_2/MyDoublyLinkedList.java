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


	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
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


	public int size() {				//size - ����Ʈ�� ���̸� ����
		int size = 0;
		Node temp = head;

		while(temp != null) {
			size++;
			temp = temp.rlink;
		}

		return size;
	}

	public void addLast(int num) {					//addLast - �������� �Ű������� �޾� ����Ʈ�� �������� ����    
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

	public int removeFirst() {				//removeFirst - ����Ʈ�� ���� �� ����(������)�� �����Ͽ� ����  
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


	public int removeLast() {				//removeLast - ����Ʈ�� ������ ����(������)�� �����Ͽ� ����
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

	public boolean remove(int num) {		//remove - �������� �Ű������� �޾� ����Ʈ���� �˻��Ͽ� ������ �����ϰ� true ����, �ƴϸ� false ����  (�������� �������� �� ���� ���� ����)
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

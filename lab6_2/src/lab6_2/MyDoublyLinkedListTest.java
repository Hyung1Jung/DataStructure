package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2 : Á¤ÇüÀÏ\n");
		
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		
		System.out.println(list);
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list);
		list.printList();

	}

}

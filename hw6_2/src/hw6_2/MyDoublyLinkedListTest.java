package hw6_2;
/*
�����̸� : MyDoublyLinkedListTest.java
�ۼ����� : 2018.10.11
�̸� : �ڼ���
���� : ���������� ���� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyDoublyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� 
 */
import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String [] args) {

		System.out.println("hw6_2 : �ڼ���");

		MyDoublyLinkedList list = new MyDoublyLinkedList();			//MyLinkedList ��ü�� ����(list��� ����)
		Scanner input = new Scanner(System.in);

		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print("\n1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� 8:�պ���� 9:���� ---> ");	//(2) ����ڿ��� ������ ���� �޴��� �ݺ��Ͽ� �����ϵ� 9 �Է½� �ݺ� ����
			// 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� 8:�պ���� 9:����
			menu = input.nextInt();

			switch(menu) {
			case 1:		// 1 ���ý�, list�� ��ü ������ ���(toString ȣ��)
				System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
				System.out.println(list); 
				break;
			case 2:		// 2 ���ý�, list�� ���̸� ���(size ȣ��)
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size(); 
				System.out.println(size);
				break;
			case 3:		// 3 ���ý�, ����ڷκ��� �������� �Է¹޾� list �� �տ� ����
				System.out.println("���Ҹ� �� �տ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addFirst(element);
				break;
			case 4:		// 4 ���ý�, ����ڷκ��� �������� �Է¹޾� list �� �ڿ� ����
				System.out.println("���Ҹ� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addLast(element);
				break;
			case 5:		// 5 ���ý�, list �� �տ��� �������� �����ϰ� �� ������ ���
				System.out.println("�� �� ���Ҹ� �����մϴ�.");
				element = list.removeFirst();
				System.out.println(element);
				break;
			case 6:		// 6 ���ý�, list �� �ڿ��� �������� �����ϰ� �� ������ ���
				System.out.println("�� �� ���Ҹ� �����մϴ�.");
				element = list.removeLast();
				System.out.println(element);
				break;
			case 7:		// 7 ���ý�, ����ڷκ��� �������� �Է¹޾� list���� �����ϰ�, ���� ���� ���� ���
				System.out.println("���Ҹ� �����մϴ�.");
				element = input.nextInt();
				System.out.println(list.remove(element));
				break;
			case 8:		// 8 ���ý�, ����� ��ũ Ȯ���� ���� list ���ҵ��� ������, ���������� �պ��ϸ� ���
				System.out.println("���� ����� ���.");
				list.printList();
				break;
			case 9:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 9);

	}
}
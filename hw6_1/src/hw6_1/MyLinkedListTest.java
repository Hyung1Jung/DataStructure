package hw6_1;
/*
�����̸� : MyLinkedListTest
�� �� : �ܼ� ���Ḯ��Ʈ�� ����Ͽ� ���� ����Ʈ�� �����ϴ� MyLinkedList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷�
�ۼ��� : �ڼ���
�ۼ��� : 2018-10-04
*/
import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String [] args) {

		System.out.println("hw6_1 : ������");

		
		MyLinkedList list = new MyLinkedList();	//MyLinkedList ��ü�� ����(list��� ����)
		
		Scanner input = new Scanner(System.in);

		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� ---> ");	
			//(2) ����ڿ��� ������ ���� �޴��� �ݺ��Ͽ� �����ϵ� 7 �Է½� �ݺ� ����   																				
			//1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:����
			menu = input.nextInt();

			switch(menu) {
			case 1:		// 1 ���ý�, list�� ��ü ������ ���(toString ȣ��)
				System.out.print("����Ʈ ��ü�� ��ȸ�մϴ�.");
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
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	
	}


}

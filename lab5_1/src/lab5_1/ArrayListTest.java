package lab5_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		System.out.println("lab5_1: ������\n");

		Scanner input = new Scanner(System.in);

		// (1) Integer�� Ÿ�� �Ű������� �Ͽ� ArrayList ��ü�� ����(list��� �̸��� ������ ����)
		ArrayList<Integer> list= new ArrayList<Integer>();

		// (2) ����ڿ��� �޴��� �ݺ� �����ϰ� 7�� �Է��ϸ� �ݺ� ����
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print("1:�� ��ȸ 2:��ü��ȸ 3:������ȸ 4:����  5:�ε��� ���� 6:����  7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("�� ��ȸ");
				index = input.nextInt();
				element = list.get(index)      ; // �ϼ��ϼ���.
				System.out.println(element);  
				break;
			case 2:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");  // �ϼ��ϼ���.
				System.out.println(list);
				break;
			case 3:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size();  // �ϼ��ϼ���.
				System.out.println(size);
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.add(element)                                  ;  // �ϼ��ϼ���.
				break;
			case 5:
				System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt();    
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.add(index, element);    // �ϼ��ϼ���.
				break;
			case 6:
				System.out.println("����Ʈ�� �� �ڿ��� �������� �����ϰ� �� ������ ���.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt(); 
				element = list.remove(index);  // �ϼ��ϼ���.
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
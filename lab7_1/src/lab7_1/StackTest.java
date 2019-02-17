package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_1 : ������\n");

		int menu = 0;
		int element = 0;

		Scanner input = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();

		do {
			System.out.println("1:����  2:����  3:��ȸ  4:�հ�  5:���� --->");
			menu = input.nextInt();


			switch(menu) {
			case 1:
				System.out.print("����ڷκ��� �������� �ϳ� �Է¹޾� ���ÿ� ����(push) : ");
				element = input.nextInt();
				stack.push(element);
				break;
			case 2:
				System.out.print("���ÿ��� ����(pop)�Ͽ� ���ϵ� ���� ��� : ");
				element = stack.pop();
				System.out.println(element);
				break;
			case 3:
				System.out.print("���ÿ��� ��ȸ(peek)�Ͽ� ���ϵ� ���� ��� : ");
				element = stack.peek();
				System.out.println(element);
				break;
			case 4:
				System.out.print("������ �� ����(empty)���� ��� ����(pop)�Ͽ� ���� ��� : " );
				int sum = 0;
				while(!stack.empty()) {
					element = stack.pop();
					sum += element;
				}
				System.out.println(sum);
				break;
			case 5:
				System.out.println("����");
				return;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while (menu != 5);
	}
}

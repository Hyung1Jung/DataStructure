package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hw8_1 : ������\n");

		int menu = 0;
		int element = 0;

		Scanner input = new Scanner(System.in);

		MyCircularQueue stack = new MyCircularQueue(5);

		do {
			System.out.println("1:����  2:����  3:��ȸ  4:ũ�� 5:��ü���� 6:���� --->");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				System.out.print("����ڷκ��� �������� �ϳ� �Է¹޾� ť�� �� �ڿ� ����(enQueue) : ");
				element = input.nextInt();
				stack.enQueue(element);
				break;
			case 2:
				System.out.print("ť�� �� �� ���Ҹ� �����Ͽ�(deQueue) ��� : ");
				element = stack.deQueue();
				System.out.println(element);
				break;
			case 3:
				System.out.print("ť�� �� �� ���Ҹ� ��ȸ�Ͽ�(peek) ��� : ");
				element = stack.peek();
				System.out.println(element);
				break;
			case 4:
				System.out.print(" ť�� ����� ���� ���� �˾Ƴ���(size) ��� : " + stack.size()+"\n");
				break;
			case 5:
				System.out.print("ť�� �� �������� ���Ҹ� �ϳ��� �����Ͽ�(deQueue) ��� ��� : ");
				while (!stack.isEmpty()) {
					element = stack.deQueue();
					System.out.print(element + " ");
				}
				System.out.println("");
				break;
			case 6:
				System.out.println("����");
				return;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while (menu != 6);
	}

}



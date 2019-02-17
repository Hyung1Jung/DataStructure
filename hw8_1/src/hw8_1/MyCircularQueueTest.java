package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hw8_1 : 정형일\n");

		int menu = 0;
		int element = 0;

		Scanner input = new Scanner(System.in);

		MyCircularQueue stack = new MyCircularQueue(5);

		do {
			System.out.println("1:삽입  2:삭제  3:조회  4:크기 5:전체삭제 6:종료 --->");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				System.out.print("사용자로부터 정수값을 하나 입력받아 큐의 맨 뒤에 삽입(enQueue) : ");
				element = input.nextInt();
				stack.enQueue(element);
				break;
			case 2:
				System.out.print("큐의 맨 앞 원소를 삭제하여(deQueue) 출력 : ");
				element = stack.deQueue();
				System.out.println(element);
				break;
			case 3:
				System.out.print("큐의 맨 앞 원소를 조회하여(peek) 출력 : ");
				element = stack.peek();
				System.out.println(element);
				break;
			case 4:
				System.out.print(" 큐에 저장된 원소 수를 알아내어(size) 출력 : " + stack.size()+"\n");
				break;
			case 5:
				System.out.print("큐가 텅 빌때까지 원소를 하나씩 삭제하여(deQueue) 모두 출력 : ");
				while (!stack.isEmpty()) {
					element = stack.deQueue();
					System.out.print(element + " ");
				}
				System.out.println("");
				break;
			case 6:
				System.out.println("종료");
				return;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while (menu != 6);
	}

}



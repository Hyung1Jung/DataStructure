package hw7_2;

import java.util.Scanner;

public class MyLinkedStackTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hw7_2 : 정형일\n");

		int menu = 0;
		int element = 0;

		Scanner input = new Scanner(System.in);

		MyLinkedStack stack = new MyLinkedStack();

		do {
			System.out.println("1:삽입  2:삭제  3:조회  4:합계  5:종료 --->");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				System.out.print("사용자로부터 정수값을 하나 입력받아 스택에 삽입(push) : ");
				element = input.nextInt();
				stack.push(element);
				break;
			case 2:
				System.out.print("스택에서 삭제(pop)하여 리턴된 값을 출력 : ");
				element = stack.pop();
				System.out.println(element);
				break;
			case 3:
				System.out.print("스택에서 조회(peek)하여 리턴된 값을 출력 : ");
				element = stack.peek();
				System.out.println(element);
				break;
			case 4:
				System.out.print("스택이 텅 빌때(empty)까지 모두 삭제(pop)하여 합을 출력 : ");
				int sum = 0;
				while (!stack.isEmpty()) {
					element = stack.pop();
					sum += element;
				}
				System.out.println(sum);
				break;
			case 5:
				System.out.println("종료");
				return;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while (menu != 5);
	}
}

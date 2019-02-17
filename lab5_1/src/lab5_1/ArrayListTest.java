package lab5_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		System.out.println("lab5_1: 정형일\n");

		Scanner input = new Scanner(System.in);

		// (1) Integer를 타입 매개변수로 하여 ArrayList 객체를 생성(list라는 이름의 변수에 저장)
		ArrayList<Integer> list= new ArrayList<Integer>();

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print("1:값 조회 2:전체조회 3:길이조회 4:삽입  5:인덱스 삽입 6:삭제  7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("값 조회");
				index = input.nextInt();
				element = list.get(index)      ; // 완성하세요.
				System.out.println(element);  
				break;
			case 2:
				System.out.println("리스트 길이를 조회합니다.");  // 완성하세요.
				System.out.println(list);
				break;
			case 3:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();  // 완성하세요.
				System.out.println(size);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(element)                                  ;  // 완성하세요.
				break;
			case 5:
				System.out.println("인덱스 위치에 원소를 삽입합니다.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt();    
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				list.add(index, element);    // 완성하세요.
				break;
			case 6:
				System.out.println("리스트의 맨 뒤에서 정수값을 삭제하고 그 정수를 출력.");
				System.out.print("인덱스 입력: ");
				index = input.nextInt(); 
				element = list.remove(index);  // 완성하세요.
				System.out.println(element);
				break;
			case 7:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}
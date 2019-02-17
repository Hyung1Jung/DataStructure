package hw7_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hw7_3:정형일");
		System.out.print("수식 입력: ");
		String value = input.nextLine();
		MyCharacterStack stack = new MyCharacterStack();

		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);

			if (c == '<' || c == '(')
				stack.push(c);
			else
				try {
					if (c == '>' && stack.peek() == '<')
						stack.pop();
					else if (c == ')' && stack.peek() == '(')
						stack.pop();
				} catch (Exception e) {
					stack.push('X');
				}
		}

		if (stack.isEmpty())
			System.out.println("올바른 괄호 수식입니다.");
		else
			System.out.println("잘못된 괄호 수식입니다.");
	}

}

package hw7_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hw7_3:������");
		System.out.print("���� �Է�: ");
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
			System.out.println("�ùٸ� ��ȣ �����Դϴ�.");
		else
			System.out.println("�߸��� ��ȣ �����Դϴ�.");
	}

}

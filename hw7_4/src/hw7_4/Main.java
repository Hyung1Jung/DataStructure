package hw7_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println("hw7_4: ������\n");
		System.out.print("����ǥ����� �Է�: ");
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		String[] values = value.split(" ");
		Stack<Double> stack = new Stack<Double>();

		try {
			for (String s : values) {
				if (!(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")))
					stack.push(Double.parseDouble(s));
				else {
					double d1 = stack.pop();
					double d2 = stack.pop();
					if (s.equals("+"))
						stack.push(d1 + d2);
					else if (s.equals("-"))
						stack.push(d1 - d2);
					else if (s.equals("*"))
						stack.push(d1 * d2);
					else
						stack.push(d1 / d2);
				}
			}

			double output = stack.pop();
			if (stack.isEmpty())
				System.out.println("���: " + Double.toString(output));
			else
				System.out.println("�߸��� �����Դϴ�.");
		} catch (Exception e) {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}

}

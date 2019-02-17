package hw7_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println("hw7_4: 정형일\n");
		System.out.print("후위표기수식 입력: ");
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
				System.out.println("결과: " + Double.toString(output));
			else
				System.out.println("잘못된 수식입니다.");
		} catch (Exception e) {
			System.out.println("잘못된 수식입니다.");
		}
	}

}

package hw11_1;

import java.util.Arrays;
import java.util.Scanner;

public class MyIntegerSortTest {
	public static void main(String[] args) {

		int n = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("hw11_1 : ������\n");

		System.out.print("���� ���� �Է� : ");		  // �迭 ũ�⸦ �Է� �ޱ� ���� ����  �Է�
		n = input.nextInt();
		int[] array = new int[n];

		System.out.print(n + "���� ���� �Է� : ");     // �迭 ���Ҹ� �Է� �ޱ� ���� ���� �Է�:
		for (int i = 0; i < array.length; i++) {
			int m = input.nextInt();
			array[i] = m;
		}

		System.out.print("���� �� �迭 : ");           // ���� �� �迭 ���� ��� ���
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		MyIntegerSort.mergeSort(array);           // �������� �������� ����

		System.out.print("���� �� �迭 : "); 	      // ���� �� �迭 ���� ��� ���
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}

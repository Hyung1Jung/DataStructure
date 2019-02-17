package hw11_1;

import java.util.Arrays;
import java.util.Scanner;

public class MyIntegerSortTest {
	public static void main(String[] args) {

		int n = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("hw11_1 : 정형일\n");

		System.out.print("정수 갯수 입력 : ");		  // 배열 크기를 입력 받기 위해 정수  입력
		n = input.nextInt();
		int[] array = new int[n];

		System.out.print(n + "개의 정수 입력 : ");     // 배열 원소를 입력 받기 위해 정수 입력:
		for (int i = 0; i < array.length; i++) {
			int m = input.nextInt();
			array[i] = m;
		}

		System.out.print("정렬 전 배열 : ");           // 정렬 전 배열 원소 모두 출력
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		MyIntegerSort.mergeSort(array);           // 오름차순 병합정렬 실행

		System.out.print("정렬 후 배열 : "); 	      // 정렬 후 배열 원소 모두 출력
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}

package hw5_1;

import java.util.Arrays;

public class MyArrayList {
	// 필드 설정
	private int[] array;
	private int number;

	public MyArrayList() {
		// 크기가 10인 정수 배열로 초기화
		array = new int[10];
		// 항목수 필드를 0으로 초기화
		number = 0;
	}

	// 원소 삽입 메소드(add) - 정수값을 매개변수로 받아 배열에 삽입
	public boolean add(int num) {
		// 배열이 가득차면 삽입하지 않고 false를 리턴
		if (number >= 10) {
			return false;
		}
		// 삽입 순서대로 배열의 앞부분부터 채우고 삽입에 성공하면 true를 리턴
		else {
			array[number] = num;
			number++;
			return true;
		}
	}

	// get - 인덱스를 매개변수로 받아 배열의 해당 정수값을 리턴
	public int get(int index) {
		if (array[index] < 10) {
		}
		return array[index];
	}

	// size - 리스트의 길이를 리턴(배열 크기가 아님)
	public int size() {
		return number;
	}

	// add - 인덱스와 정수값을 매개변수로 받아 배열의 해당 위치에 정수값을 삽입
	public void add(int index, int element) {
		for (int i = number; i >= index; i--) {
			array[i] = array[i - 1];
		}
		number++;
		array[index] = element;
	}

	// remove - 인덱스를 매개변수로 받아 배열의 해당 위치 정수값을 삭제하고 그 값을 리턴
	public int remove(int index) {
		int result = array[index];
		for (int i = index; i == number - 1; i++) {
			array[i] = array[i + 1];
		}
		number--;
		return result;
	}

	// toString 오버라이드 - 배열에 저장된 항목 전체를 문자열로 리턴
	@Override
	public String toString() {
		String arrayToString = "";
		for (int i = 0; i < number; i++) {
			arrayToString += array[i] + " ";
		}
		return arrayToString;
	}

}

package lab1_6;

import java.util.Arrays;

public class MyArrayList {
	// �ʵ� ����
	private int[] array;
	private int number;

	public MyArrayList() {
		// ũ�Ⱑ 10�� ���� �迭�� �ʱ�ȭ
		array = new int[10];
		// �׸�� �ʵ带 0���� �ʱ�ȭ
		number = 0;
	}

	// ���� ���� �޼ҵ�(add) - �������� �Ű������� �޾� �迭�� ����
	public boolean add(int num) {
		// �迭�� �������� �������� �ʰ� false�� ����
		if (number >= 10) {
			return false;
		}
		// ���� ������� �迭�� �պκк��� ä��� ���Կ� �����ϸ� true�� ����
		else {
			array[number] = num;
			number++;
			return true;
		}
	}

	// toString �������̵� - �迭�� ����� �׸� ��ü�� ���ڿ��� ����
	@Override
	public String toString() {
		String arrayToString = "";
		for (int i = 0; i < number; i++) {
			arrayToString += array[i] + " ";
		}
		return arrayToString;
	}
}

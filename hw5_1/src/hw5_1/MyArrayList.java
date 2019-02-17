package hw5_1;

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

	// get - �ε����� �Ű������� �޾� �迭�� �ش� �������� ����
	public int get(int index) {
		if (array[index] < 10) {
		}
		return array[index];
	}

	// size - ����Ʈ�� ���̸� ����(�迭 ũ�Ⱑ �ƴ�)
	public int size() {
		return number;
	}

	// add - �ε����� �������� �Ű������� �޾� �迭�� �ش� ��ġ�� �������� ����
	public void add(int index, int element) {
		for (int i = number; i >= index; i--) {
			array[i] = array[i - 1];
		}
		number++;
		array[index] = element;
	}

	// remove - �ε����� �Ű������� �޾� �迭�� �ش� ��ġ �������� �����ϰ� �� ���� ����
	public int remove(int index) {
		int result = array[index];
		for (int i = index; i == number - 1; i++) {
			array[i] = array[i + 1];
		}
		number--;
		return result;
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

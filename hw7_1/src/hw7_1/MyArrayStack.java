package hw7_1;

public class MyArrayStack {
	// ���� �迭�� ����ų ����, top��
	private int[] array;
	private int top = -1;
	private int stackSize = 0;

	public MyArrayStack() {
		array = new int[5];
	}

	public MyArrayStack(int size) {
		array = new int[size];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (stackSize == array.length) {
			return true;
		}
		return false;
	}

	public void push(int item) throws Exception {
		if (isFull() == true) {
			throw new Exception("�迭�� ��á���ϴ�.");
		} else {
			array[++top] = item;
			stackSize++;
		}
	}

	public int pop() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("�迭�� ����ֽ��ϴ�..");
		} else {
			stackSize--;
			return array[top--];
		}
	}

	public int peek() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("������ ����ֽ��ϴ�..");
		} else {
			return array[top];
		}
	}
}

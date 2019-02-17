package hw7_1;

public class MyArrayStack {
	// 정수 배열을 가리킬 변수, top등
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
			throw new Exception("배열이 꽉찼습니다.");
		} else {
			array[++top] = item;
			stackSize++;
		}
	}

	public int pop() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("배열이 비어있습니다..");
		} else {
			stackSize--;
			return array[top--];
		}
	}

	public int peek() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("스택이 비어있습니다..");
		} else {
			return array[top];
		}
	}
}

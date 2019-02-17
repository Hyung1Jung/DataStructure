package lab10_2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ���ϸ�: UndirectedListGraph.java
 * �ۼ���: 2018.11.27
 * �ۼ���: ������
 * ����: ������ �׷����� �����ϰ� �̿��ϴ� ���α׷�
 */

public class UndirectedListGraph {

	private class Node {
		int vertex;
		Node link;

		Node(int vertex) {
			this.vertex = vertex;
		}
	}
	// private �ν��Ͻ� ���� :
	// ������ �ʿ��� �������� ����

	private Node[] list;
	private int n;
	private boolean[] visited;

	// public �޼ҵ� :
	// ������ : ������ n�� �Ű������� �޾� ������ n���̰� ������ ���� �ʱ� �׷����� ����
	// �� ��, ������ n�� ũ�⸦ �����ϸ� �ȵ�(���� ��� n�� 100 ���ϸ� �۵��ϰ� �ϸ� �ȵ�)
	public UndirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}

	// HasEdag : ������ �̷�� �ΰ��� ���� v1, v2�� �Ű������� �޾� �� ���� ���� ���θ� ����
	public boolean hasEdge(int v1, int v2) {
		Node temp = list[v1];
		if (temp == null)
			return false;

		while (temp != null) {
			if (temp.vertex == v2)
				return true;
			temp = temp.link;
		}
		return false;
	}

	public void addEdge(int v1, int v2) {
		if (v1 < 0 || v1 >= n || v2 < 0 || v2 >= n)
			System.out.println("�׷����� ���� �����Դϴ�!");
		else if (hasEdge(v1, v2))
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		else {
			Node newNode = new Node(v1);
			newNode.link = list[v2];
			list[v2] = newNode;
			Node newNode2 = new Node(v2);
			newNode2.link = list[v1];
			list[v1] = newNode2;

		}
	}

	public void printAdjacentVertices(int v) {
		// list[v]�� �ִ� �������� ����ϴ� �޼ҵ�
		if (v < 0 || v > n - 1)
			System.out.println("���� ���� ��� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else {
			Node tmp = list[v];
			while (tmp != null) {
				System.out.print(tmp.vertex + " ");
				tmp = tmp.link;
			}
		}
	}

	public void breadthFirstSearch(int v) {
		if (v < 0 || v > n - 1)
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		else {
			for (int i = 0; i < n; i++)
				if (visited[i] == false)
					visited[v] = false;
					Queue<Integer> q = new <Integer>LinkedList(); // �ڹ� API�� Ŭ������ �̿��� ť ����
					q.offer(v);

					while (!q.isEmpty()) {
						int temp = q.remove(); // ť���� remove�� ���� temp�� ����
						System.out.print(temp + " "); // temp�� ���

						if (list[v] != null) {
							while (visited[list[v].vertex] == false) { // visited���� false�� ��
								visited[list[v].vertex] = true;
								q.offer(list[v].vertex); // ť�� list[v].vertex���� enQueue
					}

				}
			}
		}
	}
}

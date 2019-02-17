package lab10_2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 파일명: UndirectedListGraph.java
 * 작성일: 2018.11.27
 * 작성자: 정형일
 * 설명: 무방향 그래프를 생성하고 이용하는 프로그램
 */

public class UndirectedListGraph {

	private class Node {
		int vertex;
		Node link;

		Node(int vertex) {
			this.vertex = vertex;
		}
	}
	// private 인스턴스 변수 :
	// 구현에 필요한 변수들을 선언

	private Node[] list;
	private int n;
	private boolean[] visited;

	// public 메소드 :
	// 생성자 : 정점수 n을 매개변수로 받아 정점은 n개이고 간선은 없는 초기 그래프를 생성
	// 이 때, 정점수 n의 크기를 제한하면 안됨(예를 들어 n이 100 이하만 작동하게 하면 안됨)
	public UndirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}

	// HasEdag : 간선을 이루는 두개의 정점 v1, v2를 매개변수로 받아 이 간선 존재 여부를 리턴
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
			System.out.println("그래프에 없는 정점입니다!");
		else if (hasEdge(v1, v2))
			System.out.println("이미 존재하는 간선입니다.");
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
		// list[v]에 있는 정점들을 출력하는 메소드
		if (v < 0 || v > n - 1)
			System.out.println("인접 정점 출력 오류 - 잘못된 정점 번호입니다.");
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
			System.out.println("잘못된 정점 번호입니다.");
		else {
			for (int i = 0; i < n; i++)
				if (visited[i] == false)
					visited[v] = false;
					Queue<Integer> q = new <Integer>LinkedList(); // 자바 API의 클래스를 이용한 큐 생성
					q.offer(v);

					while (!q.isEmpty()) {
						int temp = q.remove(); // 큐에서 remove한 값을 temp에 저장
						System.out.print(temp + " "); // temp값 출력

						if (list[v] != null) {
							while (visited[list[v].vertex] == false) { // visited값이 false일 때
								visited[list[v].vertex] = true;
								q.offer(list[v].vertex); // 큐에 list[v].vertex값을 enQueue
					}

				}
			}
		}
	}
}

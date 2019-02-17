package lab10_1;

public class DirectedMatrixGraph {
	private int[][] matrix;
	int n;
	private boolean[] visited; // 탐색을 위한 boolean형 배열

	// 생성자 : 정점수 n을 매개변수로 받아 정점은 n개이고 간선은 없는 초기 그래프를 생성
	public DirectedMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	// 간선을 이루는 두개의 정점 v1, v2를 매겨변수로 받아 이 간선 존재 여부를 리턴
	public boolean hasEdge(int v1, int v2) {
		if (matrix[v1][v2] == 1) {
			return true;
		} else {
			return false;
		}
	}

	// 간선을 이루는 두개의 정점 v1, v2를 매개변수로 받아 그래프에 간선을 추가
	public void addEdge(int v1, int v2) {
		if (v1 < 0 || v1 > n - 1 || v2 < 0 || v2 > n - 1)
			System.out.println("잘못된 정점 번호입니다.");
		else if (hasEdge(v1, v2)) {
			System.out.println("이미 존재하는 간선입니다.");
		} else {
			matrix[v1][v2] = 1;
		}
	}

	// 정점을 매개변수로 받아 그 정점에 인접한 정점들을 모두 출력
	public void printAdjacentVertices(int v) {
		if (v < 0 || v > n - 1)
			System.out.println("잘못된 정점 번호");
		else {
			for (int i = 0; i < n; i++) {
				if (matrix[v][i] == 1)
					System.out.print(i + " ");
			}
		}
	}

	public void depthFirstSearch(int v) {
		if (v < 0 || v > n - 1)
			System.out.println("잘못된 정점 번호");
		else
			for (int i = 0; i < n; i++) {
				visited[i] = false;
			}
				System.out.print(v + " ");
				DFS(v);
	}

	private void DFS(int v) {
		visited[v] = true;
		for (int i = 0; i < n; i++) {
			if (matrix[v][i] == 1 && visited[i] == false) {
				System.out.print(i + " ");
				DFS(i);
			}
		}
	}
}
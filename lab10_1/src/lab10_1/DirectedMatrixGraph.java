package lab10_1;

public class DirectedMatrixGraph {
	private int[][] matrix;
	int n;
	private boolean[] visited; // Ž���� ���� boolean�� �迭

	// ������ : ������ n�� �Ű������� �޾� ������ n���̰� ������ ���� �ʱ� �׷����� ����
	public DirectedMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	// ������ �̷�� �ΰ��� ���� v1, v2�� �Űܺ����� �޾� �� ���� ���� ���θ� ����
	public boolean hasEdge(int v1, int v2) {
		if (matrix[v1][v2] == 1) {
			return true;
		} else {
			return false;
		}
	}

	// ������ �̷�� �ΰ��� ���� v1, v2�� �Ű������� �޾� �׷����� ������ �߰�
	public void addEdge(int v1, int v2) {
		if (v1 < 0 || v1 > n - 1 || v2 < 0 || v2 > n - 1)
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		else if (hasEdge(v1, v2)) {
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		} else {
			matrix[v1][v2] = 1;
		}
	}

	// ������ �Ű������� �޾� �� ������ ������ �������� ��� ���
	public void printAdjacentVertices(int v) {
		if (v < 0 || v > n - 1)
			System.out.println("�߸��� ���� ��ȣ");
		else {
			for (int i = 0; i < n; i++) {
				if (matrix[v][i] == 1)
					System.out.print(i + " ");
			}
		}
	}

	public void depthFirstSearch(int v) {
		if (v < 0 || v > n - 1)
			System.out.println("�߸��� ���� ��ȣ");
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
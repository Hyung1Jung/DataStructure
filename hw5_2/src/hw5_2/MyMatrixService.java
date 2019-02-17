package hw5_2;

public class MyMatrixService {

	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��
	public static int[][] multiply(int[][] x, int[][] y) {
		
		int[][] z = new int[x.length][y[0].length];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[0].length; j++) {
				for (int k = 0; k < x[0].length; k++) {
					z[i][j] += x[i][k] * y[k][j];
				}

			}

		}
		return z;

	}

	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���
	public static void print(int[][] z) {
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[0].length; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();

		}
	}
	
}
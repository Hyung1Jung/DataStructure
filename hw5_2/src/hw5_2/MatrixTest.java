package hw5_2;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hw5_2 : ������\n");

		// ��� x,y�� ���� ���Ͽ� ���

		int[][] x = { { 4, 4, 4, 4, 4, 4 }, 
					  { 4, 4, 4, 4, 4, 4 }, 
					  { 4, 4, 4, 4, 4, 4 }, 
					  { 4, 4, 4, 4, 4, 4 },
					  { 4, 4, 4, 4, 4, 4 }, 
					  { 4, 4, 4, 4, 4, 4 } 
					  };
		
		int[][] y = { { 2, 2, 2, 2, 2, 2 }, 
					  { 2, 2, 2, 2, 2, 2 }, 
					  { 2, 2, 2, 2, 2, 2 }, 
					  { 2, 2, 2, 2, 2, 2 },
				      { 2, 2, 2, 2, 2, 2 }, 
				      { 2, 2, 2, 2, 2, 2 } 
				      };
		
		int[][] z = MyMatrixService.multiply(x, y);
		
		MyMatrixService.print(z);
		
		System.out.println();
		
		// ��� a, b�� ���� ���Ͽ� ���
		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 1, 2, 3 }, { 4, 5, 6 } };
		
		int[][] b = { { 1, 1, 1, 1, -3 }, { 1, 2, 3, 4, 5 }, { -2, 0, 6, 9, 12 } };
		
		int[][] c = MyMatrixService.multiply(a, b);
		
		MyMatrixService.print(c);
	}
}




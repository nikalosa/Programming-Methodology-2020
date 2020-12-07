import java.util.LinkedList;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		int[][] matrix = { { 1, 2, 3 }, { 8, 4, 7 }, { 9, 5, 6 } };
		
//		int n = readInt();
//		int m = readInt();
//		int[][] matrix = readMatrix(n, m);

		boolean magic = magicMatrix(matrix);

		if (magic) {
			println("Yoo this matrix is magic");
		} else {
			println("No");
		}

	}

	private int[][] readMatrix(int n, int m) {

		int[][] matrix = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = readInt();
			}
		}
		return matrix;
	}

	private boolean magicMatrix(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;
		if (n != m) {
			return false;
		}
		boolean[] count = new boolean[n * n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int num = matrix[i][j];
				if (count[num] || num < 1 || num > n * n) {
					return false;
				}
				count[num] = true;
			}
		}
		return true;

	}

}
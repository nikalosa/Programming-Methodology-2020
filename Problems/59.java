import java.util.LinkedList;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		
		int[][] matrix = {{0,1,1,0,0,1,0,0},
						  {0,1,1,1,1,1,0,0},
						  {0,0,1,1,1,1,0,0},
						  {0,0,1,1,1,1,0,0}};
		
		int[][] matrix2 = {{0,1,0,1,0,1,0,0},
				  		   {0,0,1,0,1,0,0,0},
				  		   {0,0,0,1,0,1,0,0},
				  		   {0,0,1,0,1,0,0,0}};
		
		int maxArea = maxRect(matrix2);
		
		println("Rectangular with max area is: " + maxArea);
		
	}

	private int maxRect(int[][] matrix) {
		int maxArea = 0;
		
		int n = matrix.length;
		int m = matrix[0].length;

		for (int i_start = 0; i_start < n; i_start++) {
			for (int j_start = 0; j_start < m; j_start++) {

				for (int i_end = i_start; i_end < n; i_end++) {
					for (int j_end = j_start; j_end < m; j_end++) {

						boolean all_ones = check_ones(matrix, i_start, j_start, i_end, j_end);
						
						if(all_ones) {
							int height = i_end - i_start + 1;
							int width = j_end - j_start + 1;
							
							maxArea = Math.max(height * width, maxArea);
							
						}
					}
				}

			}
		}

		return maxArea;
	}

	private boolean check_ones(int[][] matrix, int i_start, int j_start, int i_end, int j_end) {
		
		for(int i = i_start; i <= i_end; i++) {
			for(int j = j_start; j <= j_end; j++) {
				if(matrix[i][j] == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
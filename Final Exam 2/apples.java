import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		int [][] world = { {0,0,0,0}, {1,1,2,1}, {0,1,2,1}, {0,2,0,0}};
		String [] coms = {"move", "left", "left", "left", "move", "move", "move", "left", "left", "left", "move", "left", "left", "left", "move"};
		List <String> commands = new ArrayList<String>(Arrays.asList(coms));
		
		println(helpRobot(world, commands));
	}

	public int helpRobot(int [][] world, List <String> commands) {
		int n = world.length;
		int m = world[0].length;
		
		int apples = 0;
		int dir = 0;
		int i=0, j=0;
		
		if(world[0][0] == 1) {
			apples = 1;
			world[0][0] = 0;
		}
		
		for(String command : commands) {
			if(command.equals("left")) {
				dir = (dir + 1) % 4;
			}else {
				
				int step_i = 0;
				int step_j = 0;
				if(dir == 0) {
					step_j = 1;
				}else if(dir == 1) {
					step_i = -1;
				}else if(dir == 2) {
					step_j = -1;
				}else {
					step_i = 1;
				}
				
				if(validate(world, i+step_i, j+step_j, n, m)) {
					i += step_i;
					j += step_j;
				}
				if(world[i][j] == 1) {
					world[i][j] = 0;
					apples ++;
				}
			}
		}
		return apples;
	}

	private boolean validate(int[][] world, int i, int j, int n, int m) {
		if (i >= 0 && i < n && j >= 0 && j < m && world[i][j] != 2) {
			return true;
		}
		return false;
	}

}

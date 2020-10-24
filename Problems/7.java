/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class KarelProgramSample extends SuperKarel {

	// You fill in this part
	
	@Override
	public void run() {
		turnLeft();
		while(frontIsClear()) {
			fillLine();
			getBack();
			move();
		}
		fillLine();
	}
	
	public void fillLine() {
		turnRight();
		while(frontIsClear()) {
			ifNotBeeperPut();
			move();
		}
		ifNotBeeperPut();
	}
	
	public void getBack() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnRight();
	}
	
	public void ifNotBeeperPut() {
		if(!beepersPresent()) {
			putBeeper();
		}
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}

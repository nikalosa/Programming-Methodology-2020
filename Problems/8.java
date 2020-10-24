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
		jumpTwoLeft();
		turnAround();
		while(beepersPresent()) {
			subtract();
		}
		move();
		
		while(beepersPresent()) {
			takeBeeper();
		}
	}
	
	public void jumpTwoLeft() {
		turnLeft();
		move();
		move();
	}
	
	public void subtract() {
		pickBeeper();
		move();
		pickBeeper();
		turnAround();
		move();
		turnAround();
	}
	
	public void takeBeeper() {
		pickBeeper();
		turnAround();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
	}
}
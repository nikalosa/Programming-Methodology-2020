/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class Multiplication extends SuperKarel {

	// You fill in this part
	
	@Override
	public void run() {
		startPosition();
		while(beepersPresent()) {
			pickBeeper();
			move();
			duplicateBeepers();
			fillPlace();
			returnThreeStepsBack();
		}
	}
	
	public void duplicateBeepers() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			returnTwoStepsBack();
		}
	}
	
	public void fillPlace() {
		move();
		move();
		
		while(beepersPresent()) {
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
	
	public void startPosition() {
		turnLeft();
		move();
	}

	public void returnTwoStepsBack() {
		turnAround();
		move();
		move();
		turnAround();
	}	
	
	public void returnThreeStepsBack() {
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
	
}

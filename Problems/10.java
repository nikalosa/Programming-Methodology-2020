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
		startPosition();
		while(beepersPresent()) {
			increaseAnswer();
			while(beepersPresent()) {
				substract();
			}
			fillM();
			turnAround();
			move();
		}
	}
	
	private void startPosition() {
		turnLeft();
		move();
	}
	
	private void increaseAnswer() {
		move();
		move();
		putBeeper();
		turnAround();
		move();
	}
	
	private void substract() {
		pickBeeper();
		move();
		pickBeeper();
		move();
		putBeeper();
		
		// get back to 3x1
		turnAround();
		move();
		move();
		turnAround();
	}
	
	private void fillM() {
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
}

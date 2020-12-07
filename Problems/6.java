import stanford.karel.*;

public class KarelProgramSample extends SuperKarel {

	// You fill in this part
	
	@Override
	public void run() {

		turnLeft();
		deal2x1();
		deal3x1();

		
	}
	
	// take 3x1 beepers and put them on 4x1
	public void deal3x1() {
		move();
		while(beepersPresent()) {
			pickAndMove();
			putAndMove();
			turnAround();
		}
	}
	// take 2x1 beepers and put them on 4x1
	public void deal2x1() {
		move();
		// picks beeper from 2x1, puts on 4x and returns on 2x1
		while(beepersPresent()) {
			pickAndMove();
			move();
			putAndMove();
			move();
			turnAround();
		}
	}
	
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void pickAndMove() {
		pickBeeper();
		move();
	}
	public void putAndMove() {
		putBeeper();
		turnAround();
		move();
	}
	public void goRight() {
		turnRight();
		move();
	}
	public void goBack() {
		turnAround();
		move();
	}
}

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
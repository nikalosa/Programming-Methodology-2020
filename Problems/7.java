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

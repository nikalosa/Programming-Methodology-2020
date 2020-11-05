
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class ConsoleProgrammSample extends ConsoleProgram {

	private int money = 10000;
	private RandomGenerator rgen = new RandomGenerator().getInstance();

	public void run() {

		while (money > 0) {

			int choseNumber = chooseNumber();
			int bet = chooseBet();

			int randR = rgen.nextInt(0, 36);
			if (randR == choseNumber) {
				money += bet;
				println("Congrats! Money won: " + bet + "; Total amount of money: " + money);
			} else {
				money -= bet;
				println("Looser! Money lost: " + bet + "; Total amount of money: " + money);
				println("Winning number: " + randR);
			}
		}
	}

	private int chooseNumber() {
		while (true) {
			int number = readInt("Choose number: ");
			if (number > 36 || number < 0) {
				println("Invalid number, choose again!");
			} else {
				return number;
			}
		}
	}

	private int chooseBet() {
		while (true) {
			int bet = readInt("Your bet: ");
			if (bet > this.money || bet <= 0) {
				println("Invalid bet, choose again!");
			} else {
				return bet;
			}
		}
	}
}

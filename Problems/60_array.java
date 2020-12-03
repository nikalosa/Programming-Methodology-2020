
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.util.ArrayList;
import java.util.LinkedList;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	private int arrayLength = 2;

	public void run() {

		int i = 0;
		int[] arr = new int[arrayLength];

		while (true) {
			int num = readInt("Next number: ");
			if (num == -1) {
				break;
			}
			arr[i] = num;
			i++;

			if (i == arrayLength) {
				
				arr = increaseArr(arr);
				printArr(arr);
				arrayLength *= 2;
			}

		}
		
		printReverse(arr, i);

	}

	private void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			print(arr[i] + " ");
			
		}
		println("\n////////////////");
	}

	private int[] increaseArr(int[] arr) {

		int[] newArr = new int[arrayLength * 2];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		return newArr;

	}

	private void printReverse(int[] arr, int start) {
		for (int i = start - 1; i >= 0; i--) {
			println(arr[i]);
		}
	}

}
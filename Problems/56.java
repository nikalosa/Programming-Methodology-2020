import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	private int arrayLength = 2;

	public void run() {

		int n = readInt("n: ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = readInt("Next number: ");
		}

		sort(arr);
		printArr(arr);
	}

	private void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minNumb = Integer.MAX_VALUE;
			int minIndex = n;
			for (int j = i + 1; j < n; j++) {
				if (minNumb > arr[j]) {
					minNumb = arr[j];
					minIndex = j;
				}
			}
			if (arr[i] > minNumb) {
				arrSwap(arr, i, minIndex);
			}
		}
	}

	private void arrSwap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	private void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			print(arr[i] + " ");
		}
		println();
	}

}
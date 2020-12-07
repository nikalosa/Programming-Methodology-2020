import java.util.HashMap;
import java.util.Map;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		int n = readInt("N: ");
		int m = readInt("M: ");

		int answer = 0;

		for (int i = 0; i < n; i++) {

			int num = readInt("");

			answer += getValue(hashMap, m - num);
			updateMap(hashMap, num);

		}

		println(answer);

	}

	private int getValue(HashMap<Integer, Integer> hashMap, int x) {
		Integer find = hashMap.get(x);
		if (find == null) {
			return 0;
		}
		return find.intValue();
	}

	private void updateMap(HashMap<Integer, Integer> hashMap, int num) {
		Integer val = hashMap.get(num);
		if (val == null) {
			hashMap.put(num, 1);
		} else {
			hashMap.replace(num, val.intValue() + 1);
		}
	}

}
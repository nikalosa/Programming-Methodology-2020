import java.util.HashMap;
import java.util.Map;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		while (true) {
			String name = readLine("Next name: ");
			if (name.equals("")) {
				break;
			}

			updateHashMap(hashMap, name);

		}

		printKeyValues(hashMap);

	}	
	

	private void printKeyValues(HashMap<String, Integer> hashMap) {

		for(String name : hashMap.keySet()) {
			println(name + ": " + hashMap.get(name));
		}

	}

	private void updateHashMap(HashMap<String, Integer> hashMap, String name) {
		if (!hashMap.containsKey(name)) {
			hashMap.put(name, 1);
		} else {
			hashMap.replace(name, hashMap.get(name) + 1);
		}

	}

}

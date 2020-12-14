import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		ArrayList<String> allNames = new ArrayList<String>();

		while (true) {
			String s = readLine();

			if (s.equals("")) {
				break;
			}

			StringTokenizer tokenizer = new StringTokenizer(s, " ");
			String A = tokenizer.nextToken();

			if (!tokenizer.hasMoreTokens()) {
				println("Invalid input. Enter again:");
				continue;
			}
			String B = tokenizer.nextToken();

			updateHm(hm, B, A);
			addName(allNames, A);
			addName(allNames, B);

		}

		printFriends(hm);
		
		findXY(hm, allNames);

	}

	
	
	private void printFriends(HashMap<String, ArrayList<String>> hm) {
		
		println("//////////////////////////////////");
		println("Friends List");
		
		for (String key : hm.keySet()) {
			print(key + ": ");
			ArrayList<String> val = hm.get(key);
			for (String friend : val) {
				print(friend + ", ");
			}
			println();
		}
		println("//////////////////////////////////");
	}
	
	private void addName(ArrayList<String> allNames, String name) {
		if (!allNames.contains(name)) {
			allNames.add(name);
		}

	}

	private void findXY(HashMap<String, ArrayList<String>> hm, ArrayList<String> allNames) {
		
		println("Pairs without common friends");
		
		for (int i = 0; i < allNames.size(); i++) {
			for (int j = i + 1; j < allNames.size(); j++ ) {
				
				String x = allNames.get(i);
				String y = allNames.get(j);
				
				if (!hasCommonFriend(x, y, hm)) {
					println(x + " and " + y + " don't have a common friend!");
				}
			}
		}

	}

	private boolean hasCommonFriend(String x, String y, HashMap<String, ArrayList<String>> hm) {

		if(!hm.containsKey(x) || !hm.containsKey(y)) {
			return false;
		}
		
		ArrayList <String> friendsX = hm.get(x);
		ArrayList <String> friendsY = hm.get(y);
		
		
		for (String f : friendsX) {
			if (friendsY.contains(f)) {
				return true;
			}
		}

		return false;
	}

	private void updateHm(HashMap<String, ArrayList<String>> hm, String B, String A) {
		if (!hm.containsKey(B)) {
			hm.put(B, new ArrayList<String>());
		}
		ArrayList<String> friends = hm.get(B);
		friends.add(A);
	}

}

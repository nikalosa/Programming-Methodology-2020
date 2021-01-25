import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();

		hm1.put("gela", 15);
		hm1.put("vano", 20);
		hm1.put("petre", 13);
		hm1.put("ilia", 17);

		hm2.put("salome", 30);
		hm2.put("vano", 15);
		hm2.put("ilia", 24);

		ArrayList<HashMap<String, Integer>> hms = new ArrayList<HashMap<String, Integer>>();
		hms.add(hm1);
		hms.add(hm2);

		HashMap<String, ArrayList<Integer>> merged = merge(hms);

		for (String name : merged.keySet()) {
			print(name + ": ");
			for (int val : merged.get(name)) {
				print(val + " ");
			}
			println("");
		}
	}

	public HashMap<String, ArrayList<Integer>> merge(ArrayList<HashMap<String, Integer>> hms) {
		HashMap<String, ArrayList<Integer>> merged = new HashMap<String, ArrayList<Integer>>();
		for (HashMap<String, Integer> hm : hms) {
			for (String name : hm.keySet()) {
				if (!merged.containsKey(name)) {
					merged.put(name, new ArrayList<Integer>());
				}
				merged.get(name).add(hm.get(name));
			}
		}
		return merged;
	}
}

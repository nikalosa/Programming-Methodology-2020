import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
		String s1 = readLine("");
		String s2 = readLine("");

		Map<String, Integer> mp = new HashMap<String, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			String incSubstr = "";
			for (int j = i; j < s1.length(); j++) {
				if (j == i || s1.charAt(j) > s1.charAt(j - 1)) {
					incSubstr = incSubstr + s1.charAt(j);
					mp.put(incSubstr, 1);
				}else {	
					break;
				}
			}
		}
		
		int maxSize = 0;
		String answer = "";
		
		for (int i = 0; i < s2.length(); i++) {
			String incSubstr = "";
			for (int j = i; j < s2.length(); j++) {
				if (j == i || s2.charAt(j) > s2.charAt(j - 1)) {
					incSubstr = incSubstr + s2.charAt(j);
					if(mp.containsKey(incSubstr) && maxSize < j - i + 1) {
						maxSize = j - i + 1;
						answer = incSubstr;
					}
				}else {
					break;
				}
			}
		}
		println(answer);
	}

}

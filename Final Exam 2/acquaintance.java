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
		println(acquaintance("hello old world"));
	}

	public String acquaintance(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s);
		List <String> words = new ArrayList <String>();
		while(tokenizer.hasMoreTokens()) {
			words.add(tokenizer.nextToken());
		}
		
		int maxLen = 0;
		String answer = "";
		
		for(int i=0;i<words.size();i++) {
			for(int j=i+1;j<words.size();j++) {
				String s1 = words.get(i);
				String s2 = words.get(j);
				if(s1.equals(s2)) {
					continue;
				}
				if(isAcquaintance(s1, s2) && maxLen < s1.length() + s2.length()) {
					maxLen = s1.length() + s2.length();
					answer = s1 + ":" + s2;
				}else if(isAcquaintance(s2, s1) && maxLen < s1.length() + s2.length()) {
					maxLen = s1.length() + s2.length();
					answer = s2 + ":" + s1;
				}
			}
		}
		return answer;
	}

	private boolean isAcquaintance(String s1, String s2) {
		int secondStringIterator = 0;
		for(int i=0;i<s1.length();i++) {
			boolean found = false;
			for(int j=secondStringIterator;j<s2.length();j++) {
				if(s2.charAt(j) == s1.charAt(i)) {
					found = true;
					secondStringIterator = j + 1;
					break;
				}
			}
			if(!found) {
				return false;
			}
		}
		return true;
	}
}



/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		String filetext = readFile("poema.txt");

		int symbolsNum = countSymbols(filetext);
		int wordsNum = countWords(filetext);
		int sentenceNum = countSentences(filetext);

		println("The text is: " + filetext);

		println("Number of symbols in a text: " + symbolsNum);
		println("Number of words in a text: " + wordsNum);
		println("Number of sentences in a text: " + sentenceNum);
		println("\t Sentences end with . is " + occurChar(filetext, '.'));
		println("\t Sentences end with ! is " + occurChar(filetext, '!'));
		println("\t Sentences end with ? is " + occurChar(filetext, '?'));
	}

	private int countSymbols(String s) {
		return s.length();
	}

	private int countWords(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s, " ");
		return tokenizer.countTokens();
	}

	private int countSentences(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s, ".!?");
		return tokenizer.countTokens();
	}

	private int occurChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	private String readFile(String path) {
		String file = new String("");
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				file += line + "\n";
			}

		} catch (IOException e) {
			e.printStackTrace();
			println("IO error");
		}
		return file;
	}

}

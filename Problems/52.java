import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
	
		String file = readFile("ConsoleProgrammSample.java");
		println(file);
		
	}
	
	private String readFile(String path) {
		String file = new String("");
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) {
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


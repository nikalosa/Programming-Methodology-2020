import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		List <String> items = new ArrayList<String>();
		List <Integer> costs = new ArrayList<Integer>();
		
		items.add("a");
		items.add("b");
		items.add("c");
		
		costs.add(110);
		costs.add(10);
		costs.add(9);
		
		println(greedyCustomer(120, items, costs));
		
	}
	
	public String greedyCustomer(int budget, List <String> items, List <Integer> costs) {
		
		String lastBoughtItem = "";
		List <Integer> boughtItems = new ArrayList <Integer>();
		
		for(int i=0;i<items.size();i++) {
			while(budget < costs.get(i) && boughtItems.size() > 0) {
				int lastInd = boughtItems.get(boughtItems.size()-1);
				budget += costs.get(lastInd);
				boughtItems.remove(boughtItems.size()-1);
			}
			if(budget >= costs.get(i)) {
				budget -= costs.get(i);
				boughtItems.add(i);
			}
			
		}
		
		if(boughtItems.size() == 0) {
			return "";
		}
		int lastInd = boughtItems.get(boughtItems.size()-1);
		return items.get(lastInd);
	}

}

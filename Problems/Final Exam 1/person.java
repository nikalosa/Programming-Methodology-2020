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

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {

		Map<String, ArrayList<Person>> friends = new HashMap<String, ArrayList<Person>>();
		
		
		// just creating some test
		Person gio = new Person("Gio", 19);
		Person mari = new Person("Mari", 19);
		Person ani = new Person("Ani", 22);
		Person luka = new Person("Luka", 21);
		Person beqa = new Person("Beqa", 23);
		Person nini = new Person("Nini", 16);

		ArrayList<Person> gioFriends = new ArrayList<Person>();
		ArrayList<Person> mariFriends = new ArrayList<Person>();
		ArrayList<Person> aniFriends = new ArrayList<Person>();
		ArrayList<Person> lukaFriends = new ArrayList<Person>();
		ArrayList<Person> beqaFriends = new ArrayList<Person>();
		ArrayList<Person> niniFriends = new ArrayList<Person>();

		gioFriends.add(mari);
		gioFriends.add(beqa);
		gioFriends.add(luka);

		mariFriends.add(gio);
		mariFriends.add(nini);
		mariFriends.add(beqa);

		aniFriends.add(luka);

		lukaFriends.add(ani);
		lukaFriends.add(gio);

		beqaFriends.add(gio);
		beqaFriends.add(mari);
		beqaFriends.add(nini);

		niniFriends.add(mari);
		niniFriends.add(beqa);

		friends.put("Gio", gioFriends);
		friends.put("Mari", mariFriends);
		friends.put("Ani", aniFriends);
		friends.put("Luka", lukaFriends);
		friends.put("Beqa", beqaFriends);
		friends.put("Nini", niniFriends);
		// finish test creating

		List<Person> personList = getPersons(friends);

		for (int i = 0; i < personList.size(); i++) {
			print(personList.get(i).getName() + " ");
		}

	}

	private List<Person> getPersons(Map<String, ArrayList<Person>> friends) {
		Map<String, Person> nameToPerson = matchPersonName(friends);

		double averageAge = getAverageAll(friends, nameToPerson);

		List<Person> personList = new ArrayList<Person>();

		for (String name : friends.keySet()) {
			double averageFriendsAge = getFriendsAverageAge(friends.get(name));
			if (averageFriendsAge < averageAge) {
				personList.add(nameToPerson.get(name));
			}
		}
		return personList;
	}

	private double getFriendsAverageAge(ArrayList<Person> friendsList) {
		int ageSum = 0;
		for (Person person : friendsList) {
			ageSum += person.getAge();
		}
		return (double) ageSum / friendsList.size();
	}

	private Map<String, Person> matchPersonName(Map<String, ArrayList<Person>> friends) {
		Map<String, Person> nameToPerson = new HashMap<String, Person>();
		for (String name : friends.keySet()) {
			for (Person person : friends.get(name)) {
				if (!nameToPerson.containsKey(person.getName())) {
					nameToPerson.put(person.getName(), person);
				}
			}
		}
		return nameToPerson;
	}

	private double getAverageAll(Map<String, ArrayList<Person>> friends, Map<String, Person> nameToPerson) {
		int ageSum = 0;
		for (String name : friends.keySet()) {
			ageSum += nameToPerson.get(name).getAge();
		}
		return (double) ageSum / friends.size();
	}

}

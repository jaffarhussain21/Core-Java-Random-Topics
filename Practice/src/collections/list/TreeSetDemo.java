package collections.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
	}

	public static void addElements() {
		Set<String> mySet = new TreeSet<String>();
		mySet.add("India");
		mySet.add("United States");
		mySet.add("Australia");
		mySet.add("UAE");
		mySet.add("Hungary");
		mySet.add("India");

		getElements(mySet);
	}

	public static void getElements(Set<String> mySet) {
		for (String set : mySet) {
			System.out.println(set);
		}
		// System.out.println(myList.get(2));

		// System.out.println(myList);
	}

}

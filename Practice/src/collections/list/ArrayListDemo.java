package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
	}

	public static void addElements() {
		List<String> myList = new ArrayList<String>();
		myList.add("India");
		myList.add("United States");
		myList.add("Australia");
		myList.add("UAE");
		myList.add("Hungary");
		myList.add("India");

		getElements(myList);
	}

	public static void getElements(List<String> myList) {
		for (String list : myList) {
			System.out.println(list);
		}
	//	System.out.println(myList.get(2));

	//	System.out.println(myList);
	}
}

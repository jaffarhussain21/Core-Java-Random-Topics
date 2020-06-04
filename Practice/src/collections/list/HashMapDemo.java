package collections.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
	}

	public static void addElements() {
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("India", "Delhi");
		myMap.put("USA", "Washington");
		myMap.put("UAE", "AbuDhabi");
		getElements(myMap);
	}

	public static void getElements(Map<String, String> myMap) {
		Iterator<Entry<String, String>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println(myMap.get("India"));
		System.out.println(myMap.get("UAE"));

		// System.out.println(myList);
	}

}

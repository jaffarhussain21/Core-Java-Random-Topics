package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWithListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
	}

	public static void addElements() {
		Map<String, List<String>> myMap = new HashMap<String, List<String>>();
		myMap.put("India", new ArrayList<String>(Arrays.asList("Delhi", "Mumbai", "Hyderabad")));
		myMap.put("USA", new ArrayList<String>(Arrays.asList("Washington", "Newyork", "LasVegas")));
		myMap.put("UAE", new ArrayList<String>(Arrays.asList("Dubai", "AbuDhabi", "Sharjah")));
		getElements(myMap);
	}

	public static void getElements(Map<String, List<String>> myMap) {
		Iterator<Entry<String, List<String>>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, List<String>> entry = iterator.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

}

package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add(new String("Hello"));// String Object
		list.add(new String("World"));// Integer Object
		list.add("Welcome");// Date Object

		System.out.println(list);
	}
}

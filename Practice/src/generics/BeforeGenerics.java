package generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeforeGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(new String("Hello"));// String Object
		list.add(new Integer(5));// Integer Object
		list.add(new Date());// Date Object

		System.out.println(list);
	}

}

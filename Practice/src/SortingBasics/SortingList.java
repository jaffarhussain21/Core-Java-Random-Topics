package SortingBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<String>();
		stringList.add("Ball");
		stringList.add("Cat");
		stringList.add("Apple");
		stringList.add("London");
		stringList.add("Denmark");
		stringList.add("India");

		System.out.println("Before Sorting: " + stringList);
		Collections.sort(stringList);
		System.out.println("After Sorting: " + stringList);

		List<Player> playerList = new ArrayList();
		playerList.add(new Player(2, "ABC", 30));
		playerList.add(new Player(1, "XYZ", 25));
		playerList.add(new Player(3, "PQR", 33));

		System.out.println("Before Sorting: " + playerList);
		Collections.sort(playerList);
		System.out.println("After Sorting: " + playerList);

	}

}

package SortingBasics;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Sorting
		String[] stringArray = new String[5];
		stringArray[0] = "Apple";
		stringArray[1] = "Cat";
		stringArray[2] = "Tiger";
		stringArray[3] = "Zebra";
		stringArray[4] = "Ball";

		System.out.println("Before Sorting: " + stringArray[0] + stringArray[1] + stringArray[2] + stringArray[3]
				+ stringArray[4]);

		Arrays.sort(stringArray);

		System.out.println(
				"After Sorting: " + stringArray[0] + stringArray[1] + stringArray[2] + stringArray[3] + stringArray[4]);

		// Integer Sorting
		Integer[] intArray = new Integer[5];
		intArray[0] = new Integer(3);
		intArray[1] = new Integer(50);
		intArray[2] = new Integer(90);
		intArray[3] = new Integer(1);
		intArray[4] = new Integer(30); 
		

		System.out.println("Before Sorting: " + intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4]);

		Arrays.sort(intArray);

		System.out.println("After Sorting: " + intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4]);

	}

}

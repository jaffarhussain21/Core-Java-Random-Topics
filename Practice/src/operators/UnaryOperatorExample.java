package operators;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//++ -- +

		int counter = 0;

		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				// counter = counter + 1;
				System.out.println("Before Value:" + (++counter));
				// System.out.println("After Value:" + (counter++));

			}
		}

		String s1 = "HELLO";
		String s2 = "WORLD";
		System.out.println("Counter Value:" + counter);
		System.out.println(s1 + s2);

	}

}

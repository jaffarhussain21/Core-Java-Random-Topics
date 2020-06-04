package decisionStatements;

public class SwitchExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 25 is divisible by 5

		int i = 10;
		for (i = 0; i <= 10; i++) {
			System.out.println(i);
			switch (i) {
			case 2:
				System.out.println("2 is present");
				break;

			case 5:
				System.out.println("5 is present");
				break;

			case 10:
				System.out.println("10 is present");
				break;

			default:
				System.out.println(i + " !!!NOT MATCHED !!!");
			}

		}

	}
}

package decisionStatements;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			} else {
				continue;
			}
			// System.out.println("After continue"); this code is never reached.
		}
	}


}

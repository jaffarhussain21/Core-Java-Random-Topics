package operators;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 2;
		
		i = i+j;
		i  = i / j;
		i = i % j;
		System.out.println(i);
		System.out.println(i+=j);
		System.out.println(i/=j);
		System.out.println(i%=j);
		

		/*if (i < j) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}*/
		
		System.out.println(i < j ? true : false);

	}

}

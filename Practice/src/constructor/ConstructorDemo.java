package constructor;

public class ConstructorDemo {

	/**
	 * Difference between method & constructor 1. Method can have a return type, but
	 * constructor cannot. 2. Constructor should have the same name as of your
	 * class. 3. Constructors are invoked when you create an object, you cannot not
	 * call a constructor explicitly. 4. Methods are invoked when you invoke them
	 * with the created objects.
	 * 
	 * @param args
	 */

	public String databaseConnection;

	public ConstructorDemo() {
		System.out.println("!!! Constructor called !!!");
	}

	public ConstructorDemo(String databaseConnection) {
		System.out.println("!!! Constructor databaseConnection called !!!");
		this.databaseConnection = databaseConnection;
	}

	public ConstructorDemo(String databaseConnection, int a) {
		System.out.println("!!! Constructor databaseConnection and int called !!!");
		this.databaseConnection = databaseConnection;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo c1 = new ConstructorDemo("Connetion Object");
		ConstructorDemo c2 = new ConstructorDemo("Connetion Object", 10);
		System.out.println(c.add(10, 20));
	}

}

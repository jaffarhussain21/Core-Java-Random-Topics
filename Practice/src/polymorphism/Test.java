package polymorphism;

import inheritence.AudiImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Car audi = new Audi(); audi = new Car(); Car bmw = new BMW();
		 * audi.setEngineNumber(12345); bmw.setEngineNumber(54321);
		 * System.out.println(audi.getEngineNumber());
		 * System.out.println(bmw.getEngineNumber());
		 */
		Car audiImpl = new AudiImpl();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	// IS-A relationship
	// Dog is a Animal - True
	// Audi is a Car- True
	// BMW is Audi- False
	// BMW is a Car- True

	// Abstraction
	// Encapsulation
	// Inheritance
	// Polymorphism
}

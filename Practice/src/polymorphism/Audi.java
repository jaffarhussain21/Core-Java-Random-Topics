package polymorphism;

public class Audi extends Car {
	public Audi() {
		System.out.println("!!! Audi Constructor Called !!!");
	}

	public Audi(String var) {
		System.out.println("!!! Audi another Constructor Called !!!" + var);
	}

	@Override
	public void setEngineNumber(int engineNumber) {
		// TODO Auto-generated method stub
		super.setEngineNumber(engineNumber);
	}

	// Constructor Chaining
	// Car->Audi->AudiImpl
}

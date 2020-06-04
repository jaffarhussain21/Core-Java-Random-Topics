package inheritence;

import polymorphism.Audi;

public class AudiImpl extends Audi {
	public String car = "Car";

	public AudiImpl() {
		super("!!! Parameterised Constructor !!!");
		System.out.println("!!! AudiImpl Constructor Called !!!");
	}
}

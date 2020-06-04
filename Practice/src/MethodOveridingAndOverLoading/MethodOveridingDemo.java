package MethodOveridingAndOverLoading;

public class MethodOveridingDemo extends Calculate {
	/**
	 * Method Overriding child class you have different method with same method name
	 * as in your parent class with same parameters Rules of method overriding:
	 * 1.Same parameters. 2.It must have same written type. 3.Method name should be
	 * same.
	 * 
	 * Dynamic Binding - Runtime
	 * 
	 * @return
	 */
	public String defaultRule() {
		return "Customised Rule";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new Calculate();
		System.out.println(c.defaultRule());
		Calculate m = new MethodOveridingDemo();
		System.out.println(m.defaultRule());
	}

}

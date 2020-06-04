package MethodOveridingAndOverLoading;

public class MethodOverloadingDemo {
	/**
	 * Method Overloading Same class you have different method with same method name
	 * and different parameters
	 * Rules of method overloading:
	 * 1. Different parameters.
	 * 2. It can have same written type.
	 * 3. Method name should be same.
	 * 
	 * Static Binding - Compiletime 
	 * @param a
	 * @param b
	 * @return
	 */

	public long add(int a, int b) {
		System.out.println("At line 6");
		return a + b;
	}

	public long add(long a, int b) {
		System.out.println("At line 11");
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.add(10, 20);
		obj.add(1000000000l, 20);
	}

}

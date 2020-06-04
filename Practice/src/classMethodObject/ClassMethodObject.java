package classMethodObject;

public class ClassMethodObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMethodObject obj = new ClassMethodObject();
		//obj.add(20, 15);
		obj.recursiveDemo(5);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void recursiveDemo(int i) {//recursive method, method calling itself
		if (i > 0) {
			System.out.println(i--);
			recursiveDemo(i);
		}
	}

}

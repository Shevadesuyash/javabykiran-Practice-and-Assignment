package _2_class_method_calling;

public class ex4 {
	boolean a = true;

	void check() {
		if (a == true) {
			a = false;
			System.out.println("The Boolean Value is : " + a);
		}
	}

	public static void main(String args[]) {
		ex4 obj = new ex4();
		obj.check();

		System.out.println(obj.a);
	}
}
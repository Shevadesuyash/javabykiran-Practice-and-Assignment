package _2_class_method_calling;

public class ex3 {
	int a = 15000;
	int b = -20000;

	void add() {
		int c = a + b;
		System.out.println("The int Value is : " + c);
	}

	public static void main(String[] args) {
		ex3 obj = new ex3();
		obj.add();
	}
}
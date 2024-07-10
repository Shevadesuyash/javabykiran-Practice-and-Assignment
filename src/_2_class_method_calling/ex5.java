package _2_class_method_calling;

public class ex5 {
	char a = 'J';
	char b = 'A';
	char c = 'V';
	char d = 'A';

	void join() {
		System.out.println("The Characters Value is : " + a + b + c + d);
	}

	public static void main(String[] args) {
		ex5 obj = new ex5();
		obj.join();
	}
}

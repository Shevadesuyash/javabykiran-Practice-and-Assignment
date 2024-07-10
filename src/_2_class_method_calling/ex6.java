package _2_class_method_calling;

class ex6test {
	int x = 10, y = 20;
	float z;

	void add() {
		z = x + y;
		display(z);
	}

	void sub() {
		z = x - y;
		display(z);
	}

	void mult() {
		z = x * y;
		display(z);
	}

	void div() {
		z = x / y;
		display(z);
	}

	void display(float ans) {
		System.out.println(ans);

	}
}

public class ex6 {
	public static void main(String[] args) {
		ex6test obj = new ex6test();
		obj.add();
		obj.sub();
		obj.mult();
		obj.div();
	}
}

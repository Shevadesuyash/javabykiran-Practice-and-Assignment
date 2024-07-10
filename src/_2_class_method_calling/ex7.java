package _2_class_method_calling;

public class ex7 {
	int add_int(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		ex7 addOperation = new ex7();
		int z = addOperation.add_int(2, 4);
		System.out.println(z);
	}
}

package _2_class_method_calling;

public class ex1 {
	int a;
	float b;
	String str;

	public void operation1() {
		a = 10;
		b = 15.26f;
		str = "Java";
	}

	public void operation2() {
		a = 20;
		b = 27f;
		str = "SELENIUM";
	}

	public void display() {
		System.out.println("The Integer Value is :" + a);
		System.out.println("The Float Value is :" + b);
		System.out.println("The String Value is: " + str);
	}
}

class mainExercise1 {
	public static void main(String args[]) {
		ex1 obj = new ex1();
		obj.operation1();
		obj.display();
		obj.operation2();
		obj.display();
	}
}
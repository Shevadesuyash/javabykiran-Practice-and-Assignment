package _2_class_method_calling;

public class ex8 {
	double getArea(double x, double y) {
		return x * y;
	}

	public static void main(String[] args) {
		ex8 area = new ex8();
		double z = area.getArea(10.2, 23.4);
		System.out.println(z);
	}
}

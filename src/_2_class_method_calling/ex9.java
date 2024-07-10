package _2_class_method_calling;

 class RectangleArea {
	int length;
	int breadth;

	void Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public int getArea() {
		return length * breadth;
	}
}

public class ex9 {
	public static void main(String[] args) {
		RectangleArea r = new RectangleArea();
		r.Rectangle(6, 7);
		System.out.println(r.getArea());
	}
}


public class Circle2 {
	
	private int radius;
	
	void set(int r) {
		radius = r;
	}

	double getArea() {
		return 3.14*radius*radius;
	}
	
	//public Circle2() {}	->	default ������ : �ڵ��� ���� �ʾƵ� �ڵ� ���� �Ǹ� ������ ���� �ʴ´�.
	
	public static void main(String[] args) {

		Circle2 pizza = new Circle2();
		
		//pizza.radius=5;
		pizza.set(5);	//ĸ��ȭ �� ���� ����ȭ
		
	}

}


public class Circle {
	
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {

		Circle pizza = new Circle();
		
		pizza.radius=10;
		pizza.name="�ڹ�����";
		double area = pizza.getArea();
		
		System.out.println(pizza.name+"�� ������ "+area+"�Դϴ�.");
		
		Circle plate = new Circle();
		
		plate.radius=15;
		plate.name="���";
		double area1 = plate.getArea();
		
		System.out.println(plate.name+"�� ������ "+area1+"�Դϴ�.");
		
	}

}


public class Circle {
	
	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {

		Circle pizza = new Circle();
		
		pizza.radius=10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		
		System.out.println(pizza.name+"의 면적은 "+area+"입니다.");
		
		Circle plate = new Circle();
		
		plate.radius=15;
		plate.name="쟁반";
		double area1 = plate.getArea();
		
		System.out.println(plate.name+"의 면적은 "+area1+"입니다.");
		
	}

}

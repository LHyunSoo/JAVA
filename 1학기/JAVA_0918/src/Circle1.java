
public class Circle1 {
	
	int radius;
	void set(int r) {
		radius=r;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle1(int radius) {
		this.radius=radius;
	}
	
	public Circle1() {
		radius=5;
	}
	
	public static void main(String[] args) {

		Circle1 pizza = new Circle1(15);
		
		System.out.println("반지름이 "+pizza.radius+"인치인 피자의 사이즈 : "+pizza.getArea());
		
		Circle1 pizza1 = new Circle1();

	}

}

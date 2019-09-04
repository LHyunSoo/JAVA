
public class Circle {
	
	int radius;
	void set(int r) {
		radius=r;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle() {
		//default 기본생성자
	}
	
	public static void main(String[] args) {

		Circle pizza = new Circle();
		pizza.set(5);
		pizza.radius=5;
		
		System.out.println("반지름이 "+pizza.radius+"인 피자의 사이즈 : "+pizza.getArea());

	}

}

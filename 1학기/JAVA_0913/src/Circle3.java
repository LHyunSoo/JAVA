//기본 생성자가 자동으로 생성되지 않는 경우
//클래스에 하나라도 생성자가 만들어져 있는 경우, default 생성자를 직접 써야함
public class Circle3 {

	int radius;
	
	void set(int r) {
		radius=r;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle3(int r) {
		radius =r;
	}
	
	public Circle3() {
	}
	
	public static void main(String[] args) {

		Circle3 pizza = new Circle3(10);		
		System.out.println("면적 : "+pizza.getArea());
		
		Circle3 donut = new Circle3();		
		System.out.println("면적 : "+donut.getArea());
		
	}

}

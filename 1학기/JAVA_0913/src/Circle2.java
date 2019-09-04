
public class Circle2 {
	
	private int radius;
	
	void set(int r) {
		radius = r;
	}

	double getArea() {
		return 3.14*radius*radius;
	}
	
	//public Circle2() {}	->	default 생성자 : 코딩을 하지 않아도 자동 생성 되며 오류도 나지 않는다.
	
	public static void main(String[] args) {

		Circle2 pizza = new Circle2();
		
		//pizza.radius=5;
		pizza.set(5);	//캡슐화 및 정보 은닉화
		
	}

}

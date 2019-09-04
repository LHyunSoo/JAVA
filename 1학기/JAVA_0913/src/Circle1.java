
public class Circle1 {
	
	int radius;
	String name;

	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public Circle1() {	//리턴타입 없고, 클래스 이름과 같음 (생성자)
		radius=1;
		name="";
	}
	
	public Circle1(int r,String n) {	//리턴타입이 없고 클래스 이름과 같음 (생성자)
		radius = r;
		name = n;
	}
	
	public static void main(String[] args) {

		Circle1 pizza = new Circle1();
		pizza.name="불고기피자";
		
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea());
		
		Circle1 donut = new Circle1(10,"던킨 도넛");
		
		System.out.println(donut.name+"의 면적은 "+donut.getArea());
		
	}

}

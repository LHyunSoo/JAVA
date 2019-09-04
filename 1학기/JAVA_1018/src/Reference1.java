class Circle{
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
}
public class Reference1 {
	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		increase(pizza);
		
		System.out.println(pizza.radius);
		
	}
	static void increase(Circle n) {
		n.radius++;
	}
}

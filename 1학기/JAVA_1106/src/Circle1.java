class Shape1{
	protected String name;
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

public class Circle1 extends Shape1 {

	public static void main(String[] args) {
		
		Shape1 b = new Circle1();
		b.paint();

	}
	
	public void draw() {
		System.out.println("circle");
	}

}

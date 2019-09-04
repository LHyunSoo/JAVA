class Shape2{
	protected String name;
	
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println(name);
	}
}

public class Circle2 extends Shape2{
	protected String name;
	
	public static void main(String[] args) {
		
		Shape2 b = new Circle2();
		b.paint();
		
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		name="Circle2";
		super.name="Shape2";
		super.draw();
		System.out.println(name);
	}

}

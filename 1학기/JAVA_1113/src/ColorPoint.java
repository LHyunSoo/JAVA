class Point{
	
	private int x,y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	protected void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
}
public class ColorPoint extends Point{
	
	String color;
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	
	public void setPoint(int x,int y) {
		super.move(x,y);
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public void show() {
		System.out.println("x좌표는 "+getX()+"이고 y좌표는 "+getY()+"이며 색은 "+color);
	}
	
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		
		cp.setPoint(10,20);
		cp.setColor("Green");
		cp.show();
		
	}

}

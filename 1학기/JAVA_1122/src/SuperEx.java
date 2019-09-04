class Point{
	private int x,y;
	public Point() {
		this.x=this.y=0;
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	public void showColorPoint() {	//컬러 점의 좌표 출력
		System.out.println(color);
		showPoint();	//Point 클래스의 showPoint(x,y) 호출
	}
}

public class SuperEx {

	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();

	}

}

import java.util.Scanner;

public class Rectangle {
	
	String name;
	int width,height;
	
	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		rect.name="사각형";
		
		System.out.print("세로 : ");
		rect.height=sc.nextInt();
		System.out.print("가로 : ");
		rect.width=sc.nextInt();
		
		int area=rect.getArea();
		
		System.out.println(rect.name+"의 면적은 "+area+"입니다.");
		
	}

}

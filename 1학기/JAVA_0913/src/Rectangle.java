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
		
		rect.name="�簢��";
		
		System.out.print("���� : ");
		rect.height=sc.nextInt();
		System.out.print("���� : ");
		rect.width=sc.nextInt();
		
		int area=rect.getArea();
		
		System.out.println(rect.name+"�� ������ "+area+"�Դϴ�.");
		
	}

}

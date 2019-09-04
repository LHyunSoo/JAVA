
class Box {	//상자의 가로, 세로, 높이를 멤버변수로 갖는 클래스
	
	int width;
	int length;
	int height;	
	
	void print() {
		System.out.println("박스의 가로 길이는 "+width+"이고 세로 길이는 "+length+"이고 높이 길이는 "+height+"입니다.");
	}
	
}
	
public class BoxTest {

	public static void main(String[] args) {
		
		/* 객체 생성 (객체 이름 b)
		 * 가로 : 20
		 * 세로 : 20
		 * 높이 : 20
		 */
		
		Box b = new Box();
		
		b.width = 20;
		b.length = 20;
		b.height = 20;
		
		b.print();
	}

}

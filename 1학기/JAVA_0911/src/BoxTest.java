
class Box {	//������ ����, ����, ���̸� ��������� ���� Ŭ����
	
	int width;
	int length;
	int height;	
	
	void print() {
		System.out.println("�ڽ��� ���� ���̴� "+width+"�̰� ���� ���̴� "+length+"�̰� ���� ���̴� "+height+"�Դϴ�.");
	}
	
}
	
public class BoxTest {

	public static void main(String[] args) {
		
		/* ��ü ���� (��ü �̸� b)
		 * ���� : 20
		 * ���� : 20
		 * ���� : 20
		 */
		
		Box b = new Box();
		
		b.width = 20;
		b.length = 20;
		b.height = 20;
		
		b.print();
	}

}

//�⺻ �����ڰ� �ڵ����� �������� �ʴ� ���
//Ŭ������ �ϳ��� �����ڰ� ������� �ִ� ���, default �����ڸ� ���� �����
public class Circle3 {

	int radius;
	
	void set(int r) {
		radius=r;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle3(int r) {
		radius =r;
	}
	
	public Circle3() {
	}
	
	public static void main(String[] args) {

		Circle3 pizza = new Circle3(10);		
		System.out.println("���� : "+pizza.getArea());
		
		Circle3 donut = new Circle3();		
		System.out.println("���� : "+donut.getArea());
		
	}

}

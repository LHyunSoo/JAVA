
class Circle1 {
	
	private double radius;	//��������� �ܺηκ��� ���н�Ų��.
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	void show(double x, double y) {
		System.out.printf("������ : %.1f\n���� : %.1f\n",x,y);
	}
	
}

public class CircleDemo1 {

	public static void main(String[] args) {

		Circle1 myCircle = new Circle1();
		
		//myCircle.radius = 10.0;	-> private�̱� ������ �Ұ���
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), (myCircle.getRadius()*myCircle.getRadius()*3.14));
	}

}

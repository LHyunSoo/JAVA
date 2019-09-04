
class Circle1 {
	
	private double radius;	//멤버변수를 외부로부터 은닉시킨다.
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 : %.1f\n넓이 : %.1f\n",x,y);
	}
	
}

public class CircleDemo1 {

	public static void main(String[] args) {

		Circle1 myCircle = new Circle1();
		
		//myCircle.radius = 10.0;	-> private이기 때문에 불가능
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), (myCircle.getRadius()*myCircle.getRadius()*3.14));
	}

}

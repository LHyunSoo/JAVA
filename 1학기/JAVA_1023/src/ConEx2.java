class A1 {
	public A1(){
		System.out.println("생성자 A1");
	}
	public A1(int x) {
		System.out.println("매개변수가 있는 생성자 A1");
	}
}

class B1 extends A1{
	public B1() {
		System.out.println("생성자 B1");
	}
	public B1(int x) {
		super(x);
		System.out.println("매개변수가 있는 생성자 B1");
	}
}

public class ConEx2 {
	public static void main(String[] args) {
		B1 b = new B1();
	}
}

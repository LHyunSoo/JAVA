class A1 {
	public A1(){
		System.out.println("������ A1");
	}
	public A1(int x) {
		System.out.println("�Ű������� �ִ� ������ A1");
	}
}

class B1 extends A1{
	public B1() {
		System.out.println("������ B1");
	}
	public B1(int x) {
		super(x);
		System.out.println("�Ű������� �ִ� ������ B1");
	}
}

public class ConEx2 {
	public static void main(String[] args) {
		B1 b = new B1();
	}
}


class Phone {

	String model;
	int value;
	
	void print() {
		System.out.println(value+"�� ��¥�� "+model+" ����Ʈ���Դϴ�.");
	}
	
}

public class PhoneDemo {

	public static void main(String[] args) {

		Phone myPhone = new Phone();
		
		myPhone.model="������ S9";
		myPhone.value=100;
		
		System.out.print("���� �� ���� �ִ� ���� ");
		myPhone.print();
		
		Phone yourPhone = new Phone();
		
		yourPhone.model="LG X-400";
		yourPhone.value=70;
		
		System.out.print("����� ���� �ִ� ���� ");
		yourPhone.print();
		
	}

}


class Phone {

	String model;
	int value;
	
	void print() {
		System.out.println(value+"만 원짜리 "+model+" 스마트폰입니다.");
	}
	
}

public class PhoneDemo {

	public static void main(String[] args) {

		Phone myPhone = new Phone();
		
		myPhone.model="갤럭시 S9";
		myPhone.value=100;
		
		System.out.print("내가 이 갖고 있는 것은 ");
		myPhone.print();
		
		Phone yourPhone = new Phone();
		
		yourPhone.model="LG X-400";
		yourPhone.value=70;
		
		System.out.print("당신이 갖고 있는 것은 ");
		yourPhone.print();
		
	}

}

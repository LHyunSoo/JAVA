
public class Television {

	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	
	public static void main(String[] args) {

		Television TV = new Television();
		
		TV.channel = 7;
		TV.volume = 6;
		TV.onOff = true;
		
		TV.print();
		
		Television yourTV = new Television();
		
		yourTV.channel = 9;
		yourTV.volume = 12;
		yourTV.onOff = true;
		
		yourTV.print();
		
		Television TV1 = new Television();
		Television TV2 = TV1;	//TV1과 TV2가 같은 것을 가리킴
		
		int x=10, y=20;
		y=x;	//x의 값이 y로 대입되는 상황
		
	}

}

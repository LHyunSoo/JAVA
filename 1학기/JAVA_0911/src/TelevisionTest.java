
public class TelevisionTest {
	
	public static void main(String[] args) {
		
		Television1 myTV = new Television1();
		
		myTV.channel=7;
		myTV.volume=10;
		myTV.onOff=true;
		
		myTV.print();
		
		int ch = myTV.getChannel();
		System.out.println("현재 채널은 "+ch+"입니다.");
		
	}
}


public class TelevisionTest {
	
	public static void main(String[] args) {
		
		Television1 myTV = new Television1();
		
		myTV.channel=7;
		myTV.volume=10;
		myTV.onOff=true;
		
		myTV.print();
		
		int ch = myTV.getChannel();
		System.out.println("���� ä���� "+ch+"�Դϴ�.");
		
	}
}

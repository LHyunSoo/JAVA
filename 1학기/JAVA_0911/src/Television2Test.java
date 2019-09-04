
public class Television2Test {

	public static void main(String[] args) {

		Television2 myTV = new Television2();
		
		//myTV.channel=11;
		myTV.setChannel(11);
		
		int ch = myTV.getChannel();
		
		System.out.println("현재 채널은 "+ch);
	}

}

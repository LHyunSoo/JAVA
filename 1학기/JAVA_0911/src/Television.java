
public class Television {

	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
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
		Television TV2 = TV1;	//TV1�� TV2�� ���� ���� ����Ŵ
		
		int x=10, y=20;
		y=x;	//x�� ���� y�� ���ԵǴ� ��Ȳ
		
	}

}

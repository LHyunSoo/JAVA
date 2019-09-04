class Summing{
	private int sum;
	public synchronized void sumTo(int num) {
		sum = 0;
		for(int i = 1; i <=num;i++) {
			sum+=i;
			System.out.print("������: "+Thread.currentThread().getName());
			System.out.println("�� 1 ~ "+i+"������ ���� "+sum);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {	}
		}
	}
	public int getSum() {
		return sum;
	}
}

public class MutiThreadExam extends Thread{
	private Summing sum;
	private int num;
	
	public MutiThreadExam(String s, Summing sum, int num) {
		super(s);
		this.sum = sum;
		this.num = num;
		System.out.println("������: "+getName()+"�� ���۵�\n");
	}
	
	public void run() {
		sum.sumTo(num);
		System.out.println("������: "+getName()+"�� �����\n");
	}
	
	public static void main(String[] args) {
		Summing sum = new Summing();
		MutiThreadExam a =new MutiThreadExam("A",sum,5);
		MutiThreadExam b =new MutiThreadExam("B",sum,5);
		
		a.setPriority(8);
		b.setPriority(10);
		
		a.start();
		b.start();
	}

}

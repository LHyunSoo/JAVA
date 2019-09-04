
public class syncTest {
	private int sum = 0;
	private int num = 0;
	
	public synchronized void IncreaseNumber() {
		num++;
		sum += num;
	}

	public void IncreaseNumber2(){
		synchronized (this) {
			num++;
		}
		sum += num;
	}
	
	public static void main(String[] args) {		
		
	}

}

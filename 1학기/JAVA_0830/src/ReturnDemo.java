
public class ReturnDemo {

	public static void main(String[] args) {
		//printScore(99);
		printScore(200);
		printScore(6);
	}

	private static void printScore(int score) {
		if(score<0 || score>100) {
			System.out.println(score+"��(��) �߸��� �����Դϴ�.");
			return;
		}

			System.out.println("���� : "+score);
		
	}

}

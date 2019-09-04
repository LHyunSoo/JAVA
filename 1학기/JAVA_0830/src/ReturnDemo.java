
public class ReturnDemo {

	public static void main(String[] args) {
		//printScore(99);
		printScore(200);
		printScore(6);
	}

	private static void printScore(int score) {
		if(score<0 || score>100) {
			System.out.println(score+"는(은) 잘못된 점수입니다.");
			return;
		}

			System.out.println("점수 : "+score);
		
	}

}

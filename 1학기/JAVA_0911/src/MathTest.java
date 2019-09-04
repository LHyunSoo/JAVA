
public class MathTest {

	public static void main(String[] args) {
		
		Math obj = new Math();
		
		int sum = obj.add(2, 3);
		
		System.out.println("2와 3의 합 : "+sum);
		
		sum = obj.add(5, 7);
		System.out.println("5와 7의 합 : "+sum);

	}

}

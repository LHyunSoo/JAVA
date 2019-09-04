import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		
		do {
			System.out.print("양의 정수를 입력하세요.>> ");
			n = sc.nextInt();
			
			if(n<=0) {
				break;
			}else {
				if(n%2==0) {
					sum+=n;				
				}
			}
		}while(true);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
		
	}

}

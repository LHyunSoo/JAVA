import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		
		do {
			System.out.print("���� ������ �Է��ϼ���.>> ");
			n = sc.nextInt();
			
			if(n<=0) {
				break;
			}else {
				if(n%2==0) {
					sum+=n;				
				}
			}
		}while(true);
		
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� "+sum);
		
	}

}

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("값을 두개 입력하시오.>> ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(n+" * "+m+" = "+m*n);
		
	}

}

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���� �ΰ� �Է��Ͻÿ�.>> ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(n+" * "+m+" = "+m*n);
		
	}

}

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է��Ͻÿ�.>> ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("���� ���߽��ϴ�.");
			break;
		case 2:
		case 3:
			System.out.println("�� �߽��ϴ�.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("����ϼ���.");	
			break;
		}
		
	}

}

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("등수를 입력하시오.>> ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("아주 잘했습니다.");
			break;
		case 2:
		case 3:
			System.out.println("잘 했습니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("노력하세요.");	
			break;
		}
		
	}

}

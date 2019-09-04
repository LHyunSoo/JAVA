import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

/*		//for 구구단
		for(int i = 2;i<=9;i++) {
			System.out.println("---<"+i+"단>---");
			for(int j = 1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
*/
		
/*
		//while 구구단
		int i =2;
		while(i<=9) {
			System.out.println("---<"+i+"단>---");
			int j =1;
			while(j<=9) {
				System.out.println(i+" X "+j+" = "+i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("---------------------------");
*/
		
/*
		//for-each
		int arr[] = new int[] {5,7,9,1,13};
		for(int a : arr) {
			System.out.println(a+"");	//숫자를 문자열로 바꿈
			if(a==7) {
				System.out.println("비투비");
			}else if(a==9) {
				System.out.println("엑소");
			}else if(a==13) {
				System.out.println("세븐틴");
			}else if(a==1) {
				System.out.println("싸이");
			}
		}
		System.out.println("---------------------------");
*/
		
/*		
		while(true) {
			//Scanner
			Scanner sc = new Scanner(System.in);
			System.out.print("멤버 수를 입력하시오.>> ");
			int member = sc.nextInt();
			
			System.out.print(member+"명인 아이돌은 ");
			if(member==7) {
				System.out.println("비투비");
			}else if(member==9) {
				System.out.println("엑소");
			}else if(member==13) {
				System.out.println("세븐틴");
			}else if(member==1) {
				System.out.println("싸이");
			}else {
				System.out.println("없음");
				break;
			}
		}
*/
		
/*
		for(int i = 0;i<=1;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("멤버 수를 입력하시오.>> ");
			int member = sc.nextInt();
			
			System.out.print(member+"명인 아이돌은 ");
			if(member==7) {
				System.out.println("비투비");
			}else if(member==9) {
				System.out.println("엑소");
			}else if(member==13) {
				System.out.println("세븐틴");
			}else if(member==1) {
				System.out.println("싸이");
			}else {
				System.out.println("없음");
				break;
			}
		}
*/
		
/*
			String s[]= {"강지민","강혜정","김가영","김나영","김선옥","김수진","류정민","박교령","서남경","오승연",
					"원예린","원채린","이서현","이채린","이현수","임현진","장유경","장원이","한다연"};
			for(int i =1;i==i;i++) {
				Scanner sc = new Scanner(System.in);
				System.out.print("번호를 입력하시오.>> ");
				int num = sc.nextInt();
				System.out.print(num+"번의 학생은 ");
					if(num<=19) {
						System.out.println(s[num-1]);
					}
					else {
						System.out.println("없음");
						break;
					}
			}
*/
		
		
	}

}

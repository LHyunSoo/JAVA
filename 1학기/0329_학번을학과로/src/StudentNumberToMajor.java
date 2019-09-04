import java.util.Scanner;

public class StudentNumberToMajor {
	
	public static void main(String[] args) {

		String[] 학년3 = {"인터랙티브미디어과","인터랙티브미디어과",
				"뉴미디어디자인과","뉴미디어디자인과","뉴미디어솔루션과","뉴미디어솔루션과"};
		String[] 학년2 = {"뉴미디어소프트웨어과","뉴미디어소프트웨어과",
				"뉴미디어웹솔루션과","뉴미디어웹솔루션과","뉴미디어디자인과","뉴미디어디자인과"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번을 입력하시오.>> ");
		String student = sc.next();  
		
		if(student.substring(0,1).equals("3")) {
			String classroomStr = student.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(학년3[classroom]);
		}else {
			String classroomStr = student.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(학년2[classroom]);
		}
		
/*		
		if(student.charAt(0)=='3') {
			if(student.charAt(1)=='1'||student.charAt(1)=='2') {
				System.out.println("인터랙티브미디어과");
			}else if(student.charAt(1)=='3'||student.charAt(1)=='4') {
				System.out.println("뉴미디어디자인과");
			}else {
				System.out.println("뉴미디어솔루션과");
			}
		}
		else{
			if(student.charAt(1)=='1'||student.charAt(1)=='2') {
				System.out.println("뉴미디어소프트웨어과");
			}else if(student.charAt(1)=='3'||student.charAt(1)=='4') {
				System.out.println("뉴미디어웹솔루션과");
			}else {
				System.out.println("뉴미디어디자인과");
			}
		}
*/
/*
		if(student.substring(0,1).equals("3")) {
			if(student.substring(1,2).equals("1")||student.substring(1,2).equals("2")) {
				System.out.println("인터랙티브미디어과");
			}else if(student.substring(1,2).equals("3")||student.substring(1,2).equals("4")) {
				System.out.println("뉴미디어디자인과");
			}else {
				System.out.println("뉴미디어솔루션과");
			}
		}else {
			if(student.substring(1,2).equals("1")||student.substring(1,2).equals("2")) {
				System.out.println("뉴미디어소프트웨어과");
			}else if(student.substring(1,2).equals("3")||student.substring(1,2).equals("4")) {
				System.out.println("뉴미디어웹솔루션과");
			}else {
				System.out.println("뉴미디어디자인과");
			}
		}
*/
	}

}

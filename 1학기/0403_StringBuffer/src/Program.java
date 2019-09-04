
public class Program {

	public static void main(String[] args) {

		//append
		StringBuffer sb1 = new StringBuffer(" Java Programing");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;

		str1=sb1.append(" Projects");
		//sb1 :  Java Programing Projects
		//str1 :  Java Programing Projects
		str2=sb1.append(sb2);
		//sb1 :  Java Programing Projects Project
		//str1 :  Java Programing Projects Project
		//str2 :  Java Programing Projects Project
		
		System.out.println("sb1 : "+sb1);
		System.out.println("sb2 : "+sb2);
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		//중간 과정이 저장이 안되고 최종결과가 출력됨
		
		System.out.println("-------------------------------------");
		
		//replace
		StringBuffer sb3 = new StringBuffer("Funny Java");
		StringBuffer sb4 = null;

		System.out.println("sb3 : "+sb3);
		
		sb4=sb3.replace(0, 5, "Happy");
		
		System.out.println("sb3 : "+sb3);
		System.out.println("sb4 : "+sb4);
		
		System.out.println("-------------------------------------");
		
		//reverse
		StringBuffer sb5 = sb4.reverse();
		System.out.println("sb5 : "+sb5);
		
		System.out.println("-------------------------------------");
		
		//toString
		String str6 = sb5.toString().toUpperCase();
		System.out.println("str6 : "+str6);
		
	}

}

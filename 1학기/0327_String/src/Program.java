
public class Program {

	public static void main(String[] args) {
		String str1 = "Mirim";
		String str2 = "Mirim";
		String str3 = new String("Mirim");
		String str4 = new String("Mirim");
		
		if(str1==str2) {
			System.out.println("�ּҰ� ����.");
		}else {
			System.out.println("�ּҰ� �ٸ���.");
		}
		if(str3==str4) {
			System.out.println("�ּҰ� ����.");
		}else {
			System.out.println("�ּҰ� �ٸ���.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("������ ����.");
		}else {
			System.out.println("������ �ٸ���.");
		}
		if(str3.equals(str4)) {
			System.out.println("������ ����.");
		}else {
			System.out.println("������ �ٸ���.");
		}
		
		System.out.println("--------------------------");
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		System.out.println(String.valueOf(123));
		System.out.println("    \tI Love You ".trim());
		System.out.println("2315".substring(2));
		System.out.println("2315".substring(2, 4)+"��");
		System.out.println("2315".charAt(1)+"��");
		System.out.println("2315".substring(1,2)+"��");
		System.out.println(str1.indexOf("i"));
	}

}

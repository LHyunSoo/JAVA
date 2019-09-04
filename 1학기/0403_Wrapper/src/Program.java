import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(200);
		
		System.out.println("i1 == i2 --> "+(i1==i2));
		System.out.println("i1.equals(i2) --> "+i1.equals(i2));
		System.out.println("i1.equals(i3) --> "+i1.equals(i3));
		
		System.out.println("-------------------------------");
		
		//toString()
		System.out.println(new Integer(100).toString());
		System.out.println(new Double(55.7).toString());
		
		//valueOf() : String -> wrapper 클래스
		System.out.println(Integer.valueOf("123"));
		System.out.println(Double.valueOf("123.123"));
		//parseInt() : String -> int
		System.out.println(Integer.parseInt("456"));
		//parseDouble() : String -> double
		System.out.println(Double.parseDouble("456.456"));
		//wrapper 클래스 -> 기본 자료형
		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(1.1).doubleValue());
		
		System.out.println("-------------------------------");
		
		ArrayList arr = new ArrayList();
		arr.add(new Integer(200));
		arr.add(100);
		for(Object o : arr) {
			System.out.println((int)o);
		}

	}

}

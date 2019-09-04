
public class LocalVariable {

	public static void main(String[] args) {
		int a=0;
		double d;
		
		//System.out.println(d);	-> 초기화 하지 않으면 사용 불가능
		//System.out.println(a+c);	-> c변수가 선언 되지 않았기 때문에 불가능
		
		int c = 3;
		
		//public double d1 = 0.0;	-> 지역변수는 public, private등으로 지정 불가능
		
		for(int e=0; e<10; e++) {
			//int a=1;	-> 블록이 달라도 같은 이름으로는 다시 선언 불가능 (4행에서 선언된 지역변수 이름과 같음)
		}
		
	}

}

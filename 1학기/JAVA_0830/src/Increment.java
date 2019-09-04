
public class Increment {

	public static void main(String[] args) {
		int x=0;
		System.out.println("메소드를 호출하기 전 x는 "+x);
		increment(x);
		System.out.println("메소드를 호출한 후의 x는 "+x);
	}
	
	public static void increment(int n) {
		System.out.println("메소드 시작할 때 n은 "+n);
		n++;
		System.out.println("메소드 끝날 때 n은 "+n);
	}

}

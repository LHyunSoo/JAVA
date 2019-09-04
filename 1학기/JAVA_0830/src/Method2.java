
public class Method2 {

	public static void main(String[] args) {
	
//		System.out.println("합(1~10) :  "+sum(1,10));
//		System.out.println("합(10~100) : "+sum(10,100));
//		System.out.println("합(100~1000) : "+sum(100,1000));		
		
		int sum1 = sum(1,10);
		int sum2 = sum(10,100);
		int sum3 = sum(100,1000);
		
		System.out.println("합(1~10) :  "+sum1);
		System.out.println("합(10~100) :  "+sum2);
		System.out.println("합(100~1000) :  "+sum3);		
		
	}

	public static int sum(int i1, int i2) {
		
		int sum=0;
		
		for(int i = i1;i<=i2;i++) {
			sum+=i;
		}
				
		return sum;
	}
	
}


public class Overload {

	public static void main(String[] args) {

		int i1=3, i2=7, i3=10;
		double d1=7.0, d2=3.0;
		
		System.out.println(max(i1,i2));
		
	}
	
	public static int max(int n1, int n2) {
		
		int result = n1 > n2 ? n1 : n2;
		
		return result;
		
	}
	
	/*public static double max(double n1, double n2) {
	
		
	}
	
	public static int max(int n1, int n2, int n3) {
	
		
	}*/

}

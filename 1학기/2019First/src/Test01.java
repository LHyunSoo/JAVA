
public abstract class Test01 {

	public static void main(String[] args) {

		int member = 7;

		System.out.print("내가 좋아하는 가수는 ");
		if(member==7) {
			System.out.println("비투비");
		}else if(member==9) {
			System.out.println("엑소");
		}else if(member==13) {
			System.out.println("세븐틴");
		}else if(member==1) {
			System.out.println("싸이");
		}
		
		System.out.print("내가 좋아하는 가수는 ");
		switch(member) {
			case 1: System.out.println("싸이"); break;
			case 7: System.out.println("비투비"); break;
			case 9: System.out.println("엑소"); break;
			case 13: System.out.println("세븐틴");	
		}
		
	}

}

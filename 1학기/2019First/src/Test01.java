
public abstract class Test01 {

	public static void main(String[] args) {

		int member = 7;

		System.out.print("���� �����ϴ� ������ ");
		if(member==7) {
			System.out.println("������");
		}else if(member==9) {
			System.out.println("����");
		}else if(member==13) {
			System.out.println("����ƾ");
		}else if(member==1) {
			System.out.println("����");
		}
		
		System.out.print("���� �����ϴ� ������ ");
		switch(member) {
			case 1: System.out.println("����"); break;
			case 7: System.out.println("������"); break;
			case 9: System.out.println("����"); break;
			case 13: System.out.println("����ƾ");	
		}
		
	}

}

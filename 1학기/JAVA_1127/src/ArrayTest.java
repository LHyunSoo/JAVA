class Person {
	int age=0;
}

public class ArrayTest {
	public static void main(String[] args) {	
		
		Person pa[] = new Person[10];
		
		for(int i = 0;i<pa.length;i++) {
			pa[i] = new Person();	//��ü������
			pa[i].age=30+i;
		}
		
		for(int i = 0;i<pa.length;i++) {
			System.out.println(pa[i].age+" ");
		}
		
	}
}

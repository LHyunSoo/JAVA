
public class Student {
	
	private int number;
	private String name;
	private int age;

	public Student() {
		number=1416;
		name = "������";
		age = 17;
	}
	
	public Student(int number, String name, int age) {
		this.number=number;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Student�� "+number+" "+name+" "+age+"�� �Դϴ�";
	}

}


public class Circle {
	public void secret() {
		System.out.println("����̴�.");
	}
	protected void findRadius() {
		System.out.println("�������� 10.0cm�̴�.");
	}
	protected void findArea() {
		System.out.println("������ (PI*������*������)�̴�.");
	}
}

class Ball extends Circle{
	private String color;
	public Ball(String color) {
		this.color=color;
	}
	public void findColor() {
		System.out.println(color+"���̴�.");
	}
	public void findArea() {
		System.out.println("���̴� 4*(PI*������*������)�̴�.");
	}
	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(PI*������*������)�̴�.");
	}
}


public class Book {
	
	String title;
	String author;
	
	public Book(String t) {
		title=t;
		author="���ڹ̻�";
	}
	
	public Book(String t, String a) {
		title = t;
		author=a;
	}

	public static void main(String[] args) {
		
		Book little_prince = new Book("� ����","�������丮");
		System.out.println(little_prince.title+"�� "+little_prince.author+"�� ���� ��������.");
		
		Book LoveStory = new Book("������");
		System.out.println(LoveStory.title+"�� "+LoveStory.author+"�̴�.");
		
	}

}

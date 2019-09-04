
public class Book {
	
	String title;
	String author;
	
	public Book(String t) {
		title=t;
		author="작자미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author=a;
	}

	public static void main(String[] args) {
		
		Book little_prince = new Book("어린 왕자","생텍쥐페리");
		System.out.println(little_prince.title+"는 "+little_prince.author+"에 의해 쓰여졌다.");
		
		Book LoveStory = new Book("춘향전");
		System.out.println(LoveStory.title+"은 "+LoveStory.author+"이다.");
		
	}

}

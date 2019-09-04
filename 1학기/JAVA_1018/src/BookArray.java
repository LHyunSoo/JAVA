import java.util.Scanner;

class Book{
	
	String title, author;
	
	public Book (String title,String author) {
		this.title=title;
		this.author=author;
	}
	
}

public class BookArray {

	public static void main(String[] args) {
		
		Book[] b = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<b.length;i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("작가 : ");
			String author = sc.nextLine();
			
			b[i] = new Book(title,author);
			
			System.out.println("제목은 "+b[i].title+"이고 작가는 "+b[i].author+"입니다.\n");
		}
		
	}

}

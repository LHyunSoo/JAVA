import java.util.Scanner;

class Book{
	
	String title,author;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
}

public class BookArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] b = new Book[2];
		
		for(int i=0;i<b.length;i++) {
			System.out.println("------< "+(i+1)+"�� >------");
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			b[i]=new Book(title,author);
		}
		
		for(int i =0;i<b.length;i++) {
			System.out.println("\n------< å ��� >------"+i+1+") ���� : "+b[i].title+"\n\t"+b[i].author);
		}
		
	}

}

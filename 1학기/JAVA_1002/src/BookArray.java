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
			System.out.println("------< "+(i+1)+"锅 >------");
			System.out.print("力格 : ");
			String title = sc.nextLine();
			System.out.print("历磊 : ");
			String author = sc.nextLine();
			
			b[i]=new Book(title,author);
		}
		
		for(int i =0;i<b.length;i++) {
			System.out.println("\n------< 氓 格废 >------"+i+1+") 力格 : "+b[i].title+"\n\t"+b[i].author);
		}
		
	}

}

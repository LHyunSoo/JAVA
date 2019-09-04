import java.io.*;

public class p158_FileExam {

	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("test.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	

}

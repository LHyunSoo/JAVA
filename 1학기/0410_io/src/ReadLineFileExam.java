import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {

		//파일읽게 연결하기
		FileReader fr;
		try {
			fr= new FileReader("src/dataw.txt");
			//버퍼읽게 연결하기
			BufferedReader br = new BufferedReader(fr);
			//한줄읽기
			String s="";
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
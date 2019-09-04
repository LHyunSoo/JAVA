import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputReaderExam {

	public static void main(String[] args) {

		Reader reader = new InputStreamReader(System.in);	//Reader는 추상클래스
		while(true) { 
			int i;
			try {
				i = reader.read();
				if(i == -1) break;	//마지막에 Ctrl + z 입력
				char c = (char)i;
				System.out.print(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}

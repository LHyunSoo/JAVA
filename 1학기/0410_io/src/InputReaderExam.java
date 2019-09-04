import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputReaderExam {

	public static void main(String[] args) {

		Reader reader = new InputStreamReader(System.in);	//Reader�� �߻�Ŭ����
		while(true) { 
			int i;
			try {
				i = reader.read();
				if(i == -1) break;	//�������� Ctrl + z �Է�
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

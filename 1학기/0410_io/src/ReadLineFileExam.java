import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {

	public static void main(String[] args) {

		//�����а� �����ϱ�
		FileReader fr;
		try {
			fr= new FileReader("src/dataw.txt");
			//�����а� �����ϱ�
			BufferedReader br = new BufferedReader(fr);
			//�����б�
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
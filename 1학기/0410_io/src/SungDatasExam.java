import java.io.*;
import java.util.StringTokenizer;

public class SungDatasExam {

	public static void main(String[] args) {
		
		//파일 연결하기(writed.txt)
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//버퍼 연결하기(readLine()하기 위해서)
			BufferedReader br = new BufferedReader(fr);
			
			//한줄 읽고, \t로 연결하기
			String csvStr = "";		//모든 내용 \t로 연결한 String
			String tmpStr = "";		//한줄 읽기용 임시 String
			while((tmpStr = br.readLine())!= null) {
					csvStr += tmpStr + "\t";
			}
			//System.out.println(csvStr);
			
			//token으로 나누어 데이터 저장하기
			StringTokenizer parse = new StringTokenizer(csvStr,"\t");
			
			int length = parse.countTokens()/4;
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			
			for(int i = 0; i<length;i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken());
				english[i] = Double.parseDouble(parse.nextToken());
				//total, avg 계산하기
				total[i] = math[i]+english[i];
				avg[i] = total[i] / 2;
			}
			
			//출력하기
			for(int i = 0; i < length; i++) {
				System.out.println("이름 : "+name[i]+", 주소 : "+address[i]
						+", 수학 : "+math[i]+", 영어 : "+english[i]
						+", 총점 : "+total[i]+", 평균 : "+avg[i]);					
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

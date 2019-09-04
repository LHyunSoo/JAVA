import java.io.*;
import java.util.*;

public class 성적처리 {
	static ArrayList<성적> 성적들 = new ArrayList<>();
	
	public static void main(String[] args) {

		//파일 연결하기
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;

		try {
			fr= new FileReader("src/writed.txt");
			//버퍼 연결하기
			br = new BufferedReader(fr);
			
			//반복, 한줄 읽기
			String line;
			while((line = br.readLine())!=null) {
				
				StringTokenizer st = new StringTokenizer(line,"\t");			
				//새 객체 만들어서 넣기
				성적 new성적 = new 성적();
				new성적.setName(st.nextToken());
				new성적.setAddress(st.nextToken());
				new성적.setMath(Double.parseDouble(st.nextToken()));					
				new성적.setEnglish(Double.parseDouble(st.nextToken()));					
				//리스트에 만들어진 새 객체 넣기
				성적들.add(new성적);
			}
			//리스트 출력하기
			for(성적 a : 성적들) {
				System.out.println(a);
			}
			//파일로 저장하기
			//파일 연결하기
			fw= new FileWriter("src/save.txt");
			//버퍼 연결하기
			bw = new BufferedWriter(fw);
			//쓰기
			for(성적 a: 성적들) {
				bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				bw.write(a.getMath()+"\t"+a.getEnglish()+"\t");
				bw.write(a.getTotal()+"\t"+a.getAverage()+"\t");
				bw.newLine();
			}
			//닫기
			br.close();
			bw.close();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

import java.io.*;
import java.util.*;

public class ����ó�� {
	static ArrayList<����> ������ = new ArrayList<>();
	
	public static void main(String[] args) {

		//���� �����ϱ�
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;

		try {
			fr= new FileReader("src/writed.txt");
			//���� �����ϱ�
			br = new BufferedReader(fr);
			
			//�ݺ�, ���� �б�
			String line;
			while((line = br.readLine())!=null) {
				
				StringTokenizer st = new StringTokenizer(line,"\t");			
				//�� ��ü ���� �ֱ�
				���� new���� = new ����();
				new����.setName(st.nextToken());
				new����.setAddress(st.nextToken());
				new����.setMath(Double.parseDouble(st.nextToken()));					
				new����.setEnglish(Double.parseDouble(st.nextToken()));					
				//����Ʈ�� ������� �� ��ü �ֱ�
				������.add(new����);
			}
			//����Ʈ ����ϱ�
			for(���� a : ������) {
				System.out.println(a);
			}
			//���Ϸ� �����ϱ�
			//���� �����ϱ�
			fw= new FileWriter("src/save.txt");
			//���� �����ϱ�
			bw = new BufferedWriter(fw);
			//����
			for(���� a: ������) {
				bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				bw.write(a.getMath()+"\t"+a.getEnglish()+"\t");
				bw.write(a.getTotal()+"\t"+a.getAverage()+"\t");
				bw.newLine();
			}
			//�ݱ�
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

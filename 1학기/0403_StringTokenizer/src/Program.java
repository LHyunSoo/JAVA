import java.util.StringTokenizer;

public class Program {

	public static void main(String[] args) {

		String line;
		String tmpStr = "hong ��걸 10.5 20.5";
		
		StringTokenizer parse = new StringTokenizer(tmpStr);
		
		String name,address;
		double math,english, total, avg;
		
		name = parse.nextToken();
		address = parse.nextToken();
		//math = Double.valueOf(parse.nextToken()).doubleValue();
		math = Double.parseDouble(parse.nextToken());
		//english = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.valueOf(parse.nextToken());
		
		total=math+english;
		avg = total / 2.0;
		
		System.out.println(name + "\t"+ address+"\t"+math+"\t"+english+"\t"+total+"\t"+avg);
		
		//String.split()
		String[] arrStr = tmpStr.split(" ");	//��ĭ���� �ڸ���.
		for(String str : arrStr) {
			System.out.print(str+"\t");
		}

	}

}


public class Printer {
	public static int USB = 0;
	public static int PARLLEL = 1;
	private String modelName;	//모델 이름
	private String manufacturer;	//제조사
	private int type;	//USB 또는 병렬 프린터
	protected int numberOfPrinted;	//인쇄한 종이 매수
	protected int numberOfPaper;	//남은 종이 매수
	//abstract public boolean print();
	
	public Printer(String modelName,String manufacturer,int type,int numberOfPrinted,int numberOfPaper) {
		this.modelName=modelName;
		this.manufacturer = manufacturer;
		this.type = type;
		this.numberOfPaper=numberOfPaper;
		this.numberOfPrinted = 0;
	}
	
	public static void main(String[] args) {
	
		
		
	}

}

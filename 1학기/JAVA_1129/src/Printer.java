
public class Printer {
	public static int USB = 0;
	public static int PARLLEL = 1;
	private String modelName;	//�� �̸�
	private String manufacturer;	//������
	private int type;	//USB �Ǵ� ���� ������
	protected int numberOfPrinted;	//�μ��� ���� �ż�
	protected int numberOfPaper;	//���� ���� �ż�
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

import java.util.Scanner;

class Goods{
	
	private String name;
	private int price;
	private int count;
	private int num;
	
	Goods(String name,int price,int count,int num){
		this.name=name;
		this.price=price;
		this.count=count;
		this.num=num;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public int getNum() {
		return num;
	}
	
}

public class GoodsArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Goods g[] = new Goods[3];
		
		System.out.println("순서대로 입력하시오. (제품명, 가격, 수량, 품번) ");
		
		for(int i = 0;i<g.length;i++) {
			String name=sc.next();
			int price=sc.nextInt();
			int count=sc.nextInt();
			int num=sc.nextInt();
			g[i]=new Goods(name,price,count,num);
		}
		
		for(int i = 0;i<g.length;i++) {
			System.out.println(g[i].getName()+" "+g[i].getPrice()+" "+g[i].getCount()+" "+g[i].getNum());
		}

	}

}

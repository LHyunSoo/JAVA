package a;

import java.util.*;

class Product{
	private String name;
	private int price;
	private int count;

	Product(String name,int price,int count){
		this.name = name;
		this.price = price;
		this.count=count;
	}

	public int getPrice(){
		return price*count;
	}

	public void pr(){
		System.out.println("이름 : "+this.name+", 가격 : "+getPrice());
	}

}

class DiscountProduct extends Product{
	private int discount = 10;

	DiscountProduct(String name,int price, int count,int discount){
		super(name,price,count);
		this.discount=discount;
	}
	
	public int getPrice(){
		return getPrice()*(discount/100);
	}

	public void pr(){
		//System.out.println("이름 : "+this.name+"할인, 가격 : "+getPrice());
	}
	
}

class j1416{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(">>입력 : ");
		String name = sc.next();
		int price = sc.nextInt();
		int count = sc.nextInt();

		String name1 = sc.next();
		int price1 = sc.nextInt();
		int count1 = sc.nextInt();
		int discount1 = sc.nextInt();

		Product p = new Product(name,price,count);
		DiscountProduct d = new DiscountProduct(name1,price1,count1,discount1);
		
		p.pr();
		d.pr();

	}
}

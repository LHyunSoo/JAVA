package kr.hs.emirim.practice;

public class ClassPractice {
	
	public static void main (String[] args) { 
		
		연예인 일훈=new 연예인();
		일훈.실명="정일훈";
		일훈.여자인가=false;
		일훈.방송하기();
		일훈.인터뷰하기();
		
		System.out.println();
		
		영화배우 박서준 = new 영화배우();
		박서준.실명="박서준";
		박서준.여자인가=false;
		박서준.방송하기();
		박서준.인터뷰하기();
		박서준.대표영화="청년경찰";
		박서준.울기();
		박서준.개인기하기();
		
		System.out.println();
		
		연예인 연예인A씨 = 박서준;
		연예인A씨.방송하기();
		연예인A씨.인터뷰하기();
		//연예인A씨.울기();  //안되는 이유는 : 영화배우클래스엔 울기메소드가 있지만 지금 연예인
		//클라스로 맏은 박서준은 영화배우가 아니기 때문에 울기라는 기능이 사라진다. 
		//비록 본질 이 영화배우더라도 연예인으로 받은 이상 영화배우의 속성은 받을 수 없다.
		//연예인 박서준을 울게 만들 수 있는 방법은 아래 이다.
		((영화배우)연예인A씨).울기();
		
		System.out.println();
		
		가수 김영철=new 가수();
		김영철.실명="김영철";
		김영철.여자인가=false;
		김영철.대표곡="널 사랑하지 않아";
		김영철.공연하기();
		김영철.개인기하기();
		
		ClassPractice cp = new ClassPractice();
		
		놀기();
	}

	private static void 놀기() {
		//main함수에 있는 놀기();는 고정되지 않음
		//객체화 하지 않았기 때문에 static
	}
	
}

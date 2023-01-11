package com.kh.second;

public class MethodTest {
	
	public static void main(String[] args) {
		
		char a = '가';
		String d = new String("come");
		int b = 1;
		int c = 1;
		
		System.out.println(a);
		System.out.println(d);
		System.out.println( b + c);
		
		System.out.println("찍히니?");
	}
	
	/* 
	 * 한 클래스 내에 여러 개의 메소드를 정의해둘 수 있음
	 * 한 클래스 내에 무조건 메인 메서드를 포함할 필요도 없음(하나의 '프로젝트' 단위에서 최소 한개만 존재하면 된다.)
	 */
	
	public void TestPrintA() {
		
		
		System.out.println("testPrintA 메서드 실행");
	}

	public void TestPrintB() {
		
		System.out.println("testPrintB 메서드 실행");

	}
	
	public void TestPringC() {
		
		System.out.println("testPrintC 메서드 실행");
		
	}
	
	// ** main 메서드 밖에있으니 콘솔이 안찍힌다!? **
	
}

package com.kh.first; // 패키지 선언부 (현재 클래스의 패키지 경로)

// 클래스 선언부
public class HelloEveryone {

	/*
	 * Class 유사한 특징을 지닌 코드들 (변수, 메소드) 을 묶어놓은 집합체 자바에서는 모든 코드들은 반드시 클래스 안에 존재해야 하며, 한
	 * 개의 클래스 = 한개의 .Java 파일이 된다.
	 */

//	내가 작성하고 싶은 코드를 적는 부분
//	단, 소스코드는 클래스 안에 바로 작성이 불가하고, "메소드" 안에 작성해야함
//	
//	
//	메소드 만들기
//	-> main 메소드, main이 아닌 메소드(일반 메소드)
//	
//	
//	**일반 메소드의 기본 표현법**

//	public void 메소드명() {
//
//	}

//	**메인 메소드 표현법**

	public static void main(String[] args) {

		
		/* Method 
		 * 사전적으로 "기능"을 의미
		 * 
		 * Method의 특징
		 * 1. 메서드는 'main 메서드'와 '일반 메서드'로 나뉜다
		 * 2. 하나의 클래스 안에 여러개의 메서드 생성 가능
		 * -> 메서드의 이름은 원칙적으로 중복이 불가능, 어떤 규칙 (오버로딩) 에 의해 이름이 중복될 수 있다.
		 * 3. 메서드 안에 코드를 실행하려면 '호출'을 해줘야 한다
		 * -> 일반 메서드의 경우에는 스스로 실행되지 않는다 (다른 메서드에서 호출해줘야함)
		 * -> main 메서드의 경우 스스로 실행될 수 있긴하다. (JVM이 호출해줌)
		 * 
		 * ** main 메서드 **
		 * 프로그램의 시작점을 나타내는 메서드
		 * 프로그램당 '최소 1개씩'은 갖고 있어야 한다. (물론 여러개도 존재 가능)
		 * 
		 * ** 메서드가 필요한 이유 **
		 * 하나의 기능을 메소드별로 정의해두고 필요에 따라 언제든지 가져다 쓸 목적(코드의 재사용)
		 */
		
		System.out.println("Hi Everyone!");
		System.out.println("안녕하세요");
		
		System.out.print("Holly");
		System.out.print("Molly");
		
		System.out.print("Holly\n");
		System.out.print("Molly");
		
		// 위 두가지 출력 방법의 차이점?
		// System.out.println();   <- 출력 하나당 한줄(줄 바꿈까지 포함 / 개행)
		// System.out.print();     <- 줄 바꿈을 하지 않는다
		// \n   <-  줄 바꿈 기호 먹는다
		
		System.out.printf("/n넌 뭐니?/n");
		System.out.printf("%n넌 뭐니?%n");
		// System.out.printf(format, arguments)  <- 기본 문법
		// 이놈은 줄 바꿈 기호가 안먹는다
		
		/* %n : 줄바꿈
		%s : String 형식으로 출력
		%d : integer 형식으로 출력
		%f : float 형식으로 출력
		%t : date, time 형식으로 출력
		%o : 8진수 integer 형식으로 출력
		%x : 16진수 integer 형식으로 출력
		%b : boolean 형식으로 출력
		%e : 지수 형식으로 출력
		*/
		
	}

}

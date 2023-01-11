package com.kh.third;

import com.kh.first.HelloEveryone;

public class MyName {

	public void callMyName() {

		System.out.print("안녕하세요 제 이름은 조승호입니다.");
		
		
		
		// static이 붙은 메서드를 호출 할 땐 해당 클래스에 접근해서 실행해줘야 한다.
		HelloEveryone.main(null);
		
		System.out.println("나오는겨 어쩌는겨");
	}

	public void AddNum() {
		
		int a = 1;
		int b = 2;
		
		System.out.println(a + b);
	}

}


/*
 * ** 자바의 명명 규칙 **
 * 
 * 1. 영어 사용
 * 2. 띄어쓰기 사용X
 * 3. 의미 부여해서 여러 단어를 조합하여 작명
 * 4. 패키지(Package)명은 소문자로 작명
 * 5. 클래스(Class)명은 첫 글자가 대문자로 시작
 * -> 4, 5번 규칙 합체
 * 	ex) com.kh.first 패키지에 HelloEveryone 클래스를 만들었음
 * 		이 클래스의 풀 네임은?  -> com.kh.first.HelloEveryone
 * 		* 어디까지 패키지 이름이고 클래스 이름이 어디서 시작인지 가시성을 위한 규칙 *
 * 6. Method 명은 첫 글자가 소문자로 시작
 * 7. 변수명은 첫 글자가 소문자로 시작
 * 8. 공통 원칙 : 여러개의 단어를 조합하여 지을 경우 띄어쓰기 대신 첫 글자를 대문자로 작명
 * 
 * 	ex) 클래스명 Methodtest -> MethodTest
 * 		메서드명 testprint  -> testPrint
 * 
 */





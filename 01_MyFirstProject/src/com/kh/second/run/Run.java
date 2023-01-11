package com.kh.second.run;

import com.kh.second.MethodTest;

public class Run {

	public static void main(String[] args) {

		System.out.println("나오니?");
		
		/*
		 * ** 메서드 호출 방법 **
		 * 같은 클래스에 있는 메서드를 호출하고자 한다면 단순히 호출만 해주면 됨
		 * [ 표현법 ]
		 * 호출하고자 하는 메서드명();
		 * 
		 * 그렇다면 다른 클래스에 있는 메서드를 호출하고자 한다면?
		 * 1. 호출하고자 하는 메서드가 존재하는 Class를 생성 (new)
		 * [ 표현법 ] 
		 * 클래스명 대변할이름 = new 클래스명();
		 * 
		 */
				
		MethodTest mt = new MethodTest();
		System.out.println(mt);
	}

}

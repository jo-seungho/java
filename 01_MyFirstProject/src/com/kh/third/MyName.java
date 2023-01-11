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

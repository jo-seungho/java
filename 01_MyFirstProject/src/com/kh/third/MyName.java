package com.kh.third;

import com.kh.first.HelloEveryone;

public class MyName {

	public void callMyName() {

		System.out.print("�ȳ��ϼ��� �� �̸��� ����ȣ�Դϴ�.");
		
		
		
		// static�� ���� �޼��带 ȣ�� �� �� �ش� Ŭ������ �����ؼ� ��������� �Ѵ�.
		HelloEveryone.main(null);
		
		System.out.println("�����°� ��¼�°�");
	}

	public void AddNum() {
		
		int a = 1;
		int b = 2;
		
		System.out.println(a + b);
	}

}


/*
 * ** �ڹ��� ��� ��Ģ **
 * 
 * 1. ���� ���
 * 2. ���� ���X
 * 3. �ǹ� �ο��ؼ� ���� �ܾ �����Ͽ� �۸�
 * 4. ��Ű��(Package)���� �ҹ��ڷ� �۸�
 * 5. Ŭ����(Class)���� ù ���ڰ� �빮�ڷ� ����
 * -> 4, 5�� ��Ģ ��ü
 * 	ex) com.kh.first ��Ű���� HelloEveryone Ŭ������ �������
 * 		�� Ŭ������ Ǯ ������?  -> com.kh.first.HelloEveryone
 * 		* ������ ��Ű�� �̸��̰� Ŭ���� �̸��� ��� �������� ���ü��� ���� ��Ģ *
 * 6. Method ���� ù ���ڰ� �ҹ��ڷ� ����
 * 7. �������� ù ���ڰ� �ҹ��ڷ� ����
 * 8. ���� ��Ģ : �������� �ܾ �����Ͽ� ���� ��� ���� ��� ù ���ڸ� �빮�ڷ� �۸�
 * 
 * 	ex) Ŭ������ Methodtest -> MethodTest
 * 		�޼���� testprint  -> testPrint
 * 
 */





package com.kh.second.run;

import com.kh.second.MethodTest;

public class Run {

	public static void main(String[] args) {

		System.out.println("������?");
		
		/*
		 * ** �޼��� ȣ�� ��� **
		 * ���� Ŭ������ �ִ� �޼��带 ȣ���ϰ��� �Ѵٸ� �ܼ��� ȣ�⸸ ���ָ� ��
		 * [ ǥ���� ]
		 * ȣ���ϰ��� �ϴ� �޼����();
		 * 
		 * �׷��ٸ� �ٸ� Ŭ������ �ִ� �޼��带 ȣ���ϰ��� �Ѵٸ�?
		 * 1. ȣ���ϰ��� �ϴ� �޼��尡 �����ϴ� Class�� ���� (new)
		 * [ ǥ���� ] 
		 * Ŭ������ �뺯���̸� = new Ŭ������();
		 * 
		 */
				
		MethodTest mt = new MethodTest();
		System.out.println(mt);
	}

}

package com.kh.second;

public class MethodTest {
	
	public static void main(String[] args) {
		
		char a = '��';
		String d = new String("come");
		int b = 1;
		int c = 1;
		
		System.out.println(a);
		System.out.println(d);
		System.out.println( b + c);
		
		System.out.println("������?");
	}
	
	/* 
	 * �� Ŭ���� ���� ���� ���� �޼ҵ带 �����ص� �� ����
	 * �� Ŭ���� ���� ������ ���� �޼��带 ������ �ʿ䵵 ����(�ϳ��� '������Ʈ' �������� �ּ� �Ѱ��� �����ϸ� �ȴ�.)
	 */
	
	public void TestPrintA() {
		
		
		System.out.println("testPrintA �޼��� ����");
	}

	public void TestPrintB() {
		
		System.out.println("testPrintB �޼��� ����");

	}
	
	public void TestPringC() {
		
		System.out.println("testPrintC �޼��� ����");
		
	}
	
	// ** main �޼��� �ۿ������� �ܼ��� ��������!? **
	
}

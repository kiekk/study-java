package stringEx;
/*
 	
 */
public class StringTest04 {

	public static void main(String[] args) {
		//100 ���ڿ��� ����� �ʹ�
		//1) String tmp = 100+"";		//������ �ߺ�����(java�� X)
		//2) String temp = String.valueOf(100);	��������� �����ؾ� �� �޼��带 �����߱� ������ 
												//1)���ٴ� �� ������ �����մϴ�.
		
		String tmp = String.valueOf(100);
		System.out.println(tmp);
		
	}

}

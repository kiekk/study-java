package dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	��¥ ���� ũ����
 	Date�� Calender
 	
 	1) Date : jdk 1.0���� (������)
 		java.util.Date --- O
 		java.sql.Data  --- X
 		new Date()	-> ������ �̿�
 		�����ϰ� ��¥�� ������ �� �ֽ��ϴ�. toString()�� �������̵� �Ǿ� �ֽ��ϴ�.
 		Date �޼������ deprecate �Ǿ� �ִ� �޼������ �����ϴ�. -> replace ��ü�ϱ⸦ Calender�� �����մϴ�.
 		
 	2) Calender : jdk 1.1���� (�Ź���)
 		Calender.getInstance(); -> �̱��� �̿�
 		�������� ��¥ ��Ҹ� ������ �ֽ��ϴ�. 
 */
public class DateEx {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);	//�����ϰ� ��¥�� ����� �� �ֽ��ϴ�.
		
		//��¥������ ������ �ִ� Ŭ������ �̿��� ���ϴ�.
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strToday = sdf.format(today);	//format�� �����͸� ����
		System.out.println(strToday);
		
		strToday = sdf.format(new Date());	//���� ��¥�� �����ϰ� �����ͼ� �ٷ� ���ڿ��� parse�մϴ�.(�Ľ��մϴ�.)
		System.out.println(strToday);
		
		sdf.applyPattern("yyyy�⵵ MM�� dd�� a HH�� mm�� ss��");
		strToday = sdf.format(new Date());
		System.out.println(strToday);
		
		System.out.println(sdf.format(new Date()));
		

	}

}

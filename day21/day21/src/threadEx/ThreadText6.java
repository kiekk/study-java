package threadEx;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	���μ��� ���ο� �۾�����
 	�ּ��� �ϳ��� ���μ���(�������α׷�)�� �ϳ��� ������ �̻��� ������ �ֽ��ϴ�.

 	 ����ȭ (synchronized)
 	 - lock ���
 	 ��Ƽ������ -> �����ٷ��� �������� �����带 ���� ó���ϰ� �˴ϴ�.
 	 �� ��, ���������� �ϳ��� �����尡 ����Ǳ� ���� �ٸ� �������� ������
 	 �����ϴ� ������� "����ȭ"�� ���˴ϴ�.
 	   : �ٸ� �����尡 ���� �� �����ϴ�.
 	 �ݵ�� �ʿ��� ��쿡�� ����մϴ�.

 	 1. �޼��� ��ü������ ����ȭ�� �̴ϴ�,
 	 synchronized �޼���(){
 	 	//�Ӱ迵�� - �����尡 �����ϴ� �ڿ�(�ν��Ͻ���)
 	 }

 	 2. �޼��� ���ο��� ����ȭ�� �̴ϴ�.
 	 �޼���(){
 	 	synchronized(������ ��ü){
 	 		//�Ӱ迵�� - �����尡 �����ϴ� �ڿ�(�ν��Ͻ���)
 	 	}
 	 }
 */

public class ThreadText6 {
	public static void main(String[] args) {
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(date));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

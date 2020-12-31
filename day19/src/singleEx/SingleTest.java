package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	�̱��� ����
 	1. �����ڴ� private
 	2. static �ʵ� ��ü�� ����ϴ�.
 	3. ���� �޼��� �ϳ��� static public ���� ����ϴ�.
 */
class Singleton {
	private static Singleton single;	//�� ������ ���� getInstance �޼��忡�� ��ü ������ �Ǵ��ϰ� �˴ϴ�.
	private Singleton() {};
	public static Singleton getInstance() {
		//single�� �ִ� ���� null �̶��, �ѹ��� �ν��Ͻ��� ������ ���� �����ϴ�.
		//�׷��� �����ڸ� ���� �ν��Ͻ��� ���Խ��� �ݴϴ�.
		//�׷��� �� ���Ŀ� �ٽ� getInstance()�� ȣ���ϰ� �Ǹ�, 
		//���̻� single�� ���� �ƴϰ� �� ���Դϴ�(ó�� ����� ���� ����)
		//�׷��� ó�� ����� ���� single�� �״�� return��ŵ�ϴ�.
		if(single == null) {
			return single = new Singleton();
		}
		return single;
	}
}
public class SingleTest {

	public static void main(String[] args) {
//		new Singleton();	//����
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		//�ѹ� ��ü�� �����Ǿ��� ������ ���� �ν��Ͻ��� �����ϴ���,
		//�ν��Ͻ��� ������ �ϳ��� �����ؾ� �ϱ� ������
		//ó�� ������� �ν��Ͻ��� return�ް� �˴ϴ�.
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
	}

}

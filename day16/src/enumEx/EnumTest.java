package enumEx;

import java.util.Enumeration;
import java.util.Vector;

/*
 	Enumeration �������̽� : ������ (������)
 	
 	�÷��ǿ� �����ؼ� ��Ҹ� ã�ư� �� ����մϴ�.
 	
 	(�÷����� Enumeration�� ����ϱ�)	  : elements()(����)
 	(�÷��ǿ��� �� �о�� ��Ұ� �ֳ���?) : hasMoreElements()(����) -> true,false ���� ��ȯ�մϴ�.
 	(�׷� �� ���� ��Ҹ� �о�Ͷ�)		  : nextElement()(�ܼ�)
 	enhanced for���� ��üǰ�̶�� ���� ����
 */
public class EnumTest {

	public static void main(String[] args) {
		String[] arStr = {"�ȳ�","ȫ�浿","�̼���","�ڹ���"};
		
		Vector<String> vec = new Vector<String>();
		
		//�迭 String == vec<String>�� ����� Ÿ���� �����ϰ� �ƴ�
		//������ Ÿ������ ������� ������ raw Type ��� ǥ�ð� ���� �ʽ��ϴ�.
		
		//vec���ٰ� add(�迭�� ���) ��ų �� �ְ� �ƽ��ϴ�.
		for (int i = 0; i < arStr.length; i++) {
			vec.add(arStr[i]);
		}
		System.out.println(vec);
		
		//vec ��Ҹ� Enumeration(������)�� �̿��ؼ� ����� ���ϴ�.
		//1. vec�� ����մϴ�.
		//2. vec�� ��Ұ� �ִ��� �˻��մϴ�.
		//3. vec�� ��Ҹ� �����ɴϴ�.
		
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
		}
//		System.out.println(en.nextElement());
//		��Ұ� ���̻� �������� �ʴµ��� ����Ϸ��� �Ѵٸ� NoSuchElementException ���ܰ� �߻��մϴ�.
//		Exception in thread "main" java.util.NoSuchElementException: Vector Enumeration
//		at java.util.Vector$1.nextElement(Vector.java:355)
//		at enumEx.EnumTest.main(EnumTest.java:42)
	}

}

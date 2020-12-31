package enumEx;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/*
 	Iterator �������̽� : �ݺ��� (�Ź���)
 	ArrayList�� Enumaration ������ �� �޽��ϴ�.
 	Vector�� Enumaration, Iterator ��� ���� �޽��ϴ�.
 	
 	�÷��ǿ� �����ؼ� ��Ҹ� ã�ư� �� ����մϴ�.
 	
 	(�÷����� Iterator�� ����ϱ�)	  : iterator()(����)
 	(�÷��ǿ��� �� �о�� ��Ұ� �ֳ���?) : hasNext()(����) -> true,false ���� ��ȯ�մϴ�.
 	(�׷� �� ���� ��Ҹ� �о�Ͷ�)		  : next()(�ܼ�)
 */
public class IterTest {

	public static void main(String[] args) {
		String[] arStr = {"�ȳ�","ȫ�浿","�̼���","�ڹ���"};
		
		Vector<String> vec = new Vector<String>();
		
		for (int i = 0; i < arStr.length; i++) {
			vec.add(arStr[i]);
		}
		System.out.println(vec);
		
		//Iterator�� �����ؼ� ����� ���ϴ�.
		//��ü = vec.iterator();
		Iterator<String> itr = vec.iterator();
		//��ü.��Ұ� �ִ�?
		while(itr.hasNext()) {
			//��ü���� �����ͼ� ��¹��� �־�
			System.out.println(itr.next());
			//Object obj = iter.next();	Object Ÿ�� ������ �����ϰ� ����� ���� �ֽ��ϴ�.
			//next() �޼���� �÷��ǿ��� ���� ��ҷ� Ŀ���� �ű�� ����� �մϴ�.
			//next()�� ����� ������ ����� ��ġ�� ����Ǳ� ������, �� ���� �� ĭ�� �̵��ǵ��� ���ǽ��� �ۼ��ؾ� ������ �߻����� �ʽ��ϴ�.
		}
		//next()�� ���� ������ ������, ���̻� ��Ҹ� ����ų �� �����ϴ�.
		//�׷��� �ݺ��ڸ� ����ϰ� �ʹٸ�, �ٽ� ���(�ʱ�ȭ)���Ѿ� �մϴ�.
		itr = vec.iterator();			//������ ���ٸ� NoSuch..���ܰ� �߻��մϴ�.
		System.out.println(itr.next());
		
	}

}

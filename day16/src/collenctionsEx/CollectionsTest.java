package collenctionsEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*
 	Collections : Ŭ����	(Collection �� �������̽�)
 	- �÷����� ����� �� �ִ� �޼������ ������ �ִ� Ŭ�����Դϴ�.
 */
public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);
		//1�ڿ� 0�� �ְ� �ʹ�
		//list.add(0) -> 0�� ���� �������� �߰��˴ϴ�.
		list.add(list.indexOf(1)+1,0);		//+1�� �� ���� ��°�� �ǹ��մϴ�.
		System.out.println(list);
		
		//�̹����� 1�� ��������
		//�׷���, �׳� 1�� ã���� 1�� �ڸ��� 0�� ����,
		//1�� �ڷ� �и��� �˴ϴ�.
		//�׷��� indexOf(1)+1  �� ���� ��Ҹ� �˷��� �ڿ� �����߽��ϴ�.
		
		//Collections : ����ƽ �޼������ ������ �ֽ��ϴ�.
		System.out.println(Collections.max(list));
		ArrayList<Integer> cpyList = list;
		Collections.sort(cpyList);		//������������ list��ü�� ����
		System.out.println("���� : "+list);
		System.out.println("�������� ���� : "+cpyList);
		
		Collections.shuffle(cpyList);
		System.out.println("cpyList ���� : "+cpyList);
		
		//sort : ��������
		//cpyList�� ������������ �����ϰ� �ʹ�
		//reverse()
		//�������� �޼���� ���� ������, ���� �������� ������ �� reverse���ݴϴ�.
		Collections.sort(cpyList);
		Collections.reverse(cpyList);
		System.out.println("�������� ���� : "+cpyList);
		
		
	}

}

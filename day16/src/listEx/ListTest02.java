package listEx;

import java.util.ArrayList;
import java.util.List;

/*	
 	ArrayList
 		- Vector�� �޼������ ���� �°��ؼ� ����մϴ�.
 		- capacity�� size�� �����ϱ� ������, capacity()�� trimToSize()�� �����ϴ�.

 	List�迭�� Ư¡ 
 	1. ���� ��Ұ� �̹� ��� �־ �ߺ��ؼ� ��� �����͸� �Է��� �� �ֽ��ϴ�.
 	2. �׻� ������ �����մϴ�(index)

 	set�迭�� Ư¡ -- List�� �ݴ�  
 	1. ���� ��Ұ� ������ �Է� �� �� �����ϴ�.
 	2. ������ �����ϴ�.
 */
public class ListTest02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		int sum = 0;
		//��� ����ϱ�  - 1
		System.out.println("��� ����ϱ� - 1");
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
			sum += (int)list.get(i);		//list.get(i)�� Object�̱� ������ Integet�� ����ȯ ����� ������ 
			//sum += (Integer)list.get(i);	//autoUnboxing���� ���ؼ� int������ ����ȯ �ص� ���������� �۵��մϴ�.
		}
		System.out.println("��� ����ϱ� - 1�� sum :"+sum);
		sum = 0;
		//��� ����ϱ� - 2
		System.out.println("��� ����ϱ� - 2");
		for (Object tmp : list) {
			System.out.println(tmp);
			sum += (int)tmp;				//list.get(i)�� Object�̱� ������ Integet�� ����ȯ ����� ������ 
			//sum += (Integer)tmp;			//autoUnboxing���� ���ؼ� int������ ����ȯ �ص� ���������� �۵��մϴ�.
		}
		System.out.println("��� ����ϱ� - 2�� sum :"+sum);

		//30���� ã�Ƽ� 300������ ������ ���ϴ�.
		//1�� ���
//		for(int i = 0;i<list.size();i++) {
//			if(list.contains(30)) {
//				if(list.get(i) == (Object)30) {
//					list.set(i, 300);
//				}
//			}//end if
//		}//end for
		//����ϱ�
//		System.out.println(list);
		//2�� ���
//		if(list.contains(30)) {
//			list.set(list.indexOf(30), 300);
//		}else {
//			System.out.println("ã�� ��Ұ� �����ϴ�.");
//		}
//		System.out.println(list);
		
		//10���� 20�� ���̿� 15���� �����غ��ϴ�.
		//�����ε��� add�޼��� ����غ���
		list.add(1, 15);
		System.out.println(list);
		//40���� 50���� �����ؼ� ����غ��ϴ�.
		//subList�޼��� ����غ���
//		System.out.println(list.subList(4, 6));  //index ���� ���� �Է��ϴ� �ͺ��� �ڵ����� ���ǵ��� �޼��带 �̿��ϵ��� �մϴ�.
//		System.out.println(list.subList(list.indexOf(40), list.indexOf(50)+1));
		List list2 = list.subList(list.indexOf(40), list.indexOf(50)+1);
		//list.subList(list.indexOf(40), list.indexOf(50)+1)�� list�� ��ȯ�ϱ� ������ Ÿ���� List�� ����ȯ ����� �մϴ�.
		//���� ArrayList�� ����ȯ �ϰ� �ɰ�� ClassCastException ���ܰ� �߻��մϴ�.
		//Exception in thread "main" java.lang.ClassCastException: java.util.ArrayList$SubList cannot be cast to java.util.ArrayList
		ArrayList list3 = new ArrayList(list.subList(list.indexOf(40), list.indexOf(50)+1));
		//ArrayList�� ����ϰ� �ʹٸ�, ����ȯ�� �ϴ� ���� �ƴ϶� ArrayList�����ڸ� �̿��մϴ�.
		System.out.println(list2);
		System.out.println(list3);
		
		//50���� �����غ��ϴ�.
		//remove�� �ݵ�� �� ��Ұ� �����ϴ� ��쿡�� ����ؾ� �ϱ� ������
		//���ǽ��� �̿��� ���� �ش� ��Ұ� �ִ��� Ȯ���ؾ� �մϴ�.
		int num = 50;
		if(list.contains(num)) {
			int idx = list.indexOf(num);
			list.remove(idx);			
			System.out.println(list);
		}else {
			System.out.println("�����Ϸ��� ��Ұ� �������� �ʽ��ϴ�.");
		}
	}

} 

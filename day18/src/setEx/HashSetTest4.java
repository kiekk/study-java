package setEx;

import java.util.HashSet;

public class HashSetTest4 {

	public static void main(String[] args) {
		//�� 6���� ��Ұ� �ֽ��ϴ�.
		String[] str = {"C���","�ڹ�","XML","C���","HTML","�ڹ�"};
		
		//����, C���,�ڹٰ� ��ġ�� ����Դϴ�.
		HashSet hs1 = new HashSet<>();
		HashSet hs2 = new HashSet<>();
		
		//hs1 ���� �ߺ������� ��� ��Ҹ� �ֽ��ϴ�.
		//hs2 ���� �ߺ��� ��Ҹ� ��� �����ϴ�.
		for (String tmp : str) {
			if(!hs1.add(tmp)) {		//hs1.add(tmp)�� �̹� ����ǰ� �� �� ������� true,false�� ��ȯ�ϱ� ������
									//hs1.add(tmp)�� true�̸� hs1.add(tmp)�� ����
				hs2.add(tmp);		//hs1.add(tmp) �� false�� ��쿡 hs2.add(tmp)�� ����
			}
		}
		System.out.println("�ߺ� ������ ��� ��� hs1 : "+hs1);
		System.out.println("�ߺ��� ��� ��� hs2 : "+hs2);
		//removeAll �޼��� - ��ġ�� ��Ҹ� ����
		hs1.removeAll(hs2);
		System.out.println("hs2�� ��ġ�� ��Ҹ� hs1���� ���� : "+hs1);
		System.out.println("set�� �ִ� ��Ұ� ����ֽ��ϱ�? : "+hs1.isEmpty());
		hs1.clear();
		System.out.println("set�� �ִ� ��Ұ� ��� �ֽ��ϱ�? : "+hs1.isEmpty());
		
	}
}

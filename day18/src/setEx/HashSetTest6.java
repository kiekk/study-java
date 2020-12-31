package setEx;

import java.util.HashSet;

/*
 	�� Ŭ������ HashSet
 	-�ν��Ͻ� ��ü�� add() ��ų ����
 	 hahsCode()�� equals() �޼��带 �����ϰ� �������̵� �ؾ� �Ѵ�.
 */

public class HashSetTest6 {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<Person>();
		
		Person hgd = new Person("ȫ�浿", 1234567);
		Person iss = new Person("�̼���", 2234567);
		Person pms = new Person("�ڹ���", 3234567);
		
		set.add(hgd);
		set.add(iss);
		set.add(pms);
		
		//�ű� ȸ���� �����Ϸ��� �մϴ�.
		//����Ǿ� �ִ� set�� ��ҵ�� �ű�ȸ�� ������ ����,
		//�ű�ȸ���� add �� �� �ִ��� ������ ���θ� ���캾�ϴ�.
		Person newMember = new Person("�ƹ���",1234567); //�ֹι�ȣ�� ������ ��ü�� set�� ���� �ϰ� �ֽ��ϴ�.
		set.add(newMember);
		//hashCode()�� �θ��ϴ�. ���� 3���� �ؽ��ڵ��ϰ� �ٸ��� ����
		//set�� �߰��� �� �ֽ��ϴ�.
		//equals()�޼��带 �θ� �ʿ䰡 ���������ϴ�.
		System.out.println(set);
		
		//������ 1234567�̶�� �ֹι�ȣ�� �̹� set�ȿ� ��� �ִµ�,
		//newMember�� ���� �� ���Դϴ�.
		
		//�׷��� ��ü�� �ؽ��ڵ带 ��ȯ�ϴ� hashCode() �޼���δ� �ν��Ͻ��� �񱳰� �Ұ����մϴ�.
		//hashCode() �޼��忡���� ��� �ν��Ͻ� �ؽ��ڵ尪�� �����ϰ� ����ϴ�.
		//�� ������ equals()�� ȣ���ؼ�  ��ü�ȿ� �����͸� ���ϰ� �˴ϴ�.
		
		//hashCode()�� equals()�� �������̵� �� �� �ۿ� �����ϴ�.
		
		
	}
}

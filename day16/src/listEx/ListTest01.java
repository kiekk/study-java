package listEx;

import java.util.Vector;

/*
 	ArrayList Vector LinkedList Stack ���� Ŭ������ ����...=>List �������̽� �Ҽ�
 	
 		List �������̽� => Collection �������̽� �Ҽ��Դϴ�.
 	List �������̽��� Ư¡
 		-�ݵ�� ������ �����Ǿ� �ֽ��ϴ�.(�迭�� �ε��� ��ȣ�� ������ �ֽ��ϴ�.)
 		-�ϰ����� �������� (sequence)
 		-�迭�� ����, ��Ұ� ������ �ʽ��ϴ�.
 		-������ List�� ����� ������ �����ų �� �ֽ��ϴ�.
 		
 	Vector 		ArrayList
 	(������)	(�Ź���)
 	
 	�������� ����ϴ� �޼���
 	����� Ÿ���� �޶� ������ �����մϴ�. ���� �Ķ������ Ÿ���� Object���� �մϴ�.
 		add(���) 					: ��Ҹ� �߰��մϴ�. 
 		equals(���) 				: ���ϰ��� �ϴ� ����� ���� ���θ� Ȯ���մϴ�.
 		get(����) 					: �ش� ������ ��ġ(index)�� �ش��ϴ� ��Ҹ� �����ɴϴ�.(�迭�� ������ �����ϴ�.0�� ���� ����)
 		indexOf(���) 				: �ش� ����� ��ġ(index)�� ��ȯ�մϴ�.
 		size() 						: �迭�� length�� �����մϴ�. ����� ������ ��ȯ�մϴ�.
 		capacity() 					: �迭�� �뷮,ũ�⸦ ��ȯ�մϴ�.	-> Vector Ŭ�������� �����մϴ�.(ArrayList���� �����ϴ�.)
 		remove(����) 				: �ش� ������ ��ġ(index)�� �ش��ϴ� ��Ҹ� �����մϴ�.
 		remove(���) 				: �ش� ��Ҹ� ã�Ƽ� �����մϴ�.
 		set(����,���)  			: �ش� ������ ��ġ(index)�� ��Ҹ� �����մϴ�.
 		isEmpty()					: �ش� ��Ұ� ��������� ���θ� ��ȯ�մϴ�.
 		trimToSize()				: capacity�� �� �����͸� �����մϴ�. size�� �����ϰ� �����մϴ�.
 		subList(int from,int to)	: from���� to-1���� ����� ��ü�� ��ȯ�մϴ�. 
 									�̶� ��ȯ Ÿ���� ListŸ������ ��ȯ�մϴ�.
 								���� -> Vector, ArrayList ��� List�������̽��� �����ֱ� ������ List Ÿ������ 
 										Vector, ArrayList ��� ���� ���� �� �ֽ��ϴ�.
 		toArray()					: ������ �÷����� �迭�� ��ȯ�մϴ�. Object �迭�� ��ȯ�մϴ�.
 		removeAllElements()			: clear()�޼���� �����մϴ�. ��� ��Ҹ� �����մϴ�. 		
 										
 */
public class ListTest01 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		System.out.println("�� �뷮 : "+vec.capacity());		//�뷮�� 10���� �ʱ�ȭ�˴ϴ�.		
		vec = new Vector(5);									//�뷮��  5�� �ʱ�ȭ�մϴ�.
		System.out.println("�� �뷮 : "+vec.capacity());		
		//��� �߰�
		vec.add(10);
		vec.add("�ȳ�");
		vec.add(1.1);
		vec.add(true);
		vec.add('A');
		System.out.println("�� �뷮 : "+vec.capacity());	
		vec.add(20);											//�ѿ뷮 5 ��, 5��° �����͸� �־����ϴ�.
		System.out.println("�� �뷮 : "+vec.capacity());		//�뷮�� �ʰ��� ��� �ڵ����� ���ʱⰪ��ŭ�� �߰��մϴ�.
		vec.trimToSize();										//�� �����͸� �����Ͽ� �뷮�� size�� �����ϰ� �����ݴϴ�.
																//�̶� vec�뷮�� �ʱⰪ�� trimToSize�� ������ �ʱ�ȭ�˴ϴ�.
		System.out.println("�� �뷮 : "+vec.capacity());		//�뷮�� �ʰ��� ��� �ڵ����� ���ʱⰪ��ŭ�� �߰��մϴ�.
		vec.add(30);
		System.out.println("�� �뷮 : "+vec.capacity());		//�뷮�� �ʰ��� ��� �ڵ����� ���ʱⰪ��ŭ�� �߰��մϴ�.
		//����� ����
		System.out.println("�� ���� : "+vec.size());
		System.out.println(vec.contains(1.1));
		System.out.println(vec.contains("�ȳ�"));
		
		System.out.println(vec);
		//��� ����ϱ� - 1
		System.out.println("��� ����ϱ� - 1");
		for(int i = 0;i<vec.size();i++) {
			System.out.println((i+1)+"�� "+vec.get(i));
		}
		//��� ����ϱ� - 2
		System.out.println("��� ����ϱ� - 2");
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
		//��� �ʱ�ȭ
		vec.clear();
		System.out.println("vec.clear()�� ��� ����ϱ� - 3");
		for (Object tmp : vec) {
			System.out.println(tmp);
		}
	}

}

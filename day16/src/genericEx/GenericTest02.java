package genericEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
 	���ʸ�
	������ ����ȭ
	��ö�� 10 20 30
	�̼��� 11 21 31
	�ڹ��� 12 22 33

	���� Ÿ���� ���������� �����Ǿ� ���� ��,
	��ü������ add��ų �� �ְ�,
	Ŭ������ �����س��� : �� Ŭ����(Model)�̶�� �մϴ�.
	jsp�� bean�� �ش��մϴ�.
	�׸���, ArrayList�� ���ʸ��� �ش� �� Ŭ������ ���ʸ����� �ۼ��ϸ�
	ArrayList<MyClass> list = new ArrayList<Myclass>();
	list�� add() ��ų ������, MyClass�� �ν��Ͻ��� �߰��ϰ� �˴ϴ�.
 */
class MyException extends Exception{

	public MyException(Student e) {
		System.out.println(e);
	}
	
}
class Student{	
	private String name;
	private 
	int bunho;
	public Student(String name, int bunho) {
		this.name = name;
		this.bunho = bunho;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBunho() {
		return bunho;
	}

	public void setBunho(int bunho) {
		this.bunho = bunho;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", bunho=" + bunho + "]";
	}  

}
public class GenericTest02 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		//list���� Student Ÿ���� ��ü�� add ��ų �� �ְ� �Ǿ����ϴ�.
		list.add(new Student("��ö��",10));
		Student std2 = new Student("�̼���",20);
		list.add(std2);

		System.out.println(list);
		//��ö�� ��ȣ, �̼��� ��ȣ�� ��
		int sum = 0;
		for(Student a : list) {
			sum += a.getBunho();
		}
		System.out.println("�� ��ȣ �� : "+sum);
		sum = 0;

		//iterator�� ���� ���
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student std = itr.next();
			System.out.println(std);
		}
		itr = list.iterator();
		//��ö�� ��� ����� �ִ��� �˻��� ���ϴ�.
		//1�� ���
//		try {
//			for(int i = 0;i<list.size();i++) {
//				if(list.get(i).getName().equals("��ö��")) {
//					throw new MyException(list.get(i));
//				}//end if
//			}//end for
//			System.out.println("������ �����ϴ�.");
//		}catch(MyException e) {
//			e.getMessage();
//		}//end try
		//2�� ���
		while(itr.hasNext()) {
			Student std = itr.next();
//			if(std.getName() == "��ö��") {		//���ڿ� �񱳴� ==������ ��� equals�� ������ �մϴ�.
			if(std.getName().equals("��ö��")) {
				System.out.println(std);
			}//end if
		}//end while
		itr = list.iterator();
		//�̼��� ��� ����� �̸��� �̼���� ������ ���ϴ�.
		//1�� ���
		while(itr.hasNext()) {
			Student std = itr.next();
//			if(std.getName() == "�̼���") {
			if(std.getName().equals("�̼���")) {
				std.setName("�̼���");
				System.out.println(std);
			}//end if
		}//end while
		//2�� ���
//		for(int i = 0;i<list.size();i++) {
//			if(list.get(i).getName().equals("�̼���")) {
//				list.get(i).setName("�̼���");
//				System.out.println(list.get(i));
//			}//end if
//		}//end for
		//3�� ���
//		for(Student a : list) {
//			String msg = a.getName();
//			if(msg.equals("�̼���")) {
//				msg="�̼���";
//				a.setName(msg);
//				System.out.println(a);
//			}//end if
//		}//end for
	}

}

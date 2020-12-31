package langEx;
/*
 	Object Ŭ����
 	hashCode()
 	equals()
 	toSTring()
 */
class Member{
	String name;
	long juminbunho;	//������ϱ�����
	public Member(String name, long juminbunho) {
		this.name = name;
		this.juminbunho = juminbunho;
	}
	@Override                                             
	public boolean equals(Object obj) {
		if(obj instanceof Member && obj != null) 
			return this.juminbunho == ((Member)obj).juminbunho;
		else 
			return false;
	}
}
public class ObjectTest04 {

	public static void main(String[] args) {
		Member m1 = new Member("dog",901010L);
		Member m2 = new Member("cat",901010L);
		
		//m1�� m2�� ���� ȸ�� �Դϱ�? �ֹι�ȣ�� ���غ��ϴ�.
		if(m1.equals(m2)) {
			System.out.println("���� ȸ���Դϴ�.");
			System.out.println("ȸ�������� �� �� �����ϴ�.");
		}else {
			System.out.println("���������� ȸ������ �� �� �ֽ��ϴ�.");
		}
	}
}


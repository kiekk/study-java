package langEx;
/*
 	Object Ŭ����
 	hashCode()
 	equals()
 	toSTring()
 */
class TypeC{
	
}
public class ObjectTest02 {

	public static void main(String[] args) {
		System.out.println(new TypeC());
		TypeC obj = new TypeC();
		System.out.println(obj);							//�ּҰ� �ؽ��ڵ�� ��µ˴ϴ�.
		System.out.println(obj.hashCode());					//�ؽ��ڵ�� 10������ ǥ��
		String a = String.format("%x\n", obj.hashCode());	//�ؽ��ڵ带 16������ ����
		System.out.println(a);
		System.out.println(obj.getClass().getName()+"@"+a);
		
		TypeC obj2 = new TypeC();
		TypeC obj3 = new TypeC();
							//����(�ּ�)���� ���ϴ� ���̱� ������ ���� �ٸ� ��ü�Դϴ�.
		if(obj2 == obj3) {			
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("���� ��ü");
		}else {
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("�ٸ� ��ü");
		}
		obj3 = obj2;		//obj2�� ����(�ּ�)���� obj3�� ����Ű�� �մϴ�.
							//�̶� obj3�� ������ �ִ� ����(�ּ�)�� or �ν��Ͻ� ������ ������� �˴ϴ�.
							//����(�ּ�)���� ���ϴ� ���̱� �̹����� ���� ���� ��ü�Դϴ�.
		if(obj2 == obj3) {			
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("���� ��ü");
		}else {
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("�ٸ� ��ü");
		}
	}

}

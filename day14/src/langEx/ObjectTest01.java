package langEx;
/*
	Object Ŭ����
	hashCode()
	equals()
	toSTring()
*/
class MyClass{
	
}
class TypeA{
	String name;
	int kor;
	{
		name = "ȫ�浿";
		kor = 100;
	}
	@Override
	public String toString() {
		return "�̸� : "+name+"\t���� ���� : "+kor+"��";
	}
}
class TypeB{
	String bunho;
	int eng;
	int math;
	public TypeB(String bunho, int eng, int math) {
		this.bunho = bunho;
		this.eng = eng;
		this.math = math;
	}
//	@Override
//	public String toString() {
//		return "��ȣ : "+bunho+"\t���� ���� : "+eng+"��\t���� ���� : "+math+"��";
//	}
	@Override				//alt + shift + s -> s -> �ڵ������� �ʱ�ȭ���� ������ݴϴ�.
	public String toString() {
		return "TypeB [bunho=" + bunho + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
public class ObjectTest01 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.toString());	 //��� : langEx.MyClass@7852e922
		System.out.println(obj);			 //��� : langEx.MyClass@7852e922
											 //obj������ �׻� .toString()�� �����Ǿ� �ֽ��ϴ�.
		TypeA aObj = new TypeA();
		System.out.println(aObj);
		
		TypeB bObj = new TypeB("1��",10,20);
		System.out.println(bObj);
	}

}

package extendsEx;
/*
	���
	private ����� super ������
	1. �ڽ� Ÿ������ �ʱⰪ�� �ִ� �����ڸ� ��������ϴ�.
	2. �ڽ� ������(�Ű����� 4��¥��)������ �ʱⰪ 4���� �ν��Ͻ� ������ �ʱ�ȭ ����� �մϴ�.
	3. �̶�, �ռ� 3�� ���ڴ� �θ�����ڿ��� �ٽ� �����ؾ� �մϴ�.
	4. �׸��� �ڽ��� ���� �ִ� �������Ը� �ʱ�ȭ�� �����ϸ� �˴ϴ�.
	5. printScore�� �θ� ���� �ִ� �޼����ε�.. �θ�� �ڽ��� art�� ���� �ִ��� �𸨴ϴ�.
	��� �ؾ� �̸�, ����, ����, ����, �̼����� ����� �� ������ ����غ��ϴ�.
 */
class Score{
	private String name;
	private int kor;
	private int eng;
	public Score(String name,int kor,int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public void printScore() {
		System.out.print(name +" "+kor+" "+eng);
	}
}
class SchoolArt extends Score{
	private int art;
	
	public SchoolArt(String name,int kor,int eng,int art) {
		super(name,kor,eng);
		this.art = art;
	}
	//�������̵�
	//1. �θ� �޼����� ����(���ȿ� �ִ� ����{})�� ���� �ȵ鶧,
	//2. �ڽ�Ŭ���������� �θ��� �޼��� ����ο� �Ȱ��� �ۼ��� ��,
	//3. �޼��� ���ο� ���� ���� �ҽ��� �ٽ� �ۼ��ϸ� �˴ϴ�.
	//	�̰��� �������̵� == ������ == �ٽ� �ۼ� �̶�� �մϴ�.
	//4. ��Ӱ��迡���� �ߵ��˴ϴ�. override(�����ϴ�,�Ⱒ�ϴ�)
	//	-�θ� �޼���� �ڽ��� �Ȱ��� �ۼ��ϴ� �ٶ���, ȣ�⿡�� ���ô��ϰ� �˴ϴ�.
	
	//
	
	public void printScore() {
		super.printScore();
		System.out.println(" �̼� : "+art+"��");
//		System.out.println("�̸� : "+getName()+" ���� : "+getKor()+"�� ���� : "+getEng()+"�� �̼� : "+art+"��");
	}
}
public class ExtendsTest02 {

	public static void main(String[] args) {
		SchoolArt hgd = new SchoolArt("ȫ�浿",100,100,100);
		hgd.printScore();
	}//end main
}//end class ExtendsTest01
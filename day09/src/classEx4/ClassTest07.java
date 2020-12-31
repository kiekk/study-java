package classEx4;
/*
 	this() : this ������

	 	������ 0~100���� ���� �� �ֽ��ϴ�.
	 	� ����� �Ѱ��� �Ⱥ� �� �ְ�,
	 	� ����� �Ѱ��� ������ �ִ� ��Ȳ�Դϴ�.
	 	(��, �̸��� �ݵ�� �����մϴ�.)
	 	������ ������ �̸���, �̸�+����,�̸�+����+����,�̸�+����+����+����
	 	�̶�, �� ���񺰷� 0~100�� ���� ��� �ؾ��մϴ�.
	 	�����ڴ� this()�� �̿��ؼ� ��Ȱ���� �� �ֵ��� �մϴ�.
 */
class Score{
	String name;
	int kor;
	int eng;
	int math;
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Score(String name, int kor, int eng) {
		this(name,kor,eng,0);
	}
	
	public Score(String name, int kor) {
		this(name,kor,0,0);
	}
	public Score(String name) {
		this(name,0,0,0);
	}
	
	//��¿븸 ����� (get/set����)
	void printScore() { 
		System.out.println("�̸� : "+name+"  ���� : "+kor+"�� ���� : "+eng+"�� ���� : "+math+"��");
	}
}

public class ClassTest07 {

	public static void main(String[] args) {
		//��ü 3�� ���� ��
		//�� ��ü�� �ʱⰪ�� ��� �ٸ��ϴ�.
		Score hgd = new Score("ȫ�浿",10,20,50);
		Score iss = new Score("�̼���",20,50); 
		Score pms = new Score("�ڹ���",30);
		
		hgd.printScore();
		iss.printScore();
		pms.printScore();
		
	}

}

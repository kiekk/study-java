package classEx4;

class Score2{
	String name;
	int bun=0;
	static int cnt = 0;
	int kor;
	int eng;
	int math;
	public void print() {
		System.out.println(bun+"�� : "+name+" // "+kor+" // "+eng+" // "+math +"��");
	}
	
	{	//�ν��Ͻ� �ʱ�ȭ ��
		//�ν��Ͻ��� ������� �� ���� �� ���� �����մϴ�.
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		bun = ++cnt;
		
		name = "����";
		kor = -1;
		eng = -1;
		math = -1;
		//��� �ν��Ͻ����� ó���� ���� �ְ��� �� �� ���� ���մϴ�.
		//�ν��Ͻ��� ������ ��, � ���� ���������� ��Ű���� �� �� ����մϴ�.
	}
}

public class ClassTest08 {

	public static void main(String[] args) {
		Score2 std1 = new Score2();
		Score2 std2 = new Score2();
		Score2 std3 = new Score2();
		Score2 std4 = new Score2();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	}//ene main
}//end class

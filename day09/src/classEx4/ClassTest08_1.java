package classEx4;
/*
 	�ν��Ͻ� �ʱ�ȭ ��
 	
 	�� Ŭ������, �ν��Ͻ� �ʱ�ȭ �� + �����ڰ� ���ÿ� �ִٸ�?
 	
 	�ʱ�ȭ ������?
 	1. �ν��Ͻ��ʱ�ȭ�� �����ϰ� ���� -> 2. �����ڷ� �Ѿ�� �� ������ �ȿ� �ִ� �ҽ��� �����մϴ�.
 */
class Score3{
	String name;
	int bun=0;
	static int cnt = 0;
	int kor;
	int eng;
	int math;
	public void print() {
		System.out.println(bun+"�� : "+name+" // "+kor+" // "+eng+" // "+math +"��");
	}
	
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		bun = ++cnt;
		
		name = "����";
		kor = -1;
		eng = -1;
		math = -1;
	}
	public Score3() {
		name = "�⺻ ������";
		kor = -2;
		eng = -2;
		math = -2;
	
	}
}

public class ClassTest08_1 {

	public static void main(String[] args) {
		Score3 std1 = new Score3();
		Score3 std2 = new Score3();
		Score3 std3 = new Score3();
		Score3 std4 = new Score3();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	}//ene main
}//end class

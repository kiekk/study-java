package classEx;
/*
 	Ŭ���� �����
 	5���� �л��� �ֽ��ϴ�.
 	�� �л����� 3���� ������ ���ϴ�.
 	�����͸� ����ȭ �ϱ� ���� Ŭ������ ����� ���ϴ�.
 */
class StdScore{
	String name;
	int kor;
	int eng;
	int math;
	
	void printStdScore() {
		System.out.printf("�̸� : %s\t",this.name);		//this�� ���� ����
		System.out.printf("���� : %d��\t",this.kor);
		System.out.printf("���� : %d��\t",this.eng);
		System.out.printf("���� : %d��\n",this.math);
	}//end printStdScore
}//end StdScore
public class ClassTest01 {

	public static void main(String[] args) {
		//1�� ȫ�浿 10 20 30,
		//2�� �ڹ��� 11 21 31,
		//3�� �̼��� 12 22 32,
		StdScore hgd = new StdScore();			//ȫ�浿 ��ü ����
		hgd.name = "ȫ�浿";					//ȫ�浿 ���� �Է�
		hgd.kor = 10;
		hgd.eng = 20;
		hgd.math = 30;
		StdScore pms = new StdScore();			//�ڹ��� ��ü ����
		pms.name = "�ڹ���";					//�ڹ��� ���� �Է�
		pms.kor = 11;
		pms.eng = 21;
		pms.math = 31;
		StdScore iss = new StdScore();			//�̼��� ��ü ����
		iss.name = "�̼���";					//�̼��� ���� �Է�
		iss.kor = 12;
		iss.eng = 22;
		iss.math = 32;
		hgd.printStdScore();					//ȫ�浿 ���� ���
		pms.printStdScore();					//�ڹ��� ���� ���
		iss.printStdScore();					//�̼��� ���� ���
		
	}//end main
}//end class

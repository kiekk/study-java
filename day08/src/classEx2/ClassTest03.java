package classEx2;

class Score {
	private int num;
	private int kor;
	private int eng;
	private int math;

	//setter �޼��� �����
	public void setNum(int num){this.num = num;}//end setNum
	public void setKor(int kor){this.kor = kor;}//end setkor
	public void setEng(int eng){this.eng = eng;}//end setEng
	public void setMath(int math){this.math = math;}//end setMath
	//getter �޼��� �����
	public int getNum(){return num;}//end getNum
	public int getKor(){return kor;}//end getKor
	public int getEng(){return eng;}//end getEng
	public int getMath(){return math;}//end getMath
	//���� ���ϱ� �޼ҵ�
	private int getSum() {			//�ش� �˰����� ������� ó��
									//�ٸ� �޼ҵ忡 �������� �޼ҵ�� ���� public���� ������ �ʿ�� �����ϴ�. private�� ����� ó��
		return this.kor+this.eng+this.math;
	}//end getSum
	//��� ���ϱ� �޼ҵ�
	private double getAvg() {
		return (this.kor+this.eng+this.math) / 3.0;
	}//end getAvg
	//string.format�� �̿��� ���
//	private String getAvg2() {
//		return String.format("%.1f", getSum() / 3.0);
//	}
	//��¿� �޼��带 ����� ���ϴ�.
	void printScore() {
		System.out.println("��ȣ : "+this.num+"�� ���� : "+this.kor+"�� ���� : "+this.eng+"�� ���� : "+this.math+"��");
		System.out.printf("���� : %d��   ��� : %.1f��\n",getSum(), getAvg());		//double�� getAvg�� ���� ���
//		System.out.println("���� : "+getSum()+"��   ��� : " + getAvg2()+"��");  //string.format�� �̿��� getAvg2�� ���� ���
		
	}//end printScore
}//end Score

public class ClassTest03 {

	public static void main(String[] args) {
		Score hgd = new Score();
		hgd.setNum(1);
		hgd.setKor(90);
		hgd.setEng(20);
		hgd.setMath(50);
		hgd.printScore();
		
		//hgd�� Ư�� �κи� ����ϰ� ���� ���
		//getter�޼ҵ� �̿�
		
		System.out.println("ȫ�浿�� ��ȣ : "+hgd.getNum()+ "�� ���� ���� : "+hgd.getKor()+"�� ���� ���� : "+hgd.getEng()+"�� "
				+ "���� ���� : "+hgd.getMath()+"��");
	}//end main
}//end class

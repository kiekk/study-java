package methodEx;

class A{
	//�ν��Ͻ�
	
	//�޼���
}
//class �ܺο� �޼��带 ������ �� �����ϴ�.
public class MethodTest01 {
	//�ʵ� (�ν��Ͻ� ����) ����
	int kor, eng, mat;
	//�޼��� ����
	//1)�޼��� �з�
	//		�Ϲ� �޼���(����Ͻ� �޼���)
	//		getter/setter
	//		������
	//		�߻�޼���
	//2)����Ͻ� �޼���
//	void printScore(int mK,int mE,int mM) {
		void printScore() {
		//this ��� ������ �޼ҵ� ���ο� �����ϰ� �ֽ��ϴ�.
		//�� this �� ��ü�� �����ϴ� ���������Դϴ�.
		//���� �������¾����� ,�����ϰ� �ֱ� ������
		//������ ��������� ����� �� �ֽ��ϴ�.
		//�� this�� �׻� �����ϰ� �ֱ� ������ �����մϴ�.
		//this�� ��ü�� ����մϴ�.
		//�׷��� ��ü�� ����� �� �ִ� �ν��Ͻ� ������ ����˴ϴ�.
		//mK = this.kor mE = this.eng mM = this.mat�� �����մϴ�.
		//this�� ����� ��� �Ű������� �ۼ����� �ʾƵ� �˴ϴ�.
		System.out.printf("���� : %d��\t���� : %d��\t���� : %d��\t",this.kor,this.eng,this.mat);
//		System.out.printf("\n���� : %d��\t���� : %d��\t���� : %d��\t\n",mK,mE,mM);
	}//end printScore
	void printScoreAr(int [] arScore){
		System.out.println();
		String []subName = {"����","����","����"};
		for(int i = 0;i<arScore.length;i++) {
			System.out.println(subName[i]+" ���� : "+arScore[i]+"��");
		}//end for(i)
	}//end printScoreAr
	public static void main(String[] args) {
		//ȫ�浿�� ���� = 10,���� = 20,���� = 30
		//printScore(��,��,��) ����غ��ϴ�.
		MethodTest01 hgd = new MethodTest01();
		hgd.kor = 10;
		hgd.eng = 20;
		hgd.mat = 30;
		System.out.println("-----ȫ�浿�� ����-----");
		hgd.printScore();
		//int []arScore = {ȫ�浿 ����};
		//printScoreAr(arScore) ����غ��ϴ�.
		//�迭�� class�� ���� ���� �ʱ� ������ printScore�� �޸� ���� �Ű������� ������ ��� �մϴ�.
		int []arScore = {hgd.kor,hgd.eng,hgd.mat};
		hgd.printScoreAr(arScore);
		
		//�̼����� ����
		MethodTest01 iss = new MethodTest01();
		iss.kor = 11;
		iss.eng = 22;
		iss.mat = 33;
		System.out.println();
		System.out.println("-----�̼��Ŵ� ����-----");
		iss.printScore();
		int []arScore2 = {iss.kor,iss.eng,iss.mat};
		iss.printScoreAr(arScore2);
	}//end main
}//end class

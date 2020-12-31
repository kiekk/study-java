package classEx;

import java.util.Scanner;

class StdScore3{
	static Scanner sc = new Scanner(System.in);
	private static int flag;
	String name;
	private int kor;
	private int eng;
	private int math;
	//kor, eng, math  set�޼ҵ�
	public void setKor(int kor) {											
		this.kor = kor;
	}//end setKor								
	public void setEng(int eng) {			
		this.eng = eng;
	}//end setEng													
	public void setMath(int math) {	
		this.math = math;	
	}//end setMath
	//kor, eng, math get�޼ҵ�
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	//�л� ���� ���
	void printStdScore() {
		System.out.println("��������������������������������������������");
		System.out.printf("��    �̸� : %2s               \n",this.name);		//this�� ���� ����
		System.out.printf("��    ���� : %2d��                 ��\n",this.getKor());
		System.out.printf("��    ���� : %2d��                 ��\n",this.getEng());
		System.out.printf("��    ���� : %2d��                 ��\n",this.getMath());
		System.out.println("��������������������������������������������");
	}//end printStdScore
}//end StdScore
public class ClassTest03 {
	static Scanner sc = new Scanner(System.in);
	static StdScore3[] NULL;
	static int flag;//�л� �Է� ���� �ľ��� �÷��� ����
	//���� �޴� �����ֱ�
	static int showMenu(int selectNum) {
		System.out.println("�����������������޴�    ����  ����������������");
		System.out.println("��   1. �л� ���� �Է��ϱ�          ��");
		System.out.println("��   2. �л� ���� ����ϱ�          ��");
		System.out.println("��   3. �л� ���� �ٽ��Է�          ��");
		System.out.println("��   0. ���� �ϱ�                       ��");
		System.out.println("������������������������������������������������");
		System.out.print("   �Է� : "); selectNum = sc.nextInt();
		return selectNum;
	}
	//�л� ���� �Է�
	static void inputStdScore(StdScore3 []arStdNum) {
		String name = "";
		int kor = 0,eng = 0,math = 0;
		String []subName = {"����","����","����"};
		if(flag == 1) {
			System.out.println("�̹� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println("��������������������������������������������������������������");
			System.out.println("     "+arStdNum.length + "���� �л��� ������ �Է��մϴ�.");
			System.out.println("��������������������������������������������������������������");
			for(int i = 0;i<arStdNum.length;i++) {
				arStdNum[i] = new StdScore3();
				System.out.print((i+1)+"�� �л��� �̸��� �Է��ϼ��� : "); arStdNum[i].name = sc.next();
				while(true){
					System.out.print(subName[0]+"������ �Է��ϼ��� : "); kor = sc.nextInt(); 
					if(kor >= 0 && kor <= 100) {
						arStdNum[i].setKor(kor);
						break;
					}
					System.out.println("0~100 ���̷� �Է����ּ���.");
				}//end while
				while(true){
					System.out.print(subName[1]+"������ �Է��ϼ��� : "); eng = sc.nextInt(); 
					if(eng >= 0 && eng <= 100) {
						arStdNum[i].setEng(eng);
						break;
					}
					System.out.println("0~100 ���̷� �Է����ּ���.");
				}//end while
				while(true){
					System.out.print(subName[2]+"������ �Է��ϼ��� : "); math = sc.nextInt(); 
					if(math >= 0 && math <= 100) {
						arStdNum[i].setMath(math);
						break;
					}
					System.out.println("0~100 ���̷� �Է����ּ���.");
				}//end while
			}//end for(i)
			flag = 1;							//flag ������ �л����� �Է��� ���� �ľ�
			System.out.println("������������������������������������");
			System.out.println("              �Է� �Ϸ�");
			System.out.println("������������������������������������");
		}//end if
	}//end inputStdScore
	static void showStdScore(StdScore3 []arStdNum) {
		if(flag != 1) {
			System.out.println("�л� ������ ���� �Է��ϼ���.");
		}else {
			for(int i = 0;i<arStdNum.length;i++) {
				arStdNum[i].printStdScore();
			}//end for
		}//end if
	}//end showStdScore
	static StdScore3[] createStdNum() {
		int stdNum = 0;
		System.out.println("���������������� �л� ���� �Է� ���α׷� ����������������");
		System.out.print("    �� ���� �л��� ������ �Է��Ͻðڽ��ϱ�? "); stdNum = sc.nextInt();
		System.out.println("����������������������������������������������������������������");
		StdScore3 []arStdNum = new StdScore3[stdNum];
		flag = 0;
		return arStdNum;
	}//end createStdNum
	public static void main(String[] args) {
		int selectNum = 0;
		StdScore3 []arStdNum = NULL;
		arStdNum = createStdNum();
		breakOut :
			for(;;) {
				selectNum = showMenu(selectNum);
				if (selectNum == 0) break breakOut;
				switch(selectNum) {
				case 1: inputStdScore(arStdNum);break;
				case 2: showStdScore(arStdNum); break;
				case 3: main(args);break;
				}//end switch
			}//end for
		System.out.println("���α׷��� �����մϴ�.");
	}//end main
}//end class

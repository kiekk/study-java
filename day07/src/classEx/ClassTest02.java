package classEx;

import java.util.Scanner;
class StdScore2{
	static Scanner sc = new Scanner(System.in);
	String name;
	private int kor;
	private int eng;
	private int math;

	public void setKor(int kor) {											
		this.kor = kor;
	}//end setKor							
	public void setEng(int eng) {			
		this.eng = eng;
	}//end setEng													
	public void setMath(int math) {	
		this.math = math;
	}//end setMath
	void printStdScore() {
		System.out.printf("�̸� : %s\t",this.name);		//this�� ���� ����
		System.out.printf("���� : %d��\t",this.kor);
		System.out.printf("���� : %d��\t",this.eng);
		System.out.printf("���� : %d��\n",this.math);
	}//end printStdScore
}//end StdScore
public class ClassTest02 {
	static Scanner sc = new Scanner(System.in);
	//�л� ���� �Է�
	static void inputStdScore(StdScore2 std) {
		int kor = 0,eng = 0,math = 0;
		String []subName = {"����","����","����"};
			System.out.print("�̸��� �Է��ϼ��� : "); std.name = sc.next();
			while(true){
				System.out.print(subName[0]+"������ �Է��ϼ��� : "); kor = sc.nextInt(); 
				if(kor >= 0 && kor <= 100) {
					std.setKor(kor);
					break;
				}
				System.out.println("0~100 ���̷� �Է����ּ���.");
			}//end while
			while(true){
				System.out.print(subName[1]+"������ �Է��ϼ��� : "); eng = sc.nextInt(); 
				if(eng >= 0 && eng <= 100) {
					std.setEng(eng);
					break;
				}
				System.out.println("0~100 ���̷� �Է����ּ���.");
			}//end while
			while(true){
				System.out.print(subName[2]+"������ �Է��ϼ��� : "); math = sc.nextInt(); 
				if(math >= 0 && math <= 100) {
					std.setMath(math);
					break;
				}
				System.out.println("0~100 ���̷� �Է����ּ���.");
			}//end while
	}//end inputStdScore
	public static void main(String[] args) {
		StdScore2 std = new StdScore2();
		System.out.println("---�л� ���� �Է� ���α׷�---");
		inputStdScore(std);
		std.printStdScore();
	}//end main
}//end class

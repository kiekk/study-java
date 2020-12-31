package classEx2;

import java.util.Scanner;

/*
 	Ŭ����{
 		�ʵ� : �ν��Ͻ� ���� (private)�ܺο� �����Ű�� �ʵ��� �մϴ�.
 				getter / setter, ������ ������ �Է°��� �־ �����մϴ�.
 		�޼���
 			-������ : �ν��Ͻ� ���� ��, �ʱⰪ�� ���� �� �ֽ��ϴ�.
 				����Ÿ���� �����ϴ�. Ŭ������� �����մϴ�.
 				���������� ���������� public�� ����մϴ�.
 				1) �⺻ ������
 					-�����Ϸ��� �ڵ����� ����� �ݴϴ�. ��, �ٸ� �����ڰ� ���� ��쿡�� ����� �ݴϴ�.
 				2) �μ� �ִ� ������
 					-�ʵ忡 ���� �������� �����ڸ� ���� �� �ֽ��ϴ�.(�����ε�) 
 			-setter / getter
 				1) �� ������ �� �ʿ��մϴ�.
 				2) �����ڰ� ���� ��쵵 �ֱ� ������ setter�� �̿��ؼ� �� �Է��� �����մϴ�.
 			-�Ϲ� ����Ͻ� �޼���
 				1) Ŭ������ ����� ����մϴ�.
 				2) �ʿ信 ���� public, private�� ������ ����մϴ�.
 	}
 	������ �𵨸�
	1) ������� ���� Ŭ���� �����
	2) ��� Ŭ���� ����
	3) ���� ����� Ŭ����

 */
class BirthYAD{
	String name;
	private int year;
	private int month;
	private int day;
	//getter / setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	public int getDay() {return day;}
	public void setDay(int day) {this.day = day;}
	//������
	public BirthYAD(String name,int year,int month,int day) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public BirthYAD(String name,int year,int month) {
		this.name = name;
		this.year = year;
		this.month = month;
	}
	public BirthYAD(String name,int year) {
		this.name = name;
		this.year = year;
	}
	public BirthYAD(String name) {
		this.name = name;
	}
	public BirthYAD(int year) {
		this.year = year;
	}
	public BirthYAD(int month,int day) {
		this.month = month;
		this.day = day;
	}
	void printBirthYAD() {
		System.out.println(name+"\t"+year+"\t"+month+"\t"+day);
	}
}//end BirthYAD
public class ClassTest06_1 {
	static Scanner sc = new Scanner(System.in);
	//����ϱ�
	static void printObj(BirthYAD []obj) {
		System.out.println("�̸�\t�⵵\t��\t��");
		for(int i = 0;i<obj.length;i++) {
			obj[i].printBirthYAD();
		}//end for(i)
	}//end printObj
	//�����ϱ�
	static void changeObj(BirthYAD []obj) {
		int inputNum = 0,changeYear = 0,changeMonth = 0,changeDay = 0;
		System.out.println("������ �����͸� �����Ͻðڽ��ϱ�?"); inputNum = sc.nextInt();
		System.out.println(obj[inputNum-1].name+"�� �����͸� �����մϴ�.");
		while(true) {
			System.out.print("Year�� �Է����ּ��� : "); changeYear = sc.nextInt(); 
			if(changeYear >= 1900 && changeYear <= 2020) {
				obj[inputNum-1].setYear(changeYear);
				break;
			}else {
				System.out.println("�⵵�� 1900~2020�� ���̷� �Է����ּ���.");
			}//end if
		}//end while
		while(true) {
			System.out.print("Month�� �Է����ּ��� : ");changeMonth = sc.nextInt(); 
			if(changeMonth >= 1 && changeMonth <= 12) {
				obj[inputNum-1].setMonth(changeMonth);
				break;
			}else {
				System.out.println("���� 1~12�� ���̷� �Է����ּ���.");
			}//endif
		}//end while
		while(true) {
			System.out.print("Day�� �Է����ּ��� : ");changeDay = sc.nextInt(); 
			if(changeDay >= 1 && changeDay <= 30) {
				obj[inputNum-1].setDay(changeDay);
				break;
			}else {
				System.out.println("���� 1~30�� ���̷� �Է����ּ���.");
			}//endif
		}//end while
	}//end changeObj
	static int showMenu(int select) {
		System.out.println("---�޴� ����---");
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("0. ����");
		System.out.print("�Է� : "); select = sc.nextInt();
		return select;
	}//end showMenu
	public static void main(String[] args) {
		BirthYAD[] obj = new BirthYAD[3];
		int select = -1;
		obj[0] = new BirthYAD("ȫ�浿",1945,5,2);
		obj[1] = new BirthYAD("�ڹ���",1995);
		obj[2]= new BirthYAD("�̼���");
		printObj(obj);		//�ʱⰪ ���
		while(select != 0) {
			select = showMenu(select);
			if(select == 0)break;		//0�� �� ����
			switch(select){
			case 1: printObj(obj); break;
			case 2: changeObj(obj); break;
			}//end switch
		}//end while
		System.out.println("�����մϴ�.");
	}//end main
}//end class

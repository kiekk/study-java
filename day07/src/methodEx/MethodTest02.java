package methodEx;

import java.util.Scanner;

public class MethodTest02 {
	int num;
	int num2;
	//private�� ���� Ŭ������ ��쿡�� ����� �����մϴ�.
	//�ٸ� Ŭ���������� ����� �Ұ����մϴ�.
	private int add() {										//���ϱ�
		return this.num + this.num2; 
	}
	private int sub() {										//����
		return this.num - this.num2; 
	}
	private double div() {									//������
		return (double)num / num2; 
	}
	private int mul() {										//���ϱ�
		return this.num * this.num2;
	}
	public void printCalcResult() {			//���� ���
		System.out.println("���� ��� : " + this.add());
		System.out.println("���� ��� : " + this.sub());
		System.out.println("������ ��� : "+ this.div());
		System.out.println("���� ��� : " + this.mul());
	}
	public static void main(String[] args) {
		//�ν��Ͻ� ���� num, num2 �� ���� �Է¹��� ��,
		//printCalc �޼��带 �̿��� ��Ģ���� ������� ����غ��ϴ�.
		//printCalc �޼��� ���ο����� ���� add()~mul()�� �̿��ؾ� �մϴ�.
		Scanner sc = new Scanner(System.in);
		for(;;) {
			MethodTest02 calc = new MethodTest02();
			System.out.println("-----���� ���α׷�-----");
			System.out.print("ù��° ������ �Է��ϼ��� : "); calc.num = sc.nextInt();
			System.out.print("�ι�° ������ �Է��ϼ��� : "); calc.num2 = sc.nextInt();
			int inputNum = 0;
			System.out.println("-----�޴�-----\n1.���ϱ�\n2.����\n3.������\n4.���ϱ�\n5.��ü����\n0.�����ϱ�"); inputNum = sc.nextInt();
			if(inputNum == 0)break;
			switch(inputNum) {
				//������ private�ϱ� ȣ���� �ȵ�����, ����Ŭ�����ϱ� �����ϹǷ�..�����ý��ϴ�.
				case 1: System.out.println(calc.add());break;
				case 2: System.out.println(calc.sub());break;
				case 3: System.out.println(calc.div());break;
				case 4: System.out.println(calc.mul());break;
				case 5: calc.printCalcResult(); break;
			}
			System.out.println();
		}//end for
	}//end main
}//end class
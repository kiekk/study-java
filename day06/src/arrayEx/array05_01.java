package arrayEx;

import java.util.Scanner;

/*
	����1)
	100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ�
	0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������ ����ϵ�,
	���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� ��  10, 9, 8, 4, 80, 40, 0   (0������ ����)
	��� ��  40 80 4, 8, 9, 10  	
 */
public class array05_01 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int []arNum = new int[100];	//���� 100���� ������ �迭
		 int count = 0;					//�Է��� ������ ������ ������ ����
		 
		 //�Է�
		 System.out.println("���ڸ� �Է����ּ���. 0�� ������ �Է��� ����˴ϴ�.");
		 for(int i = 0;i<100;i++) {
			 System.out.print("���� �Է� : "); arNum[i] = sc.nextInt();
			 if(arNum[i] == 0) 	{								//�Է°��� 0�̸� �ݺ� ����
				 System.out.println("�Է��� �����մϴ�.");
				 break;
			 }else				 								//0�� �ƴϸ� count�� 1�����ϰ� �ݺ� ����
				 count++;
		 }//end for
		 
		 //���
		 System.out.println("�Է��� ���ڸ� �������� ����մϴ�. ");		//count�� �̿�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}//end try
		 System.out.print("�Է��� ���� :");		 
		 for(int i = count-1; i >= 0;i--) {			//0�� �����ؾ� �ϱ� ������ count-1���� �����մϴ�.
			 System.out.print(" " + arNum[i]);
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//end try
		 }//end for
	}//end main
}//end class

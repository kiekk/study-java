package arrayEx;

import java.util.Random;

public class Array05_05_�鼺��2 {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		int[] arNum = new int[20];
		Random r = new Random();

		//30�̸��� ���� 20�� ����
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = r.nextInt(30);
		}//end for(i)
		//20���� ���� �������� ����
		for (int i = 0; i < arNum.length; i++) {
			for (int j = i + 1; j < arNum.length; j++) {
				if (arNum[i] > arNum[j]) {
					int temp = arNum[i];
					arNum[i] = arNum[j];
					arNum[j] = temp;
				}//end if
			}//end for(j)
		}//end for(i)
		
		int[] tempCnt = new int[20];

		for (int i = 0; i < arNum.length; i++) {
			for (int j = 0; j < arNum.length; j++) {
				if (arNum[i] == arNum[j]) {
					tempCnt[i] = ++cnt;
				}//end if
			}//end for(j)
			cnt = 0; 			//cnt �ʱ�ȭ
		} // i for
		//���� Ȯ��
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(arNum[i] + " ");
		}//end for(i)
		System.out.println();		//�ٹٲ�
			
		//1�����			i�� i�� ���� ���� ��
		//���� ���
//		for (int i = 1; i < arNum.length; i++) {
//			for(int j = i-1;j < i;j++) {
//				if(arNum[i] != arNum[j]) {
//					System.out.println(arNum[j] + " : " + tempCnt[j] + "��");
//				}//i, j�� ���� ���� ��� j�� ���
//				if(i == (arNum.length-1)){
//					System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
//				}//i�� ������ ��ȣ�� ��� ���
//			}//end for(j)
//		}//end for(i)
		
		//2�����		i�� i�� ���� ���� ��
		for (int i = 0; i < arNum.length-1; i++) {
			for(int j = i+1;j > i ;j--) {
				if(arNum[i] != arNum[j]) {
					System.out.println(arNum[i] + " : " + tempCnt[i] + "��");
				}//i, j�� ���� ���� ��� j�� ���
				if(j == (arNum.length-1)){
					System.out.println(arNum[j] + " : " + tempCnt[j] + "��");
				}//j�� ������ ��ȣ�� ��� ���
			}//end for(j)
		}//end for(i)
	}//end main
}//end class

package arrayEx;

public class array05_04 {
//	����4)
//	10�� ������ �迭���� �� �ڸ� ������ ������ ������ �Է� ���� �� 
//	�� ������ �Էµ� �ִ밪�� �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	����  100, 200, 300 ...  20�� �Է� �Ϸ�ƽ��ϴ�!
//	�ִ밪  756�Դϴ�.
//	�ּҰ�  121 �Դϴ�.

public static void main(String[] args) {
		int []arNum = new int[10];
		//���� �Է�
		System.out.print("�Էµ� ���� :");
		for(int i = 0;i<arNum.length;i++) {
			arNum[i] = (int)((Math.random()*999) + 1);
			for(int j = 0;j<i;j++) {
				if(arNum[i] == arNum[j]) i--;
			}//end for(j)
			System.out.print(" "+arNum[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}//end try
		}//end for(i)
		System.out.println();							//�ٹٲ�
		
		//�ִ밪, �ּҰ� ���ϱ�
		int max = 0, min = 0;
		max = arNum[0];
		min = arNum[0];
		for(int i = 1;i<arNum.length;i++) {
			if(max < arNum[i]) max = arNum[i];			//max�� ����
			if(min > arNum[i]) min = arNum[i];			//min�� ����
		}//end for(i)
		//�ִ밪, �ּҰ� ���
		String msg_Max = String.format("�ִ밪�� : %d�Դϴ�.", max);
		String msg_Min = String.format("�ּҰ��� : %d�Դϴ�.", min);
		System.out.println(msg_Max);
		System.out.println(msg_Min);		
	}//end main
}//end class

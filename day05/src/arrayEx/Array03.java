package arrayEx;
public class Array03 {

	public static void main(String[] args) {
		//���� �迭 5�� ����
		//1~10���� ���� 5���� �Է��� ���ϴ�.
		//�Է��� ������ ����� ���ϴ�.
//		int arNum[] = new int[5];						//���� 5���� �Է¹��� �迭 ����
//		for(int i = 0;i < arNum.length;i++) {			//�迭�� ���̸�ŭ �ݺ��ǰ� ���� ����
//			int randNum = (int)(Math.random()*10) +1;	//1~10������ ������ ������ ���� randNum ����
//			arNum[i] = randNum;							//arNum[i]�� ������ ������ ����
//			System.out.println(arNum[i]);				//������ ������ ���
//		}//end for(i)
		//����2) �����迭 6�� ���� 1~45���� ���� 6���� �־�ϴ�.
		//�Է��� ������ ����غ��ϴ�.
//		int arNum2[] = new int[6];
//		for(int i = 0;i< arNum2.length;i++) {
//			int randNum = (int)(Math.random()*45) +1;
//			arNum2[i] = randNum;
//			System.out.println(arNum2[i]);
//		}
		//����3) ����2���� �Է��� ������ ��ġ�� �ʰ� 6���� ������ �Է��� ���ϴ�.
		//�Է��� ������ ����� ���ϴ�.
//		//���� �Է�
//		int arNum4[] = new int[6];
//		for(int i = 0;i<arNum4.length;i++) {
//			arNum4[i] = (int)(Math.random()*45) +1;
//			for(int j = 0; j < i;j++) {			//��
//				if(arNum4[i] == arNum4[j])		//��
//					i--;						//��
//			}//end for(j)
//		}//end for(i)
//		for(int i = 0;i< arNum3.length-1;i++) {
//			for(int j = 1;j<i+1;j++) {
//				if(arNum3[i] == arNum3[j]){
//					int randNum = (int)(Math.random()*45) +1;
//					if(arNum3[i] != randNum) { 
//						arNum3[j] = randNum;
//					}
//					else j--;
//				}//end if
//			}//end for(j)
//		}//end for(i)
//		for(int i = 0;i< arNum3.length;i++) {
//			System.out.println("arNum["+i+"] : "+arNum3[i]);
//		}
//		int arNum3[] = new int[6];
//		for(int i = 0;i<arNum3.length;i++) {
//			arNum3[i] = (int)(Math.random()*45) +1;
//			for(int j = 0;j<i;j++) {
//				if(arNum3[i] == arNum3[j])
//					i--;
//			}
//		}
//		for(int i = 0;i<arNum3.length;i++) {
//			System.out.println(arNum3[i]);
//		}
		//����4) ����3���� �Է��� ������ ������������ ����� ���ϴ�.
//		
		//���� �Է�
		int arNum4[] = new int[6];
		for(int i = 0;i<arNum4.length;i++) {
			arNum4[i] = (int)(Math.random()*45) +1;
			for(int j = 0; j < i;j++) {			//��
				if(arNum4[i] == arNum4[j])		//��
					i--;						//��
			}//end for(j)
		}//end for(i)
		//���� ����
		for(int i = 0;i < arNum4.length;i++) {
			for(int j = i+1; j < arNum4.length;j++) {
				if(arNum4[i] > arNum4[j]) {
					int temp;
					temp = arNum4[j];
					arNum4[j] = arNum4[i];
					arNum4[i] = temp;
				}//end if
			}//end for(j)
		}//end for(i)
		//���� ���
		for(int i = 0;i< arNum4.length;i++) {
			System.out.println(arNum4[i]);
		}//end for(i)
		
		
		//���� 4-1) ���������� ������� �������� �����غ��ϴ�.
		//�ӽ� �迭�� ���� �����͸� ������ ������ �����ͷ� �����غ��ϴ�.
		int []temp = new int[arNum4.length];
	}//end main
}//end class

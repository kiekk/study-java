package arrayEx;

public class array05_05 {
//	����5)
//	100 �̸��� ���� �������� ������ �־�����. 
//	������ �迭 20���� �Է¹��� ��,
//	�Է¹��� ������ ���� ����� ����ؾ� �Ѵ�.
//	�̶�, ���� ������ ��� ��ġ���� ����ؾ� �Ѵ�.
//	��, ī��Ʈ�� 0���� ���ڴ� ������� �ʴ´�.
//
//	1  5��
//	2  6��
//	45  1��
//	67  4��
//	99  1��
public static void main(String[] args) {
		 int []arNum = new int[20];
		 
		 //���� 20�� �Է¹ޱ�
		 for(int i = 0;i<arNum.length;i++) {
			 arNum[i] = (int)(Math.random()*10) + 1;
		 }//end for(i)
		 System.out.print("���� : ");
		 for(int i = 0;i<arNum.length;i++) {
			 System.out.print(arNum[i]+" ");
		 }
		 System.out.println();
		 //�ߺ��Ǵ� ������ ���� ���
		 for(int i = 0;i<99;i++) {
			 int count = 0;													//�ݺ������ count�ʱ�ȭ
			 for(int j = 0;j<arNum.length;j++) {
				 if(i == arNum[j])  count++;								//�������̸� count 1����
			 }//end for(j)
			 if(count >= 1) System.out.println(i+" : "+ count + "��");		//count�� 1�̻��� ���� ���
		 }//end for(i);
	}//end main
}//end class

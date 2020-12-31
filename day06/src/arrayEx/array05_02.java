package arrayEx;
/*
	����2)
	10���� ������ ������ �Է¹޾� �迭�� ������ �� 
	¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� 
	����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.
	
	String.format(���Ĺ���, ��)
	
	����� ��   99, 45, 34, 67, ...  10���Է�
	¦�� �ε��� ��  0, 2, 4, 6, 8��° ��
	(99+34+...n)  ���� = 56.789  56.7
	Ȧ�� �ε��� ��  1, 3, 5, 7, 9
	(45+67+...)  ���� = 5.6777   5.6 	
 */
public class array05_02 {
	public static void main(String[] args) {
		int []arNum = new int[10];
		
		//10���� �ߺ����� �ʴ� ���� �Է�
		for(int i = 0;i<arNum.length;i++) {
			arNum[i] = (int) ((Math.random()*99) +1);
			for(int j = 0;j<i;j++) {
				if(arNum[i] == arNum[j]) {
					i--;
					break;
				}
			}//end for(j)
		}//end for(i)
		
		//������ 10���� ���� �� ���
		System.out.print("������ 10���� ���� �� :");
		for(int i = 0;i<arNum.length;i++) {
			System.out.print(" "+arNum[i]);
		}
		System.out.println(); System.out.println();				//�ٹٲ�
		
		//¦�� �ε��� �� ����, ���
		int sum_Even = 0,sum_Odd = 0,cnt_Even = 0,cnt_Odd = 0;
		System.out.print("¦�� �ε����� ��      :");
		for(int i = 0;i<arNum.length;i++) {
			if(i % 2 == 0) {
				sum_Even += arNum[i];
				cnt_Even++;
				System.out.print(" "+arNum[i]+"   ");
			}//end if
		}//end for(i)
		//Ȧ�� �ε��� �� ����, ���
		System.out.println();									//�ٹٲ�
		System.out.print("Ȧ�� �ε����� ��      :");
		for(int i = 0;i<arNum.length;i++) {
			if(i % 2 == 1) {
				sum_Odd += arNum[i];
				cnt_Odd++;
				System.out.print("    " + arNum[i]);
			}//end if
		}//end for(i)
		System.out.println(); System.out.println();				//�ٹٲ�
		double avg_Even = (double)sum_Even/cnt_Even;			//¦�� �ε����� ���
		double avg_Odd = (double)sum_Odd/cnt_Odd;				//Ȧ�� �ε����� ���
		
		//String.format�� ����غ���, printf�� ���
		String msg_Even = String.format("¦�� �ε����� ���� : %d��, ��� : %.1f", cnt_Even, avg_Even );
		System.out.println(msg_Even);			
		String msg_Odd = String.format("Ȧ�� �ε����� ���� : %d��, ��� : %.1f", cnt_Odd, avg_Odd );
		System.out.println(msg_Odd);
//		System.out.println("¦�� �ε����� ��� : "+avg_Even);		//������ ���
//		System.out.println("Ȧ�� �ε����� ��� : "+avg_Odd);
	}//end main
}//end class

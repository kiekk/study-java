package foreachEx;
/*
 	���� for��(foreach��) - �÷��ǿ����� ��� �����մϴ�.
 	
 */
public class ForEachTest2 {

	public static void main(String[] args) {
		int[][] arScore = {
				{10, 20, 30, 40},	//1��
				{50, 60, 70, 80},	//2��
				{51, 61, 71, 71},	//3��
		};
		//��ȣ, �� ����, ����
		int i = 0,sum = 0;
		System.out.println("��ȣ\t����\t����\t����\t����\t����");
		for(int[] a : arScore) {	
			System.out.print((++i)+"��");
			for(int b : a) {		
				System.out.print("\t"+b+"�� ");
				sum += b;
			}//for int
			System.out.println("\t"+sum+"��");
			sum = 0;
		}//for int[]
		//2���� �迭�� �κп�Ҵ� 1���� �迭
		//1���� �迭�� �κп�Ҵ� int�Դϴ�.
		//���� for���� 2�� ����Ͽ� int��ҿ� �����ؾ� �մϴ�.
	}

}

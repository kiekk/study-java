package randomEx;

import java.util.Random;

/*
 	���� �����
 	1) Random Ŭ����
 		nextInt(������) : �ν��Ͻ� �޼���
 		
 		��ü rand �� ����ϴ�.
 		
 	2) ������  ������ �ֱ�
 		�������� �׻� 0���� �����մϴ�.
 		10 : 0~9 ���� 10��
 		 8 : 0~7 ����  8��
 		 
 */
public class Random01 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			//0~9���� 10���߿� ���� �ϳ��� ����մϴ�.
			int randNum = rand.nextInt(10);
			System.out.println(randNum);
		} 
		
		//0~9���� ���� �ϳ� ����ϱ�
		System.out.println(new Random().nextInt(10));
		//	System.out.println(rand.nextInt(10));
		
		System.out.println("1 ~ 100���� ���� ���");
		for (int i = 0; i < 50; i++) {
			//���� ��������
			int randNum = rand.nextInt(100) + 1; //1���Ͷ�� ��, ���� 0~99������, 0~99���� + 1�ϹǷ� 1~100�� ���������� ����Ǿ����ϴ�.
			System.out.println(randNum);
		}
		
		
		
	}//end main
}//end class

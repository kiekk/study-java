package testEx;

import javax.swing.JOptionPane;

public class Test01_4 {

	public static void main(String[] args) {
		//��4) 1~100���� �� 3�� 5�� ����� (��, 15, 30, 45, 60...)�� ���
		//	����: ���ǽ��� 2���� ����� ��, continue�� ����� ��
//		for(int i = 1;i<101;i++) {
//			if(i % 3 == 0 && i % 5 == 0) 
//				System.out.println("3�� 5�� ����� : "+ i);
//			else
//				continue;
//		}
		for(int i = 1;i<101;i++) {
			if(i % 3 == 0){
				if(i % 5 == 0) {
					System.out.println("3�� 5�� ����� : "+ i);
				}else
					continue;
			}else 
				continue;
		}//end for
	}

}

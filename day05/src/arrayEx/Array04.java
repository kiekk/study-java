package arrayEx;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		//��5) ���� 4�ڸ��� �Է¹޽��ϴ�.
		//	�ѱ۷� �����غ��ϴ�.
		//	1024 -> �ϰ��̻�
		// ��й�ȣ 4 ���� -> �ѱ۷� Ǯ��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		//1�����
//		String[] arName = {"��","��","��","��","��","��","��","ĥ","��","��"};
//		String changeNum = "";
//		System.out.print("���� �Է� : "); String inputNum = sc.next();
//		for(int i = 0;i<inputNum.length();i++) {
//			//System.out.println(arName[(int)(inputNum.charAt(i))]);
//			int index = (inputNum.charAt(i)) - 48;			//inputNum���� �Է¹��� ���ڿ��� ���ڷ� ġȯ,
//															//inputNum.charAt(i) char���̹Ƿ� -48�� �����, �ڵ�����ȯ���� ���� ����
//			changeNum += arName[index];
//		}
//		System.out.println(changeNum);
		
		//2�����
		String arName = "�����̻�����ĥ�ȱ�";    
		String changeNum = "";
		System.out.print("���� �Է� : "); String inputNum = sc.next();
		for(int i = 0;i<inputNum.length();i++) {
			int index = (inputNum.charAt(i)) - 48;
			changeNum += arName.charAt(index);
		}
		System.out.println(changeNum);
		sc.close();
	}//end main
}//end class

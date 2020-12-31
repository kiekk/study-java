package methodEx;

import java.util.Scanner;
/*
 	call by value (�� ����)
 	
 	fct(10,20) <-- �⺻���� �����ϴ� ��
 	
 	call by reference (������ ����)
 	
 	fct(��ü or �ν��Ͻ�) <-- �������� �����ϴ� ��
 	fct(obj)
 	fct(arr)	������ ��ü or �ν��Ͻ��� ���� ���ÿ� ����˴ϴ�.
 	
 */
public class MethodTest04 {
	static Scanner sc = new Scanner(System.in);
	/**
	 * �������� ���� �߿��� �ִ밪�� �ּҰ��� ���ϴ� �޼��� �Դϴ�.
	 * @param arRand �迭�� �� �������� �����ϴ�.
	 * @param maxMin �ּҰ��� �ִ밪�� ������� ���� �迭�� �����ϴ�.
	 */
	
	//return�̳� (������) ���̵�, Ÿ �޼����� ������� �����ų �� �ֽ��ϴ�.
	//call by reference
	void getMax_minNumber(int []arRand,int []maxMin){
		maxMin[0] = arRand[0];											//�ִ밪
		maxMin[1] = arRand[0];											//�ּҰ�
		for(int i = 1;i<arRand.length;i++) {
			if(maxMin[0] < arRand[i]) maxMin[0] = arRand[i];			//�ִ밪 ����
			if(maxMin[1] > arRand[i]) maxMin[1] = arRand[i];			//�ּҰ� ����
		}//end for(i)
	}//end getMax_minNumber
	
	String changeLowerToUpper(String word) {
		String result = "";
		//�빮�� �����ϴ� �˰���
		for(int i = 0;i<word.length();i++) {						
				if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
				result += (char)(word.charAt(i) - 32);
				else
				result += word.charAt(i);
		}//end for(i)
		return result;
	}
	public static void main(String[] args) {
		int []maxMin= {0,0};
		int []arRand = {2,3,4,2,3,4,2,3,46,7,8,9,2};
		MethodTest04 max_min = new MethodTest04();
		max_min.getMax_minNumber(arRand,maxMin);	//������, �ִ밪�� �ּҰ��� ������ �� �ִ� �迭
		//�ִ�, �ּҰ� ���
		System.out.println("�ִ밪 : "+maxMin[0]);
		System.out.println("�ּҰ� : "+maxMin[1]);
		
		System.out.printf("\n\n\n\n\n\n\n\n");
		System.out.print("����ܾ �Է��� �ּ��� : "); String word = sc.next();
		System.out.println("���� �� : " + word); 							//���� ��
		String changeAlpha = new MethodTest04().changeLowerToUpper(word);	//�빮�� ����
		System.out.println("���� �� : " + changeAlpha);						//���� ��
		//
	}//end main	
}//end class

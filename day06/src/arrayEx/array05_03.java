package arrayEx;

import java.util.Scanner;

public class array05_03 {
//	����3)
//	������ �̸����� �ʱ�ȭ �� ���ڹ迭�� �����!
//	��) honggildong = {'h' 'o' 'n' 'g' ....  'd', 'o', 'n', 'g'} ���� �ʱ�ȭ
//	���� �� ���� �Է¹޾� �迭������ ��ġ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	ù ��° ��ġ�� 0���̸� �迭�� ���� ���ڰ� �ԷµǸ� none ��� 
//	�޽����� ����ϰ� ������ �մϴ�.
//	ã�� ����  o
//	���� ��ġ  2��°, 9��°
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char []Myname = {'y','o','o','n','s','o','o','n','h','o'};
		char inputAlpha = ' ';
		int count = 0;
		System.out.print("ã�� ���ڸ� �Է��ϼ��� : "); inputAlpha = sc.next().charAt(0);
		System.out.println("ã�� ���� : " + inputAlpha);
		for(int i = 0;i<Myname.length;i++) {
			if(inputAlpha == Myname[i]) {
				System.out.print((i+1)+"��° ");
			}else {
				count++;
			}
		}//end for(i)
		if(count == Myname.length) System.out.println("NONE");
	}//end main
}//end class

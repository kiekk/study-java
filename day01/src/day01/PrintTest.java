package day01;
/*
 	��¹�
 	 
 	System.out.printf("%d %s %c\n",����1, ����2, ����3);
	f : format
 	System.out.print(1+2)	->���
 	System.out.print("")	->���ڿ�
 	System.out.print(' ')	->����
 	System.out.print(1.2)	->�Ǽ�
 	System.out.print(����)	->����
 	System.out.print(" " + ������) -> ���� ���ڿ��� �νĵ˴ϴ�.
 					���ڿ� + ������ -> +�� �ǹ̴� '����', �յڸ� ���Դϴ�. ��������� X
 					print(10+20/3) -> 16  ->����
 					print("10"+20/3-> 106 ->���ڿ�
  	�ٹٲ�X
 	System.out.println() == print("\n")     ln -> line skip ������ �ǹ̸� �����ϴ�.
 	�ٹٲ�O
 */
public class PrintTest {
	
	public static void main(String[] args) {
		int myAge = 10;
		int jjakAge = 15;
		int sum = myAge + jjakAge;
		System.out.println("�� ���̴� " + myAge + "�� �̰�, ¦ ���̴� " + jjakAge + "�� �Դϴ�. ���� ���̴� "+ sum +"�� �Դϴ�.");
		
		//System.out.print()	<--���ϸ� �����ö�
		//System.out.printf()	<--�Ǽ��� ó���� ��, ==>string.format()
		//System.out.println()	<--�Ϲ������� ���� ���� ����մϴ�.
		
		//����Ű �ϼ� ctrl + space syso���� �Է��� ctrl+space�� ������ �ڵ� �ϼ�
		
		//�ҽ� �̵� alt + ����Ű(��,�Ʒ�)
		
		//�ҽ� ���� ctrl + alt ����Ű(��, �Ʒ�)
		//���� �׷����������� ����Ű�� ��ĥ�� ������, ����
	}

}

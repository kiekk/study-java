package inputEx;

import java.util.Scanner;

/*
 	�Է¹ޱ� ����
 	1) ������� : ���� 4�� �̻� ����� ����ϱ�
 	2) TV : ���� 3�� �̻� ����� ����ϱ�
 	3) ��� ���� : ���� 3�� �̻� ����� ����ϱ�
 */
public class inputTest01_4_Practice {

	public static void main(String[] args) {
		//��ĳ�� Ȱ�� -> ��ü = �ν��Ͻ�
		Scanner sc = new Scanner(System.in);
		System.out.println("3. ��Ÿ�� �׸���");
		//���� ����
		String type_Face = "";			//����
		String type_Eye = "";			//������ ����
		String type_Nose = "";			//��
		int choice = 0;
		System.out.println("������ ���� �������ּ���.");
		System.out.println("���� : ������ ��� ������ϱ�?");
		System.out.println("1.�ձ���   2.�簢��   3.�� ����   4.ª�� ���� ");
		choice = sc.nextInt();
		if(choice == 1) { type_Face = "�ձ���";
		}else if(choice == 2) {	type_Face = "�簢��";
		}else if(choice == 3) { type_Face = "�� ����";
		}else if(choice == 4) { type_Face = "ª�� ����";}
		
		System.out.println("�� : ������ " + type_Face +"�̾����.");
		System.out.println("���� : ���� ��� ������ϱ�?");
		System.out.println("1.�ֲ�Ǯ�� �ִ�    2.�ֲ�Ǯ�� ����");
		choice = sc.nextInt();
		if(choice == 1) { type_Eye = "�ֲ�Ǯ�� �ִ�";
		}else if(choice == 2) {type_Eye = "�ֲ�Ǯ�� ����";}
		System.out.println("�� : " + type_Eye +" ������ �����.");
		
		System.out.println("���� : �ڴ� ��� ������ϱ�?");
		System.out.println("1. ��â��  2. ���ֺ�  3. ���� ��� 4. ���� ���");
		choice = sc.nextInt();
		if(choice == 1) { type_Nose = "��â��";
		}else if(choice == 2) {type_Nose = "���ֺ�";
		}else if(choice == 3) {type_Nose = "���� ���";
		}else if(choice == 4) {type_Nose = "���� ���";}
		System.out.println("�� : " + type_Eye +" ������ ���ƿ�.");
		
		System.out.println("-------------���� ��Ÿ��-------------");
		System.out.println("���� " +type_Face+"�̰�, "+type_Eye+" ���� ��������, "+type_Nose+"�� ���� ����� �����Դϴ�.");


	}

}

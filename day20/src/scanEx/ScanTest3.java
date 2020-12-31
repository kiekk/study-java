package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 	Scanner�� File �Է�(�б�) ���
 	
 	- Scanner Ŭ������ �̿��� Ű����κ��� �� �Է¹޾ƿ���
 	- Scanner Ŭ������ �̿��� Ư�� ���(path)�� ���� �� �Է¹޾ƿ���
 	  Ư����� : C:\\date\\date.txt
 	  �� ��θ� ������ ��η� �б� ����
 	  File �̶�� �ڹ� Ŭ������ �ʿ��մϴ�.
 	  
 	- Scanner�� 1.5 ���� ���ĺ��� ����� �Խ��ϴ�.
 	1.5���� �������� BufferReader ���� �̿��߾����ϴ�.
 	
 	-������, �ֱٿ��� Reader/Writer Ŭ������ ���� �ִ� io ��Ű�� Ŭ������ ���� ����մϴ�.
 	
 */
public class ScanTest3 {

	public static void main(String[] args) {
		String path = "C:\\Users\\dbstn\\Desktop\\�ڸ���IT��ī����\\������\\java\\day20\\src\\scanEx\\data3.txt";
			//���͸� : ����̺�+����+����
		//��� ��� : "���� ���� ������ ��ġ�� �������� ����ϴ� ��"
		path = "src\\scanEx\\data3.txt";
		File file = new File(path);
		int sum = 0, cnt = 0;
		try {
			Scanner sc = new Scanner(file);
//			sc.next();
//			Integer.parstInt(sc.next());	�⺻������ ���ڿ��� ����Ǿ� �ֱ� ������ ���������� ������ ��� parse������մϴ�.
//			sc.nextInt(); 					//������ nextInt()�޼���� "100"�� ���� 100���� parse�ؼ� �����մϴ�.
//			sc.hasNextInt()					//���� ��Ұ� int(����)���̸� ��������(true),�ƴϸ� false�� �����մϴ�.
			while(sc.hasNextInt()) {
				int tmp = sc.nextInt();
				sum += tmp;
				cnt++;
				System.out.println(tmp +"��");
			}
			System.out.println("���� : "+sum);
			System.out.println("��� : "+(double)sum/cnt);
		} catch(FileNotFoundException e) {
			System.out.println("�ش� ��ġ�� ������ ����� : "+e.getMessage());
		}
	}
}
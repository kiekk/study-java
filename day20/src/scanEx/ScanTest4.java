package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 	Scanner�� File �Է�(�б�) ���

	Scanner���� useDelimiter("������,���б�ȣ") = StringŬ������split(",")�� ����մϴ�.
			������ ������ �����͸� �߶��ݴϴ�.

 */
public class ScanTest4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data4.txt"));
		int sum = 0, totalSum = 0,cnt = 0, totalCnt = 0;
		while(sc.hasNext()) {
			String line = sc.nextLine();
//			System.out.println(line);
			Scanner scLine = new Scanner(line).useDelimiter(",");

			while(scLine.hasNextInt()) {
				sum += scLine.nextInt();
				cnt++;
			}
			totalSum += sum;
			totalCnt += cnt;
			System.out.println(line +" : "+sum);
			System.out.println("��� : "+sum/cnt);
			sum = 0;
			cnt = 0;
		}		System.out.println("�� ���� : "+ totalSum);
		System.out.println("�� ��� : "+ (double)totalSum/totalCnt);
		
		sc.close();
	}
}
package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 	Scanner�� File �Է�(�б�) ���

	Scanner���� useDelimiter("������,���б�ȣ") = StringŬ������split(",")�� ����մϴ�.
			������ ������ �����͸� �߶��ݴϴ�.
	�ܺ� ���Ͽ� �����Ͱ� 5���� �ֽ��ϴ�.
	���پ� �о�� ������,
	  ��ȣ 	   �̸�	   ����		 ����		����
	nextInt(),next(),nextInt(),nextInt(),nextInt()
	   1	  ȫ�浿    90        89        88
 */
public class ScanTest5 {

	public static void main(String[] args) throws FileNotFoundException {
		//main���� file scan �մϴ�.
		Scanner sc = new Scanner(new File("data5.txt"));
		ScoreControl scCont = new ScoreControl();
		while(sc.hasNext()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			while(sc2.hasNext()) {
				scCont.add(sc2.nextInt(),sc2.next(),sc2.nextInt(),sc2.nextInt(),sc2.nextInt());
			}
		}
		scCont.outputScoreList();
	}
}
package ioEx;

import java.io.File;

/*
 	File Ŭ����
 		- ������
 		- ���� �޼���
 		- 
 */
public class FileTest2 {

	public static void main(String[] args) {
		//C:\Program Files\Java\jdk1.8.0_201
		int cnt1 = 0, cnt2 = 0;
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_201");
		
		//file.list()  : �� �޼��忡 ���ؼ� ���� Ÿ���� Ȯ���� ���ϴ�.
		String[] tmp = file.list();
		
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}//end for(i)
		System.out.println();
		//file.listFiles();
		File[] tmp2 = file.listFiles();
		for (int i = 0; i < tmp2.length; i++) {
			if(tmp2[i].isFile()) {			//�������� Ȯ��		tmp2[i].isDirectory();	//�������� Ȯ��
				System.out.println(tmp2[i].getName() +"�� �����Դϴ�.");
				cnt1++;
			}//end if
			if(tmp2[i].isDirectory()) {
				System.out.println(tmp2[i].getName() +"�� �����Դϴ�.");
				cnt2++;
			}//end if
		}//end for(i)
		System.out.println("���� ���� : "+cnt1+"��");
		System.out.println("���� ���� : "+cnt2+"��");
	}//end main
}//end class

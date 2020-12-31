package ioEx3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
/*
 	java �޸��� java_day01.txt
 	D:\GB_0900_05_ysh\java_language\java_memo  �������� ����

 	1. �ش� ������ ���ϵ��� �� �����ݴϴ�.
 	2. �о�� ���ϸ��� �Է��մϴ�.
 	3. �ֿܼ� ������ ������ ����մϴ�.
 	4. ������ ���� ���ϸ���_cpy ���� ���Դϴ�.
 		java_day01_cpy.txt

 */
public class BufferedOutputStreamTest2 {

	public static void main(String[] args) {
		String path = "D:\\GB_0900_05_ysh\\java_language\\java_memo";
		File file = new File(path);
		File[] files = file.listFiles();
		
		System.out.println("���� ����Ʈ ���");
		for (File a : files) {
			System.out.println(a.getName());
		} 
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		try {
			String showPath = "";
			int select = 0;
			System.out.println("����� ������ ��¥�� �Է��ϼ���.(ex : 01,02...11,12)"); showPath = sc.next();
			System.out.println("java_day"+showPath+".txt�� ���� ���");
			System.out.println();
			String path2 = path+"\\java_day"+showPath+".txt";
			fis = new FileInputStream(path2);
			bis = new BufferedInputStream(fis);
			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String ar_read = new String(_read);
			System.out.println(ar_read);
			System.out.println();
			System.out.println("�����Ͻðڽ��ϱ�?\n1.��\t2.�ƴϿ�"); select = sc.nextInt();
			int index = file.getName().indexOf('.');
			if(select == 1) {
				fos = new FileOutputStream( path+"\\java_day"+showPath+"_cpy.txt",true);
				System.out.println(showPath+"_cpy.txt ������ �����߽��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

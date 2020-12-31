package ioEx;

import java.io.File;
import java.io.IOException;

/*
 	File Ŭ����
 		- ������
 		- ���� �޼���
 		- 
 */
public class FileTest3 {

	public static void main(String[] args) {
		//D:\GB_0900_05_ysh\java_language\java_memo\java_day22.txt
		String path = "D:\\GB_0900_05_ysh\\java_language\\java_memo\\java_day22_1.txt";
		File file = new File(path);
		
		try {
			//������ �����ϴ� �޼���,
			//������ ������ ������ ������ �������� �ʽ��ϴ�.
			//try-catch IOException�� �ʿ��մϴ�.
			System.out.println(file.createNewFile()?"��������":"�������� �ʾ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//path���� ������ ��ü�ϰ� ������ü�ϰ� �и��ϰ� �ʹ�.
		//java_day22_1.txt �� �� ������������ ���� ����մϴ�.
		
//		System.out.println(path.substring(0, path.lastIndexOf("\\")));
//		System.out.println(path.substring(path.lastIndexOf("\\")+1));
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
		
		System.out.println(file.getName());
		String fullPath = file.getAbsolutePath();
		System.out.println(fullPath);
		int pos = fullPath.lastIndexOf("\\");
		String parentPath = fullPath.substring(0, pos);
		System.out.println(parentPath);
		String fileName = fullPath.substring(pos+1);
		System.out.println(fileName);
		
		//���� ���ڿ� �������� ���ο� File �ý����� ���� �� �ֽ��ϴ�.
		
		//���ϸ��� Ȯ�����ϰ� ���ϸ��ϰ� �и��غ��ϴ�.
		pos = fileName.lastIndexOf(".");
		String fName = fileName.substring(0,pos);
		System.out.println(fName);
		String ext = fileName.substring(pos+1);
		System.out.println(ext);
		
		//�ü������ ���͸�/���� �� ������ �� ���� ���ڵ��� �ٸ��ϴ�.
		//�׷��� �ش� �ü���� ���б�ȣ�� �����ݴϴ�.
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		System.out.println(file.delete()); //java_day22_1�� �����˴ϴ�. ������ ���� ��� false
		System.out.println(file.getAbsolutePath());
	}//end main
}//end class

package ioEx;

import java.io.File;

/*
 	File Ŭ����
 		- ������
 		- ���� �޼���
 		- 
 */
public class FileTest {

	public static void main(String[] args) {
		String path = "C:\\";
		path = "D:\\GB_0900_05_ysh\\java_language\\java_memo\\java_day22.txt";
		File f = new File(path);
		if(f.exists()) {		//������ ��ΰ� �����Ѵٸ�,
			System.out.println(f.exists());
			System.out.println(f.isDirectory());		//������?
			System.out.println(f.isFile());				//�����̴�?	
			System.out.println(f.getPath());
			System.out.println(f.getName());			//�ش� ����� ������ ��ġ �̸��� �����ɴϴ�.
			System.out.println(f.getAbsolutePath()); 	//�ش� ����� ��ü ��ġ �̸��� �����ɴϴ�.
		}else {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0);		//�� ���α׷��� �޸𸮿��� ���� ����
		}
	}

}

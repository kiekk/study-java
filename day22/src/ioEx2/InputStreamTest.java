package ioEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	byte ��Ʈ�� : 1byte ������ ������� �� �� �ִ� ��Ʈ��
 			- ������, �̹���, ����, �Ϲ� text ��....
 	char ��Ʈ�� : ���ڿ� Ưȭ�Ǿ� �ִ� ��Ʈ��
 			- �������� �� ����մϴ�.
 			
 	��Ʈ�� : InputStream , OutputStream
 			   read			   write
 			ram���� read    HDD�� write
 			read()			write()
 			read(byte[])
 			available() : return Ÿ���� int (���� �� �ִ� ���� byte���� ���������� ��ȯ�մϴ�)
 			close()     : stream�� �������� �ݾƾ� �մϴ�. (Scanner�� ���)
 			
 			System.in   <--   byte input stream�� ��ǥ���� ��
 			
 	FileInputStream �ش� ���丮�� �ִ� ��� ������ ���� �� �ֵ��� �ϴ� Ŭ�����Դϴ�.
 					������ ���� ��, FileŬ������ ��θ� �����մϴ�.
 					�ش� ������ ���� ��� ���ܰ� �߻�(FileNotFoundException)
 			   
 */
public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream("fileRead.txt");
//			System.out.println((char)fis.read());
			int tmp = 0;
			while((tmp=fis.read()) != -1) {
				System.out.print((char)tmp);
			}
		} catch (FileNotFoundException e) {	//������ ��ġ�� ������ ����ó���� �ѱ�ϴ�.
			e.printStackTrace();
		} catch (IOException e) {	//���̻� ���� �����Ͱ� ���� ��, ������ �����մϴ�.
			e.printStackTrace();
		} finally {
			try {if(fis != null) {fis.close();}} catch (IOException e) {e.printStackTrace();}
		}
		System.out.println("\n���α׷� ����");
	}

}

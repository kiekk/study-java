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
public class InputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//�о�� ���� ���� �߿�, �ѱ��� ���� �ֽ��ϴ�.
			fis = new FileInputStream("fileRead2.txt");
			/*
			�񿵾�� ���ڰ� ���� ���� ���� 2byte ü���
			�Ǿ� �־�, (char) ������ ���� ��, ���ڰ� ������ �˴ϴ�.
			����, read�� �� �� byte[]�� �̸� ��������
			�� �迭�� ��ƴ޶�� ��Ű�� �˴ϴ�.
			���� �� byte[]�� ���ڿ��� �����ؼ� ������ ������ �ʰ� ó���� �� �ְ� �˴ϴ�.
//			System.out.println((char)fis.read());
			int tmp = 0;
			while((tmp=fis.read()) != -1) {
				System.out.print((char)tmp);
			}
			*/
			
			//read�ؿ� �����͸� ���� byte[]�� �����غ��ϴ�.
			//�׷��� � ������ ���� �� �� �����ϴ�.
			//���Ͽ� ���� �ִ� ���� ������ŭ ũ�⸦ �����ؾ� �մϴ�.
			byte[] _read = new byte[fis.available()];
			fis.read(_read);	//_read �迭�� �о�� byte�� ��� �˴ϴ�.
			
			//�� byte[]�� String �����ڿ��� �ָ� ���ڿ��� ������ �ݴϴ�.
			String ar_read = new String(_read);
			System.out.println(ar_read);
//			for(int i = 0;i<ar_read.length();i++) {
//				System.out.print(ar_read.charAt(i));
//			}
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

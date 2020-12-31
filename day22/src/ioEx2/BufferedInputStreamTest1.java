package ioEx2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 	FileInputStream : �������� ����ҿ��� ���� read()�� �����մϴ�.
 	
 	Buffer : ������ �޸� - �ӽ� �����
 			 �������� ����ҿ��� �о�� �����͸� Buffer��� �ӽ� ����ҿ� �ΰ�,
 			 �޸𸮿��� �����͸� �о�ɴϴ�.
 			 
 		HDD -> ������ ��ġ(����) -> RAM(��������ġ) ���۵Ǵϱ� �� �����ϴ�.
 	��� 
 		FileInputStream fis = ��ü����;
 		BufferedInputStream bis = new BufferedInputStream(fis);
 		
 		bis.read();
 */
public class BufferedInputStreamTest1 {

	public static void main(String[] args) {	
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("fileRead3.txt");
			bis = new BufferedInputStream(fis);
			byte[] _read = new byte[bis.available()];	//byte�� b�� �ҹ���
			bis.read(_read);							//������ byte�迭�� bis�� ����
			String ar_read = new String(_read);			//������ _read�� ���ڿ��� ��ȯ
			System.out.println(ar_read);				//��ȯ�� ���ڿ��� ���
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		

	}

}

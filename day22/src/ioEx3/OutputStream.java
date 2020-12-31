package ioEx3;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 	OutputStream
 	�޸�(RAM)�� �ִ� ������ �ܺ� �����(HDD)�� "���� write()" �մϴ�.

 	�⺻������ ����Ϳ� ����� �� �ִ� ��Ʈ���� 2���� �ֽ��ϴ�. System.out / System.err
 			"����"�� ����� ���ϴ�.
 		write(����ڵ�)	write(int) int���� byte�� ��ȯ�ؼ� ���ü(����)�� ���� �˴ϴ�.
 		write(byte[])
 		flush()				����� ��, ���۰� ���� ���� �Ǹ� �Ѳ����� ���� �˴ϴ�.
 							�׷���, flush()�޼��带 ������ �Ǹ� ���۰� ���� ���� �ʾƵ�
 							�ٷ� ��� ���Ͽ� �����͸� write()�ϰ� �˴ϴ�.
 		close()

 		FileOutputStream
 */
public class OutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//�ش� ��ġ�� ������ ���� ���� ������ �����մϴ�.
			fos = new FileOutputStream("fileWrite.txt");
			//�ι�° �Ű����� append : ������ ������ ������ ��� �̾�� �մϴ�.
			//fos = new FileOutputStream("fileWrite.txt",true);
			String msg = "Hello, ��ſ� �Ϸ�!!";
			fos.write(msg.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {fos.close();} catch (IOException e) {e.printStackTrace();}
		}

	}

}

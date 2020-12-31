package ioEx3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("fileWrite2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); // ����ũ�Ⱑ 5�� �˴ϴ�.
			//�ѹ��� ���� �� �ִ� ũ��� 5�� �����͸� ���ۿ� �ӹ��ٰ�
			//5���� �� ���� �Ǹ� �ڵ����� ���Ϸ� ���۵˴ϴ�.
			//'1'~'9'���� �ϳ��� write�� �Ϸ��� �մϴ�.
			//'1'~'5'���� ���ۿ� ���� ���� �Ǹ� ���Ϸ� ������ �˴ϴ�.
			//'6'~'9'������ ���ۿ� �����ְ� �˴ϴ�.
//			bos.write('1');  //���� 1�� �Է��ϰ� �ʹٸ� �ƽ�Ű�ڵ� 49�� �Է��ص� �˴ϴ�.
			
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
				//1~5������ ���, 6~9������ ���ۿ� �����ִ� ��Ȳ�Դϴ�.
			}
			String msg = "\n����ũ�⸸ŭ�� 1~5������ ��µƽ��ϴ�.\n";
			String msg2 = "������ 6~9������ flush()�ؼ� ����ϰڽ��ϴ�.\n";
			bos.write(msg.getBytes());
//			bos.write(msg2.getBytes());
//			bos.flush();
//			bos.close();
//			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

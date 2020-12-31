package ioEx3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("fileWrite2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5); // 버퍼크기가 5가 됩니다.
			//한번에 담을 수 있는 크기는 5개 데이터만 버퍼에 머물다가
			//5개가 다 차게 되면 자동으로 파일로 전송됩니다.
			//'1'~'9'까지 하나씩 write를 하려고 합니다.
			//'1'~'5'까지 버퍼에 가득 차게 되면 파일로 전송이 됩니다.
			//'6'~'9'까지는 버퍼에 남아있게 됩니다.
//			bos.write('1');  //문자 1을 입력하고 싶다면 아스키코드 49를 입력해도 됩니다.
			
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
				//1~5까지만 출력, 6~9까지는 버퍼에 남아있는 상황입니다.
			}
			String msg = "\n버퍼크기만큼인 1~5까지가 출력됐습니다.\n";
			String msg2 = "나머지 6~9까지는 flush()해서 출력하겠습니다.\n";
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

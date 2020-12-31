package ioEx3;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 	OutputStream
 	메모리(RAM)에 있는 내용을 외부 저장소(HDD)에 "쓰기 write()" 합니다.

 	기본적으로 모니터에 출력할 수 있는 스트림은 2개가 있습니다. System.out / System.err
 			"파일"에 출력해 봅니다.
 		write(대상코드)	write(int) int값을 byte로 변환해서 대상체(파일)에 쓰게 됩니다.
 		write(byte[])
 		flush()				출력할 때, 버퍼가 가득 차게 되면 한꺼번에 쓰게 됩니다.
 							그런데, flush()메서드를 만나게 되면 버퍼가 가득 차지 않아도
 							바로 대상 파일에 데이터를 write()하게 됩니다.
 		close()

 		FileOutputStream
 */
public class OutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//해당 위치에 파일이 없을 때는 파일을 생성합니다.
			fos = new FileOutputStream("fileWrite.txt");
			//두번째 매개변수 append : 기존에 파일이 있으면 계속 이어쓰기 합니다.
			//fos = new FileOutputStream("fileWrite.txt",true);
			String msg = "Hello, 즐거운 하루!!";
			fos.write(msg.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {fos.close();} catch (IOException e) {e.printStackTrace();}
		}

	}

}

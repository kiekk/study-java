package ioEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	byte 스트림 : 1byte 단위로 입출력을 할 수 있는 스트림
 			- 동영상, 이미지, 음악, 일반 text 등....
 	char 스트림 : 문자에 특화되어 있는 스트림
 			- 문자읽을 때 사용합니다.
 			
 	스트림 : InputStream , OutputStream
 			   read			   write
 			ram으로 read    HDD에 write
 			read()			write()
 			read(byte[])
 			available() : return 타입이 int (읽을 수 있는 실제 byte수를 정수형으로 반환합니다)
 			close()     : stream을 열었으면 닫아야 합니다. (Scanner와 비슷)
 			
 			System.in   <--   byte input stream의 대표적인 예
 			
 	FileInputStream 해당 디렉토리에 있는 모든 파일을 읽을 수 있도록 하는 클래스입니다.
 					파일을 읽을 때, File클래스로 경로를 설정합니다.
 					해당 파일이 없을 경우 예외가 발생(FileNotFoundException)
 			   
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
		} catch (FileNotFoundException e) {	//파일의 위치가 없더라도 예외처리로 넘깁니다.
			e.printStackTrace();
		} catch (IOException e) {	//더이상 읽을 데이터가 없을 때, 에러를 방지합니다.
			e.printStackTrace();
		} finally {
			try {if(fis != null) {fis.close();}} catch (IOException e) {e.printStackTrace();}
		}
		System.out.println("\n프로그램 종료");
	}

}

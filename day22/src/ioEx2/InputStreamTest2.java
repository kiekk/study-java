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
public class InputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//읽어올 파일 내용 중에, 한글이 섞여 있습니다.
			fis = new FileInputStream("fileRead2.txt");
			/*
			비영어권 글자가 섞여 있을 때는 2byte 체계로
			되어 있어, (char) 단위로 읽을 때, 글자가 깨지게 됩니다.
			따라서, read를 할 때 byte[]을 미리 만들어놓고
			그 배열에 담아달라고 시키면 됩니다.
			이후 그 byte[]을 문자열로 생성해서 읽으면 깨지지 않고 처리할 수 있게 됩니다.
//			System.out.println((char)fis.read());
			int tmp = 0;
			while((tmp=fis.read()) != -1) {
				System.out.print((char)tmp);
			}
			*/
			
			//read해온 데이터를 담을 byte[]을 생성해봅니다.
			//그런데 몇개 만들어야 할지 알 수 없습니다.
			//파일에 쓰여 있는 글자 개수만큼 크기를 생성해야 합니다.
			byte[] _read = new byte[fis.available()];
			fis.read(_read);	//_read 배열에 읽어온 byte를 담게 됩니다.
			
			//이 byte[]을 String 생성자에게 주면 문자열로 생성해 줍니다.
			String ar_read = new String(_read);
			System.out.println(ar_read);
//			for(int i = 0;i<ar_read.length();i++) {
//				System.out.print(ar_read.charAt(i));
//			}
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

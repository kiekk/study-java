package ioEx2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 	FileInputStream : 물리적인 저장소에서 직접 read()를 진행합니다.
 	
 	Buffer : 논리적인 메모리 - 임시 저장소
 			 물리적인 저장소에서 읽어올 데이터를 Buffer라는 임시 저장소에 두고,
 			 메모리에서 데이터를 읽어옵니다.
 			 
 		HDD -> 논리적인 장치(버퍼) -> RAM(논리적인장치) 전송되니까 더 빠릅니다.
 	방법 
 		FileInputStream fis = 객체생성;
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
			byte[] _read = new byte[bis.available()];	//byte의 b는 소문자
			bis.read(_read);							//생성한 byte배열에 bis를 저장
			String ar_read = new String(_read);			//저장한 _read를 문자열로 변환
			System.out.println(ar_read);				//변환한 문자열을 출력
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

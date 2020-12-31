package ioEx;

import java.io.File;

/*
 	File 클래스
 		- 생성자
 		- 여러 메서드
 		- 
 */
public class FileTest2 {

	public static void main(String[] args) {
		//C:\Program Files\Java\jdk1.8.0_201
		int cnt1 = 0, cnt2 = 0;
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_201");
		
		//file.list()  : 이 메서드에 대해서 리턴 타입을 확인해 봅니다.
		String[] tmp = file.list();
		
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}//end for(i)
		System.out.println();
		//file.listFiles();
		File[] tmp2 = file.listFiles();
		for (int i = 0; i < tmp2.length; i++) {
			if(tmp2[i].isFile()) {			//파일인지 확인		tmp2[i].isDirectory();	//폴더인지 확인
				System.out.println(tmp2[i].getName() +"는 파일입니다.");
				cnt1++;
			}//end if
			if(tmp2[i].isDirectory()) {
				System.out.println(tmp2[i].getName() +"는 폴더입니다.");
				cnt2++;
			}//end if
		}//end for(i)
		System.out.println("파일 개수 : "+cnt1+"개");
		System.out.println("폴더 개수 : "+cnt2+"개");
	}//end main
}//end class

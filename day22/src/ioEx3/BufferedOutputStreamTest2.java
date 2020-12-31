package ioEx3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
/*
 	java 메모장 java_day01.txt
 	D:\GB_0900_05_ysh\java_language\java_memo  폴더에서 시작

 	1. 해당 폴더에 파일들을 쭉 보여줍니다.
 	2. 읽어올 파일명을 입력합니다.
 	3. 콘솔에 파일의 내용을 출력합니다.
 	4. 저장할 때는 파일명끝에_cpy 등을 붙입니다.
 		java_day01_cpy.txt

 */
public class BufferedOutputStreamTest2 {

	public static void main(String[] args) {
		String path = "D:\\GB_0900_05_ysh\\java_language\\java_memo";
		File file = new File(path);
		File[] files = file.listFiles();
		
		System.out.println("파일 리스트 출력");
		for (File a : files) {
			System.out.println(a.getName());
		} 
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		try {
			String showPath = "";
			int select = 0;
			System.out.println("출력할 파일의 날짜를 입력하세요.(ex : 01,02...11,12)"); showPath = sc.next();
			System.out.println("java_day"+showPath+".txt의 내용 출력");
			System.out.println();
			String path2 = path+"\\java_day"+showPath+".txt";
			fis = new FileInputStream(path2);
			bis = new BufferedInputStream(fis);
			byte[] _read = new byte[bis.available()];
			bis.read(_read);
			String ar_read = new String(_read);
			System.out.println(ar_read);
			System.out.println();
			System.out.println("저장하시겠습니까?\n1.예\t2.아니오"); select = sc.nextInt();
			int index = file.getName().indexOf('.');
			if(select == 1) {
				fos = new FileOutputStream( path+"\\java_day"+showPath+"_cpy.txt",true);
				System.out.println(showPath+"_cpy.txt 파일을 저장했습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package ioEx;

import java.io.File;
import java.io.IOException;

/*
 	File 클래스
 		- 생성자
 		- 여러 메서드
 		- 
 */
public class FileTest3 {

	public static void main(String[] args) {
		//D:\GB_0900_05_ysh\java_language\java_memo\java_day22.txt
		String path = "D:\\GB_0900_05_ysh\\java_language\\java_memo\\java_day22_1.txt";
		File file = new File(path);
		
		try {
			//파일을 생성하는 메서드,
			//기존에 동일한 파일이 있으면 생성하지 않습니다.
			//try-catch IOException이 필요합니다.
			System.out.println(file.createNewFile()?"생성했음":"생성하지 않았음");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//path에서 마지막 개체하고 상위개체하고 분리하고 싶다.
		//java_day22_1.txt 와 그 상위폴더들을 따로 출력합니다.
		
//		System.out.println(path.substring(0, path.lastIndexOf("\\")));
//		System.out.println(path.substring(path.lastIndexOf("\\")+1));
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getName());
		
		System.out.println(file.getName());
		String fullPath = file.getAbsolutePath();
		System.out.println(fullPath);
		int pos = fullPath.lastIndexOf("\\");
		String parentPath = fullPath.substring(0, pos);
		System.out.println(parentPath);
		String fileName = fullPath.substring(pos+1);
		System.out.println(fileName);
		
		//기존 문자열 조합으로 새로운 File 시스템을 만들 수 있습니다.
		
		//파일명에서 확장자하고 파일명하고 분리해봅니다.
		pos = fileName.lastIndexOf(".");
		String fName = fileName.substring(0,pos);
		System.out.println(fName);
		String ext = fileName.substring(pos+1);
		System.out.println(ext);
		
		//운영체제마다 디렉터리/파일 을 구분할 때 쓰는 문자들이 다릅니다.
		//그래서 해당 운영체제의 구분기호를 보여줍니다.
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		System.out.println(file.delete()); //java_day22_1가 삭제됩니다. 파일이 없을 경우 false
		System.out.println(file.getAbsolutePath());
	}//end main
}//end class

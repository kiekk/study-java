package ioEx;

import java.io.File;

/*
 	File 클래스
 		- 생성자
 		- 여러 메서드
 		- 
 */
public class FileTest {

	public static void main(String[] args) {
		String path = "C:\\";
		path = "D:\\GB_0900_05_ysh\\java_language\\java_memo\\java_day22.txt";
		File f = new File(path);
		if(f.exists()) {		//파일의 경로가 존재한다면,
			System.out.println(f.exists());
			System.out.println(f.isDirectory());		//폴더니?
			System.out.println(f.isFile());				//파일이니?	
			System.out.println(f.getPath());
			System.out.println(f.getName());			//해당 경로의 마지막 위치 이름을 가져옵니다.
			System.out.println(f.getAbsolutePath()); 	//해당 경로의 전체 위치 이름을 가져옵니다.
		}else {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);		//이 프로그램을 메모리에서 강제 종료
		}
	}

}

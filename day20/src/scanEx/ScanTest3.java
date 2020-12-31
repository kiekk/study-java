package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 	Scanner의 File 입력(읽기) 기능
 	
 	- Scanner 클래스를 이용해 키보드로부터 값 입력받아오기
 	- Scanner 클래스를 이용해 특정 경로(path)로 부터 값 입력받아오기
 	  특정경로 : C:\\date\\date.txt
 	  이 경로를 파일의 경로로 읽기 위해
 	  File 이라는 자바 클래스가 필요합니다.
 	  
 	- Scanner는 1.5 버전 이후부터 사용해 왔습니다.
 	1.5버전 이전에는 BufferReader 등을 이용했었습니다.
 	
 	-하지만, 최근에도 Reader/Writer 클래스를 갖고 있는 io 패키지 클래스를 자주 사용합니다.
 	
 */
public class ScanTest3 {

	public static void main(String[] args) {
		String path = "C:\\Users\\dbstn\\Desktop\\코리아IT아카데미\\국비교육\\java\\day20\\src\\scanEx\\data3.txt";
			//디렉터리 : 드라이브+폴더+파일
		//상대 경로 : "최종 목적 파일의 위치를 기준으로 명시하는 것"
		path = "src\\scanEx\\data3.txt";
		File file = new File(path);
		int sum = 0, cnt = 0;
		try {
			Scanner sc = new Scanner(file);
//			sc.next();
//			Integer.parstInt(sc.next());	기본적으로 문자열로 저장되어 있기 때문에 정수형으로 가져올 경우 parse해줘야합니다.
//			sc.nextInt(); 					//하지만 nextInt()메서드는 "100"을 정수 100으로 parse해서 리턴합니다.
//			sc.hasNextInt()					//다음 요소가 int(정수)형이면 가져오고(true),아니면 false를 리턴합니다.
			while(sc.hasNextInt()) {
				int tmp = sc.nextInt();
				sum += tmp;
				cnt++;
				System.out.println(tmp +"점");
			}
			System.out.println("총합 : "+sum);
			System.out.println("평균 : "+(double)sum/cnt);
		} catch(FileNotFoundException e) {
			System.out.println("해당 위치에 파일이 없어요 : "+e.getMessage());
		}
	}
}
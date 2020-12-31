package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 	Scanner의 File 입력(읽기) 기능

	Scanner에서 useDelimiter("구분자,구분기호") = String클래스의split(",")과 비슷합니다.
			구분자 단위로 데이터를 잘라줍니다.
	외부 파일에 데이터가 5줄이 있습니다.
	한줄씩 읽어올 때마다,
	  번호 	   이름	   국어		 영어		수학
	nextInt(),next(),nextInt(),nextInt(),nextInt()
	   1	  홍길동    90        89        88
 */
public class ScanTest5 {

	public static void main(String[] args) throws FileNotFoundException {
		//main에서 file scan 합니다.
		Scanner sc = new Scanner(new File("data5.txt"));
		ScoreControl scCont = new ScoreControl();
		while(sc.hasNext()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			while(sc2.hasNext()) {
				scCont.add(sc2.nextInt(),sc2.next(),sc2.nextInt(),sc2.nextInt(),sc2.nextInt());
			}
		}
		scCont.outputScoreList();
	}
}
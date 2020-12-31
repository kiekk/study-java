package scanEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 	Scanner의 File 입력(읽기) 기능

	Scanner에서 useDelimiter("구분자,구분기호") = String클래스의split(",")과 비슷합니다.
			구분자 단위로 데이터를 잘라줍니다.

 */
public class ScanTest4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data4.txt"));
		int sum = 0, totalSum = 0,cnt = 0, totalCnt = 0;
		while(sc.hasNext()) {
			String line = sc.nextLine();
//			System.out.println(line);
			Scanner scLine = new Scanner(line).useDelimiter(",");

			while(scLine.hasNextInt()) {
				sum += scLine.nextInt();
				cnt++;
			}
			totalSum += sum;
			totalCnt += cnt;
			System.out.println(line +" : "+sum);
			System.out.println("평균 : "+sum/cnt);
			sum = 0;
			cnt = 0;
		}		System.out.println("총 점수 : "+ totalSum);
		System.out.println("총 평균 : "+ (double)totalSum/totalCnt);
		
		sc.close();
	}
}
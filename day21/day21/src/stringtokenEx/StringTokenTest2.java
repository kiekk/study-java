package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer 와 split()
 		클래스			메서드
 		
 */
public class StringTokenTest2 {

	public static void main(String[] args) {
		String msg = "안녕 하세요,반갑 습니다,";
		String[] sp = msg.split(",");
		//for문 이용
		for(int i = 0;i<sp.length;i++) {
			String[] sp2 = sp[i].split(" ");
			for(int j = 0;j<sp2.length;j++) {
				System.out.println(sp2[j]);
			}
		}		
		//StringTokenizer 클래스 이용
		StringTokenizer stz = new StringTokenizer(msg," ,");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
		msg = "x+y=t*2/1";
		//연산기호는 모두 없애고, 연산항만 가지고 옵니다.
		StringTokenizer stz2 = new StringTokenizer(msg, "+=*/");
		while(stz2.hasMoreTokens()) {
			System.out.println(stz2.nextToken());
		}
		StringTokenizer stz3 = new StringTokenizer(msg, "+=*/", true);		//구분자를 보여주려면 (true), 보여주지 않으려면 (false)
		while(stz3.hasMoreTokens()) {
			System.out.println(stz3.nextToken());
		}
		
		
	}
}

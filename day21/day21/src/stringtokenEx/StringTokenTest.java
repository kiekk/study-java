package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer 와 split()
 		클래스			메서드
 		
 */
public class StringTokenTest {

	public static void main(String[] args) {
		String msg = "안녕하세요,반갑습니다,";
		String[] sp = msg.split(",");
		//for문 이용
		for(int i = 0;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
		//enhanced for 이용
		for (String a : sp) {
			System.out.println(a);
		}
		//StringTokenizer 클래스 이용
		StringTokenizer stz = new StringTokenizer(msg,",");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
		
	}
}

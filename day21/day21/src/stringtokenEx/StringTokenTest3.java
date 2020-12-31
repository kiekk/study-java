package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer 와 split()
 		클래스			메서드
 		
 */
public class StringTokenTest3 {
	StringTokenizer st;
	//1. 인수1개 생성자
	public StringTokenTest3(String str) {
		System.out.println("str : "+str);
		this.st = new StringTokenizer(str);
	}
	//2. 인수2개 생성자
	public StringTokenTest3(String str,String delemeter) {
		System.out.println("str : "+str);
		this.st = new StringTokenizer(str,delemeter);
	}
	//3. print() : 구분단어 개수, 분리된 단어들
	void print() {
		System.out.println("구분단어 개수 : "+st.countTokens()+"개");
		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());		//iterator에서 next의 오류를 경험했기 때문에 최대한 변수에 저장해서 출력하는 방식을 사용하도록 합니다.
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
	}
	
	public static void main(String[] args) {
		String msg = "사랑하는 나의 어머니";					//구분자 공백 -> 공백이 하나일 경우는 별도로 구분자를 표시하지 않아도 됩니다.
																//StringTokenizer의 기본 구분자는 공백
		StringTokenTest3 stz1 = new StringTokenTest3(msg);
		stz1.print();
		String date = "2020/06/30";								//구분자 /  를 이용해야 합니다.
		StringTokenTest3 stz2 = new StringTokenTest3(date,"/");
		stz2.print();
		
	
	}
}

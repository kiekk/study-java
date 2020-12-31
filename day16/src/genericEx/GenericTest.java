package genericEx;

import java.util.ArrayList;

/*
 	제너릭
	컬렉션클래스<제너릭> 객체 = 인스턴스();
	ArrayList<String> list = new ArrayList<String>();
	
	컬렉션 객체를 만들 때, 형을 명시해서 미리 add() 될 때의 타입을 
	검증할 수 있습니다.
 */
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		int num = 1234;
		list.add("안녕");
		list.add("박문수");
		list.add("홍길동");
//		list.add(num+"");				//이 데이터는 add시킬 수 없습니다. 타입이 다르므로
		list.add(String.valueOf(num));	//명시적 형변환
		list.add("안녕");
	}

}

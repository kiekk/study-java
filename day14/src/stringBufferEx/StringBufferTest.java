package stringBufferEx;
/*
 	String은 immutable : 변경 불가능
 		String은 문자열 자체에 데이터를 수정할 수 없는 상수값입니다.
 	StringBuffer은 mutable : 변경 가능
 		기존 문자열을 복사해서 Heap에 가져다 놓고 사용합니다.
 	StringBuffer : 문자열 자체에 insert(), replace(),
 		StringBuffer는 메모리낭비가 없습니다. heap자체에서 데이터를 직접 수정, 삽입이 가능하기 때문에
 		String은 상수기 때문에 문자열을 변경시 새로 객체를 생성해서 작업을 진행하기 때문에 메모리낭비가 StringBuffer보다 심합니다.
 		
 */
public class StringBufferTest {

	public static void main(String[] args) {
		String msg = "abc";
		//StringBuffer msgF = "abc"; //String하고 비슷하지만, 생성자로 인스턴스를 만들어야 사용할 수 있습니다.
		StringBuffer msgF = new StringBuffer("abc");
		StringBuffer tmp = msgF.insert(2,"12");
		System.out.println(tmp);
	
		String tmp2 = msgF.insert(2,"12").toString();
		//heap에 있는 문자열(데이터)를 다시 데이터영역에 옮겨 상수화 시키겠다는 의미
		//buffer에 있는 문자열을 String으로 고정시키겠다는 의미
		System.out.println(tmp2);
		
		tmp = new StringBuffer("0123456");
		tmp = tmp.replace(3,5,"AB");
		System.out.println(tmp);
		//대체할 문자가 범위값보다 작을 경우 나머지 범위의 데이터는 삭제됩니다.
		tmp = tmp.replace(2,5,"AB");
		System.out.println(tmp);
		
		String str = "helloworld";
		StringBuffer str2 = new StringBuffer(str);
		System.out.println("처음 상태 : " + str2); 						//처음상태
        System.out.println("문자열 추출 : " + str2.substring(2,4)); 		//문자열 추출하기
        System.out.println("문자열 추가 : " + str2.insert(2,"추가"));		//문자열 추가하기
        System.out.println("문자열 삭제 : " + str2.delete(2,4)); 			//문자열 삭제하기
        System.out.println("문자열 연결 : " + str2.append("java")); 		//문자열 붙이기
        System.out.println("문자열의 길이 : " + str2.length()); 			//문자열의 길이구하기
        System.out.println("용량의 크기 : " + str2.capacity()); 			//용량의 크기 구하기
        System.out.println("문자열 역순 변경 : " + str2.reverse()); 			//문자열 뒤집기
        System.out.println("마지막 상태 : " + str2); 						//마지막상태 
	}

}

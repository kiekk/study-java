package langEx;
/*
 	Object 클래스
 	hashCode()
 	equals()
 	toSTring()
 */
class Value{
	int value;
	Value(int val){
		this.value = val;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {	//Value 타입일 경우에만 형변환이 가능합니다.
			return this.value == ((Value)obj).value; //obj가 Value인지 먼저 검사를 해야합니다. instanceof연산자 사용
		}else {
			return false;	//Value타입이 아닐 경우는 무조건 거짓이기 때문에 false값을 return합니다.
		}
	}
}
public class ObjectTest03 {

	public static void main(String[] args) {
		Value objA = new Value(10);
		Value objB = new Value(10);
		
		//objA, objB의 해쉬코드(참조값)을 비교
		if(objA == objB) 
			System.out.println("같다");
		else 
			System.out.println("다르다");
		
		if(objA.equals(objB)) 
			System.out.println("같다");
		else
			System.out.println("다르다");
		
//		if(objA.value == objB.value) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
	}
}


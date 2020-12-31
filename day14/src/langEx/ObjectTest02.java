package langEx;
/*
 	Object 클래스
 	hashCode()
 	equals()
 	toSTring()
 */
class TypeC{
	
}
public class ObjectTest02 {

	public static void main(String[] args) {
		System.out.println(new TypeC());
		TypeC obj = new TypeC();
		System.out.println(obj);							//주소가 해쉬코드로 출력됩니다.
		System.out.println(obj.hashCode());					//해쉬코드는 10진수로 표현
		String a = String.format("%x\n", obj.hashCode());	//해쉬코드를 16진수로 변경
		System.out.println(a);
		System.out.println(obj.getClass().getName()+"@"+a);
		
		TypeC obj2 = new TypeC();
		TypeC obj3 = new TypeC();
							//참조(주소)값을 비교하는 것이기 때문에 서로 다른 객체입니다.
		if(obj2 == obj3) {			
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("같은 객체");
		}else {
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("다른 객체");
		}
		obj3 = obj2;		//obj2의 참조(주소)값을 obj3가 가리키게 합니다.
							//이때 obj3가 가지고 있던 참조(주소)값 or 인스턴스 정보는 사라지게 됩니다.
							//참조(주소)값을 비교하는 것이기 이번에는 서로 같은 객체입니다.
		if(obj2 == obj3) {			
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("같은 객체");
		}else {
			System.out.println("obj2.hashCode : "+obj2.hashCode()+"\nobj3.hansCode : "+obj3.hashCode());
			System.out.println("다른 객체");
		}
	}

}

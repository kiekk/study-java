package interEx;

class TypeA{
	
}
class TypeB extends TypeA implements InterAA{
	
}
class TypeC extends TypeA{
	
}
class Some{
	void fct(TypeA obj) {
		if(obj instanceof TypeB) {
			System.out.println(obj.getClass().getSimpleName()+"는 TypeB클래스입니다.");
		}else if(obj instanceof TypeC) {
			System.out.println(obj.getClass().getSimpleName()+"는 TypeC클래스입니다.");			
		}
		if(obj instanceof InterAA) {
			System.out.println(obj.getClass().getSimpleName()+"는 InterAA의 지원을 받고 있습니다.");
		}
	}
}
public class InterTest03 {

	public static void main(String[] args) {
		Some some = new Some();
		some.fct(new TypeB());
		some.fct(new TypeC());
	}

}

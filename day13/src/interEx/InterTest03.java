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
			System.out.println(obj.getClass().getSimpleName()+"�� TypeBŬ�����Դϴ�.");
		}else if(obj instanceof TypeC) {
			System.out.println(obj.getClass().getSimpleName()+"�� TypeCŬ�����Դϴ�.");			
		}
		if(obj instanceof InterAA) {
			System.out.println(obj.getClass().getSimpleName()+"�� InterAA�� ������ �ް� �ֽ��ϴ�.");
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

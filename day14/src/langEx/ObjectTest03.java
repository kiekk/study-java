package langEx;
/*
 	Object Ŭ����
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
		if(obj instanceof Value) {	//Value Ÿ���� ��쿡�� ����ȯ�� �����մϴ�.
			return this.value == ((Value)obj).value; //obj�� Value���� ���� �˻縦 �ؾ��մϴ�. instanceof������ ���
		}else {
			return false;	//ValueŸ���� �ƴ� ���� ������ �����̱� ������ false���� return�մϴ�.
		}
	}
}
public class ObjectTest03 {

	public static void main(String[] args) {
		Value objA = new Value(10);
		Value objB = new Value(10);
		
		//objA, objB�� �ؽ��ڵ�(������)�� ��
		if(objA == objB) 
			System.out.println("����");
		else 
			System.out.println("�ٸ���");
		
		if(objA.equals(objB)) 
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		
//		if(objA.value == objB.value) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ٸ���");
//		}
	}
}


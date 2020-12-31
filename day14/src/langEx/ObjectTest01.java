package langEx;
/*
	Object 클래스
	hashCode()
	equals()
	toSTring()
*/
class MyClass{
	
}
class TypeA{
	String name;
	int kor;
	{
		name = "홍길동";
		kor = 100;
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\t국어 점수 : "+kor+"점";
	}
}
class TypeB{
	String bunho;
	int eng;
	int math;
	public TypeB(String bunho, int eng, int math) {
		this.bunho = bunho;
		this.eng = eng;
		this.math = math;
	}
//	@Override
//	public String toString() {
//		return "번호 : "+bunho+"\t영어 점수 : "+eng+"점\t수학 점수 : "+math+"점";
//	}
	@Override				//alt + shift + s -> s -> 자동적으로 초기화값을 만들어줍니다.
	public String toString() {
		return "TypeB [bunho=" + bunho + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
public class ObjectTest01 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println(obj.toString());	 //결과 : langEx.MyClass@7852e922
		System.out.println(obj);			 //결과 : langEx.MyClass@7852e922
											 //obj옆에는 항상 .toString()이 생략되어 있습니다.
		TypeA aObj = new TypeA();
		System.out.println(aObj);
		
		TypeB bObj = new TypeB("1번",10,20);
		System.out.println(bObj);
	}

}

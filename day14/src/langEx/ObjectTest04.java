package langEx;
/*
 	Object 클래스
 	hashCode()
 	equals()
 	toSTring()
 */
class Member{
	String name;
	long juminbunho;	//생년월일까지만
	public Member(String name, long juminbunho) {
		this.name = name;
		this.juminbunho = juminbunho;
	}
	@Override                                             
	public boolean equals(Object obj) {
		if(obj instanceof Member && obj != null) 
			return this.juminbunho == ((Member)obj).juminbunho;
		else 
			return false;
	}
}
public class ObjectTest04 {

	public static void main(String[] args) {
		Member m1 = new Member("dog",901010L);
		Member m2 = new Member("cat",901010L);
		
		//m1과 m2는 같은 회원 입니까? 주민번호로 비교해봅니다.
		if(m1.equals(m2)) {
			System.out.println("같은 회원입니다.");
			System.out.println("회원가입을 할 수 없습니다.");
		}else {
			System.out.println("정상적으로 회원가입 할 수 있습니다.");
		}
	}
}


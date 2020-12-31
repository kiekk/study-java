package setEx;

import java.util.HashSet;

/*
 	모델 클래스와 HashSet
 	-인스턴스 객체를 add() 시킬 때는
 	 hahsCode()와 equals() 메서드를 적절하게 오버라이딩 해야 한다.
 */

public class HashSetTest6 {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<Person>();
		
		Person hgd = new Person("홍길동", 1234567);
		Person iss = new Person("이순신", 2234567);
		Person pms = new Person("박문수", 3234567);
		
		set.add(hgd);
		set.add(iss);
		set.add(pms);
		
		//신규 회원이 가입하려고 합니다.
		//저장되어 있는 set의 요소들과 신규회원 정보를 비교해,
		//신규회원이 add 될 수 있는지 없는지 여부를 살펴봅니다.
		Person newMember = new Person("아무개",1234567); //주민번호가 동일한 객체가 set에 들어가려 하고 있습니다.
		set.add(newMember);
		//hashCode()를 부릅니다. 기존 3개의 해시코드하고 다르기 때문
		//set에 추가될 수 있습니다.
		//equals()메서드를 부를 필요가 없어졌습니다.
		System.out.println(set);
		
		//문제는 1234567이라는 주민번호가 이미 set안에 들어 있는데,
		//newMember가 들어가게 된 것입니다.
		
		//그래서 객체의 해시코드를 반환하는 hashCode() 메서드로는 인스턴스의 비교가 불가능합니다.
		//hashCode() 메서드에서는 모든 인스턴스 해시코드값을 동일하게 만듭니다.
		//그 다음에 equals()를 호출해서  객체안에 데이터를 비교하게 됩니다.
		
		//hashCode()와 equals()를 오버라이딩 할 수 밖에 없습니다.
		
		
	}
}

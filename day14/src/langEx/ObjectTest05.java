package langEx;
/*
 	Object 클래스
 	hashCode()
 	equals()
 	toSTring()
 */
class Score{
	String name;
	int kor;
	int eng;
	int math;
	/*
	 * new(인스턴스 생성) 할 때마다, 객체의 해시코드는 모두 다릅니다.
	 * 그래서 같은지, 다른지에 대해 비교가 불가능해지는 "경우-HashSet컬렉션에서."가 발생합니다.
	 * hashCode() 를 똑같은 조건이나 return값을 0으로 해줍니다.
	 * 그 후 equals()에서 특정 값(인스턴스)를 비교해서 같은지, 다른지 여부를 결정할 수 있도록 합니다.
	 * 그래서 hashCode()와 equals()를 동시에 오버라이딩 하는 경우가 많습니다.(이유 더 알아보기)
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;	//소수
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class ObjectTest05 {

	public static void main(String[] args) {
		
	}
}


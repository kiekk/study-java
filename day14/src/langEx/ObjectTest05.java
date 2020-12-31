package langEx;
/*
 	Object Ŭ����
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
	 * new(�ν��Ͻ� ����) �� ������, ��ü�� �ؽ��ڵ�� ��� �ٸ��ϴ�.
	 * �׷��� ������, �ٸ����� ���� �񱳰� �Ұ��������� "���-HashSet�÷��ǿ���."�� �߻��մϴ�.
	 * hashCode() �� �Ȱ��� �����̳� return���� 0���� ���ݴϴ�.
	 * �� �� equals()���� Ư�� ��(�ν��Ͻ�)�� ���ؼ� ������, �ٸ��� ���θ� ������ �� �ֵ��� �մϴ�.
	 * �׷��� hashCode()�� equals()�� ���ÿ� �������̵� �ϴ� ��찡 �����ϴ�.(���� �� �˾ƺ���)
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;	//�Ҽ�
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


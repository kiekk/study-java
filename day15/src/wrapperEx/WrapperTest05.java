package wrapperEx;

public class WrapperTest05 {

	public static void main(String[] args) {
		//jdk ���� 1.5 �̻���͸� ������ ����Դϴ�.
		
		//wrapper�� �⺻�� ������ ���� ���԰����մϴ�.
		//�⺻���� wrapper �� ���� ���԰����մϴ�.(������ ���� �ʿ����� �ʽ��ϴ�.)
		
		int var = new Integer(100);				//�ν��Ͻ��� �⺻�� ������ ���� �����ϰ� �ֽ��ϴ�. ���� wrapper�� �����մϴ�.
		int var2 = new Integer(100).intValue();	//intValue()�޼��尡 �����Ǿ� �ֽ��ϴ�.
		
		//�̿� ���� ����� "�ڵ� ����", "auto boxing"�̶�� �մϴ�.
		Integer obj = 100;			//�⺻���� ��ü�� ���� ���� �ϴ� �͵� �����մϴ�.
									//�ν��Ͻ� ������ �����Ǿ������� ������ �ǰ� �ֽ��ϴ�.
		//�⺻���� �ν��Ͻ����� ���굵 �����մϴ�.
		System.out.println("�⺻�� + ��ü : "+(var + obj));
							//obj.intValue() -> "unboxing"�̶�� �մϴ�.
							//�ڵ����� ���� �������ִ� ���
		
	}

}

package wrapperEx;

public class WrapperTest02 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2?"����":"�ٸ���");				//�ν��Ͻ��� �ּҰ��� ���ϱ� ������ "�ٸ���"�� ��µ˴ϴ�.
		//wrapper Ŭ�������� equals�޼��尡 ������ �Ǿ� �ֽ��ϴ�.
		System.out.println(i1.equals(i2) ? "����":"�ٸ���");	//equals�޼��带 ���ؼ� ���� ���մϴ�.
		
	}

}

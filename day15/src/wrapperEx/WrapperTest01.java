package wrapperEx;

public class WrapperTest01 {

	public static void main(String[] args) {
		//100, 'A', true	�⺻ �ڷ����� ���ͷ� �����
		//�⺻ �ڷ����� ��üȭ ��ų �� ����ϴ� Ŭ�������� wrapperŬ������� �մϴ�.
		
		Boolean b = new Boolean(true);
		Boolean b2 = new Boolean("true");		//���ڿ� true�� �����մϴ�.
		System.out.println(b);					//toString()�� �����Ǿ� �ֽ��ϴ�.
		System.out.println(b2);
		System.out.println(b.toString());		//toString()�� �������̵� �Ǿ��ֽ��ϴ�.
		System.out.println(b2.toString());
		
		Byte byte1 = new Byte((byte) 10);
		Byte byte2 = new Byte("10");
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte1.toString());
		System.out.println(byte2.toString());
		
		Float f1 = new Float(10.1F);
		Float f2 = new Float(10.1);		//int���� �޸� ���λ�F�� ������ �ʾƵ� �ڵ�����ȯ�� �ǰ� �� �����ڰ� �����ε��Ǿ��ֽ��ϴ�.
		Float f3 = new Float("10.1");
		System.out.println(f1);
		System.out.println(f2);
		
		//�⺻������ ��ü�� ��ȯ��Ű�� ���� "wrapping", "boxing"�̶�� �մϴ�.
	}

}

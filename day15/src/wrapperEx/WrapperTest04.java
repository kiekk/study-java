package wrapperEx;

public class WrapperTest04 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		//���ڿ� "100"�� �ִµ�, ��ü i3�� ����� �մϴ�.
		
		Integer i3 = new Integer("100");
		int var = Integer.parseInt("100");
		Integer i4 = Integer.valueOf(100);
		i4 = Integer.valueOf("111");			//valueOf�޼��尡 �����ε��Ǿ��־� ���ڿ��� ó�� ����
		var = Integer.valueOf("111").intValue();
		
		
		//������ ���õ� ����
		//�� ���� ��
		//�տ� �ִ� ���ڸ� �ڿ� �ִ� ���ڰ� �����ϰ� �ֽ��ϴ�.
		//�տ� �ִ� ���ڰ� � ���������� �ľ��ϰ� �������� ��ȯ�մϴ�.
		int var3 = Integer.parseInt("100", 2);	//100�� 2����-> 10������ ��ȯ
		System.out.println(var3);				// 0B10100 -> ���λ� 0B
		var3 = Integer.parseInt("100", 8);		//100�� 8����-> 10������ ��ȯ
		System.out.println(var3);				// 012345  -> ���λ� 0
		var3 = Integer.parseInt("100", 16);		//100�� 16����-> 10������ ��ȯ
		System.out.println(var3);				//0x3456   -> ���λ� 0x
		var3 = Integer.parseInt("FF", 16);		//100�� 16����-> 10������ ��ȯ
		System.out.println(var3);
		
	}

}

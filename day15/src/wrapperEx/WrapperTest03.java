package wrapperEx;

public class WrapperTest03 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		//wrapper ��ü���� �⺻�ڷ����� ���� �����غ��ϴ�.
		int var1 = i1.intValue();
		int var2 = i2.intValue();
		System.out.println(var1);
		System.out.println(var2);
		
		//intValue�޼��带 ���� �⺻�ڷ����� ���� �����߱� ������ var1, var2�� �����Դϴ�,
		//���� var1, var2�� ��ü�� �ƴϱ� ������ equals�޼���� �񱳰� �Ұ����մϴ�.
		System.out.println(var1==var2?"����":"�ٸ���");
		
	}

}

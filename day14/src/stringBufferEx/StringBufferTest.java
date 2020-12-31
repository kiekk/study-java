package stringBufferEx;
/*
 	String�� immutable : ���� �Ұ���
 		String�� ���ڿ� ��ü�� �����͸� ������ �� ���� ������Դϴ�.
 	StringBuffer�� mutable : ���� ����
 		���� ���ڿ��� �����ؼ� Heap�� ������ ���� ����մϴ�.
 	StringBuffer : ���ڿ� ��ü�� insert(), replace(),
 		StringBuffer�� �޸𸮳��� �����ϴ�. heap��ü���� �����͸� ���� ����, ������ �����ϱ� ������
 		String�� ����� ������ ���ڿ��� ����� ���� ��ü�� �����ؼ� �۾��� �����ϱ� ������ �޸𸮳��� StringBuffer���� ���մϴ�.
 		
 */
public class StringBufferTest {

	public static void main(String[] args) {
		String msg = "abc";
		//StringBuffer msgF = "abc"; //String�ϰ� ���������, �����ڷ� �ν��Ͻ��� ������ ����� �� �ֽ��ϴ�.
		StringBuffer msgF = new StringBuffer("abc");
		StringBuffer tmp = msgF.insert(2,"12");
		System.out.println(tmp);
	
		String tmp2 = msgF.insert(2,"12").toString();
		//heap�� �ִ� ���ڿ�(������)�� �ٽ� �����Ϳ����� �Ű� ���ȭ ��Ű�ڴٴ� �ǹ�
		//buffer�� �ִ� ���ڿ��� String���� ������Ű�ڴٴ� �ǹ�
		System.out.println(tmp2);
		
		tmp = new StringBuffer("0123456");
		tmp = tmp.replace(3,5,"AB");
		System.out.println(tmp);
		//��ü�� ���ڰ� ���������� ���� ��� ������ ������ �����ʹ� �����˴ϴ�.
		tmp = tmp.replace(2,5,"AB");
		System.out.println(tmp);
		
		String str = "helloworld";
		StringBuffer str2 = new StringBuffer(str);
		System.out.println("ó�� ���� : " + str2); 						//ó������
        System.out.println("���ڿ� ���� : " + str2.substring(2,4)); 		//���ڿ� �����ϱ�
        System.out.println("���ڿ� �߰� : " + str2.insert(2,"�߰�"));		//���ڿ� �߰��ϱ�
        System.out.println("���ڿ� ���� : " + str2.delete(2,4)); 			//���ڿ� �����ϱ�
        System.out.println("���ڿ� ���� : " + str2.append("java")); 		//���ڿ� ���̱�
        System.out.println("���ڿ��� ���� : " + str2.length()); 			//���ڿ��� ���̱��ϱ�
        System.out.println("�뷮�� ũ�� : " + str2.capacity()); 			//�뷮�� ũ�� ���ϱ�
        System.out.println("���ڿ� ���� ���� : " + str2.reverse()); 			//���ڿ� ������
        System.out.println("������ ���� : " + str2); 						//���������� 
	}

}

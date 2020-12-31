package stringEx;
/*
 	���ڿ�
 	
 	���ڿ� �����ϴ� �޼����
 	length() -> int
 	charAt(����==�ε���) -> char
 	equals(Object)
 	equalsIgnoreCase(���ڿ�)	-> ���ڿ� �� (��ҹ��� ���X) 
 	
 	
 	concat(���ڿ�) -> str.concat("bcd") -> str�� "bcd"�� �ٿ��� ���ο� ���ڿ��� return�մϴ�(int)
 				str + "bcd" (����)
 	contains(CharSequence or ����,���ڿ�) ->str.contains("bcd"); -> str�� "bcd"�� ���ԵǾ� ������ true,������ false�� return�մϴ�(boolean)
 		String s = "abcdef";
 		s.contains("cd");	-> return true;
 		
 	endsWith(���ڿ�)	->str.endWith("txt")	-> str�� "txt"�� ������ true, �ƴϸ� false�� return�մϴ�(boolean)
 	
 	indexOf(����,int(������ �����ڵ�))	-> 	int	-> String msg = "Hello";		-> ������ -1, �ش� ���ڰ� ���� ��� ù��° �˻��Ǵ� ������ ��ġ�� ��ȯ
 							int index = msg.indexOf('o');	-> msg ���ڿ��� o��� ������ �ε��� ���� return�մϴ�(int)
 	indexOf(String)		->	msg.indexOf("el");	-> ã�� ���ڿ��� ���� ��ġ���� return�մϴ�(int)
 	lastIndexOf(int)	-> int	-> �ڿ������� (������->����) ã�����ϴ� ����,���ڿ��� �ε��� ���� return�մϴ�.				
 	lastIndexOf(String)	-> int		
 	replace(char1,char2)	-> String	-> msg.replace('H','C');	-> "Cello"���ڿ��� return�մϴ�.(String)
 	replace(���ڿ�������)
 	char1 -> ���� ����
 	char2 -> �ٲ� ����	
 	
 	
 	�ڡ�
 	���ڿ�.split("���ڿ� �и���=regex); -> String []
 	
 	���ڿ�.substring(5)	-> �ε����� ���� 5�� ���ں��� �����ؼ� ������ ���ڿ��� ��ȯ
 	���ڿ�.substring(0,5)	-> 0���� 5�������� ���ڿ��� ��ȯ	0 <= ���ڿ� < 5
 	
 	trim()	: ���ڿ����� �¿� ������ ���� ���, ������ ���ְ� ���� ���ڿ��� ����մϴ�. ó���� ���� ���鸸 ����(���ڿ� ���̴� X)
 	
 */
public class StringTest03 {

	public static void main(String[] args) {
		String msg1 = "abcdef";
		//���ڿ� ����
		int length = msg1.length();
		System.out.println("���ڿ� : "+length+"��");
		//���ڿ� ��
		System.out.println(msg1.equalsIgnoreCase("ABcdEf"));
		//���ڿ� ����
		System.out.println(msg1.concat("HI"));
		System.out.println(msg1+"HI");
		//���ڿ� ���Կ��� ���ϱ�
		String msg2 = "Hello";
		System.out.println("Hello�� l�� �ֽ��ϱ�? : "+msg2.contains("l"));
		//���ڿ� ����
		String temp = msg2.replace("ll", "LL");
		System.out.println("ll�� LL�� ��ü : "+temp);
		//���ڿ��� ��ġ ���ϱ� lastIndexOf, indexOf
		String msg3 = "abcasdferiuijciovjoijiopqklamxcklzvwer";
		System.out.println("i�� lastIndefOf �� : "+msg3.lastIndexOf('i'));
		System.out.println("iam�� lastIndefOf �� : "+msg3.lastIndexOf("lam"));
		System.out.println("i�� IndefOf �� : "+msg3.indexOf('i'));
		//�����ڷ� ���ڿ� ������
		String msg4 = "asdv,ccvd:erdfas,dfer:qwersc,xc:dcv,cvnt:awere,yyuas:asd,zxcv";
		String[] arMsg = msg4.split(":");
		System.out.println(": �����ڷ� ���ڿ� ������");
		for(String a : arMsg) 
			System.out.println(a);
		String[] arMsg1 = msg4.split(",");
		System.out.println("---------------");
		System.out.println(", �����ڷ� ���ڿ� ������");
		for(String a : arMsg1)
			System.out.println(a);
		System.out.println("---------------");
		//���ڿ��� ���� ����
		String msg5 = "  dfdf  ererer   ";
		System.out.println(msg5.trim());
		//���ڿ��� �Ϻκи� ����
		String msg6 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(msg6.substring(5,10));
		System.out.println(msg6.substring(12));
	}

}

package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer �� split()
 		Ŭ����			�޼���
 		
 */
public class StringTokenTest {

	public static void main(String[] args) {
		String msg = "�ȳ��ϼ���,�ݰ����ϴ�,";
		String[] sp = msg.split(",");
		//for�� �̿�
		for(int i = 0;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
		//enhanced for �̿�
		for (String a : sp) {
			System.out.println(a);
		}
		//StringTokenizer Ŭ���� �̿�
		StringTokenizer stz = new StringTokenizer(msg,",");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
		
	}
}

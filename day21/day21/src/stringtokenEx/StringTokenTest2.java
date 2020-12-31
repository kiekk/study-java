package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer �� split()
 		Ŭ����			�޼���
 		
 */
public class StringTokenTest2 {

	public static void main(String[] args) {
		String msg = "�ȳ� �ϼ���,�ݰ� ���ϴ�,";
		String[] sp = msg.split(",");
		//for�� �̿�
		for(int i = 0;i<sp.length;i++) {
			String[] sp2 = sp[i].split(" ");
			for(int j = 0;j<sp2.length;j++) {
				System.out.println(sp2[j]);
			}
		}		
		//StringTokenizer Ŭ���� �̿�
		StringTokenizer stz = new StringTokenizer(msg," ,");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
		msg = "x+y=t*2/1";
		//�����ȣ�� ��� ���ְ�, �����׸� ������ �ɴϴ�.
		StringTokenizer stz2 = new StringTokenizer(msg, "+=*/");
		while(stz2.hasMoreTokens()) {
			System.out.println(stz2.nextToken());
		}
		StringTokenizer stz3 = new StringTokenizer(msg, "+=*/", true);		//�����ڸ� �����ַ��� (true), �������� �������� (false)
		while(stz3.hasMoreTokens()) {
			System.out.println(stz3.nextToken());
		}
		
		
	}
}

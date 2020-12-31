package stringtokenEx;

import java.util.StringTokenizer;

/*
 	StringTokenizer �� split()
 		Ŭ����			�޼���
 		
 */
public class StringTokenTest3 {
	StringTokenizer st;
	//1. �μ�1�� ������
	public StringTokenTest3(String str) {
		System.out.println("str : "+str);
		this.st = new StringTokenizer(str);
	}
	//2. �μ�2�� ������
	public StringTokenTest3(String str,String delemeter) {
		System.out.println("str : "+str);
		this.st = new StringTokenizer(str,delemeter);
	}
	//3. print() : ���дܾ� ����, �и��� �ܾ��
	void print() {
		System.out.println("���дܾ� ���� : "+st.countTokens()+"��");
		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());		//iterator���� next�� ������ �����߱� ������ �ִ��� ������ �����ؼ� ����ϴ� ����� ����ϵ��� �մϴ�.
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
	}
	
	public static void main(String[] args) {
		String msg = "����ϴ� ���� ��Ӵ�";					//������ ���� -> ������ �ϳ��� ���� ������ �����ڸ� ǥ������ �ʾƵ� �˴ϴ�.
																//StringTokenizer�� �⺻ �����ڴ� ����
		StringTokenTest3 stz1 = new StringTokenTest3(msg);
		stz1.print();
		String date = "2020/06/30";								//������ /  �� �̿��ؾ� �մϴ�.
		StringTokenTest3 stz2 = new StringTokenTest3(date,"/");
		stz2.print();
		
	
	}
}

package addressHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/*
 	�ּ�ã��
 	�⺻ 2�� �ּ� �Է��س���
 	����� ������ ������ 111, ����� ���ʱ� ���ʵ� 222
 	3��° ���ʹ� �߰�����
 	
 	�� Ŭ���� ����� Address
 	
 */
class Address2{
	Scanner sc = new Scanner(System.in);
	private String si;
	private String gu;
	private String dong;
	private int bunji;
	
	public Address2() {
		
	}
	
	public Address2(String si, String gu, String dong, int bunji) {
		this.si = si;
		this.gu = gu;
		this.dong = dong;
		this.bunji = bunji;
	}
	protected void searchDong(ArrayList<Address2> list) {
		String tmp="";
		System.out.println("ã����� ������ ���� �Է����ּ��� (ex: ������)");
		tmp = sc.next();
		for (Address2 address : list) {
			if(address.dong.equals(tmp)) {
				System.out.println(address.dong +"�� "+address.bunji+"���� �Դϴ�.");
			}
		}
	}
	protected Address2 rt_New() {
		String nSi="",nGu="",nDong="";
		int nBunji=0;
		System.out.println("�ø� �Է�"); nSi = sc.next();
		System.out.println("���� �Է�"); nGu = sc.next();
		System.out.println("���� �Է�"); nDong = sc.next();
		System.out.println("������ �Է�"); nBunji = sc.nextInt();
		return new Address2(nSi, nGu, nDong, nBunji);
		
	}
	protected void insertDong(ArrayList<Address2> list) {
		String tmp="�� ǥ�� �����Ͻþ� �����ϰ� ���� ������ �Է��ϼ���!";
		int temp=0;
		System.out.println("������ �߰��մϴ�!");
		allAddress(list);
		System.out.println(tmp);
		temp= sc.nextInt();
		
		list.add(temp-1, rt_New()); //ǥ ������ 1���� �����մϴ�.
	}
	protected void update(ArrayList<Address2> list) {
		String tmp="�� ǥ�� �����Ͻþ� �����ϰ� ���� ������ �Է��ϼ���!";
		int temp=0;
		System.out.println("������ �����մϴ�!"); allAddress(list);
		System.out.println(tmp);
		temp=sc.nextInt();
		System.out.println("�ø� �Է�"); list.get(temp-1).si = sc.next(); 
		System.out.println("���� �Է�"); list.get(temp-1).gu = sc.next();
		System.out.println("���� �Է�"); list.get(temp-1).dong = sc.next();
		System.out.println("������ �Է�"); list.get(temp-1).bunji = sc.nextInt();
	}
	protected void delete(ArrayList<Address2> list) {
		String tmp =""; int cnt=0;
		System.out.println("�����ϰ� ���� �� �̸��� �Է��ϼ��� (ex: ������)");
		tmp = sc.next();
		Iterator<Address2> it = list.iterator();
		while(it.hasNext()) {
			if (it.next().dong.equals(tmp)) {
				System.out.println("�� �� �����ϰ� �Ǹ� ����ų �� �����ϴ�. �׷��� �����Ͻðڽ��ϱ�? (Y/N)");
				tmp = sc.next();
				if(tmp.equalsIgnoreCase("y")) {
					it.remove(); //iterator���� ���� ÷�ڰ� ����Ű�� �ִ� ��ü ���� 
					break;
				}else {
					System.out.println("������ ����մϴ�!"); break;
				}
			} cnt++;
			if(cnt==list.size()) System.out.println("�ش��ϴ� ���� ���ų� �߸��Է��ϼ̽��ϴ�.");
		}
	}
	protected void allAddress(ArrayList<Address2> list) {
		int i=0;
		System.out.println("����\t"+"��\t"+"��\t"+"��\t"+"����");
		for (Address2 address : list) {
			i++;
			System.out.print(" "+i);
			System.out.println(address);
		}
	}
	
	@Override
	public String toString() {
		return "\t" + si + "\t" + dong + "\t"+gu+"\t"+bunji;
	}
	
}
//�޴�(����ڿ��� �������� view)�� ���� ������ ���� �ʿ䰡 ������..
class Menu extends Address2{
	public static Scanner sc = new Scanner(System.in);
	private static Menu menu = null; //static������ menu ��ü �ʱ�ȭ, �޸𸮿� ���� �ø���.

	private Menu(){}
	//�ۿ��� menu�� ����Ϸ��� getInstance�޼��带 ����ϴ� �� �ܿ� �Ұ����ϴ�.
	public static Menu getInstance() {
		if(menu == null) { 
			menu = new Menu(); //���ʻ�����, static�� ����Ͽ� �޸𸮿� ���� �÷ȴ� menu�� ��ü�� �������.
		}
		return menu; //menu�� null �� �ƴ϶��, ���ʻ����� �ƴϴϱ� �޸𸮿� �̹� �ö��ִ� ��ü menu�� ������
	}
	void menu(ArrayList<Address2> list) {
		int tmp = 0;
		ArrayList<Address2> c_List = list;
		while(tmp!=7) {
			System.out.println("=====�ּҰ����ý���=====");
			System.out.println("1. Create\n2. Read\n3. Update\n4. Delete\n5. Insert\n6. Read-All-Address\n7. Exit");
			try {
				tmp = sc.nextInt();
				if(tmp < 8 && tmp > 0) {
					switch(tmp) {
					case 1: list.add(rt_New()); break;
					case 2: searchDong(list); break;
					case 3: update(list); break;
					case 4: delete(list); break;
					case 5: insertDong(list); break;
					case 6: allAddress(list);
					}
				}else {
					throw new MyException("�޴��� �´� ��ȣ�� �Է����ּ���");
				}
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
@SuppressWarnings("serial")
class MyException2 extends Exception{
	public MyException2(String message) {
		super(message);
	}
	
}
public class AddressMain_������ {

	public static void main(String[] args) {
		ArrayList<Address2> list = new ArrayList<Address2>();
		list.add(new Address2("�����","������","������",100));
		Address2 std2 = new Address2("�����","���ʱ�","���ʵ�",110);
		list.add(std2);

		Menu.getInstance().menu(list);;
		
		
		
		//System.out.println(list); //Ȯ�ο�
	}

}

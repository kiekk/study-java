package addressHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/*
 	주소찾기
 	기본 2줄 주소 입력해놓기
 	서울시 강남구 강남동 111, 서울시 서초구 서초동 222
 	3번째 부터는 추가가능
 	
 	모델 클래스 만들기 Address
 	
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
		System.out.println("찾고싶은 번지의 동을 입력해주세요 (ex: 강남동)");
		tmp = sc.next();
		for (Address2 address : list) {
			if(address.dong.equals(tmp)) {
				System.out.println(address.dong +"은 "+address.bunji+"번지 입니다.");
			}
		}
	}
	protected Address2 rt_New() {
		String nSi="",nGu="",nDong="";
		int nBunji=0;
		System.out.println("시를 입력"); nSi = sc.next();
		System.out.println("구를 입력"); nGu = sc.next();
		System.out.println("동을 입력"); nDong = sc.next();
		System.out.println("번지를 입력"); nBunji = sc.nextInt();
		return new Address2(nSi, nGu, nDong, nBunji);
		
	}
	protected void insertDong(ArrayList<Address2> list) {
		String tmp="위 표를 참고하시어 삽입하고 싶은 순번을 입력하세요!";
		int temp=0;
		System.out.println("정보를 추가합니다!");
		allAddress(list);
		System.out.println(tmp);
		temp= sc.nextInt();
		
		list.add(temp-1, rt_New()); //표 순번은 1부터 시작합니다.
	}
	protected void update(ArrayList<Address2> list) {
		String tmp="위 표를 참고하시어 수정하고 싶은 순번을 입력하세요!";
		int temp=0;
		System.out.println("정보를 수정합니다!"); allAddress(list);
		System.out.println(tmp);
		temp=sc.nextInt();
		System.out.println("시를 입력"); list.get(temp-1).si = sc.next(); 
		System.out.println("구를 입력"); list.get(temp-1).gu = sc.next();
		System.out.println("동을 입력"); list.get(temp-1).dong = sc.next();
		System.out.println("번지를 입력"); list.get(temp-1).bunji = sc.nextInt();
	}
	protected void delete(ArrayList<Address2> list) {
		String tmp =""; int cnt=0;
		System.out.println("삭제하고 싶은 동 이름을 입력하세요 (ex: 강남동)");
		tmp = sc.next();
		Iterator<Address2> it = list.iterator();
		while(it.hasNext()) {
			if (it.next().dong.equals(tmp)) {
				System.out.println("한 번 삭제하게 되면 돌이킬 수 없습니다. 그래도 삭제하시겠습니까? (Y/N)");
				tmp = sc.next();
				if(tmp.equalsIgnoreCase("y")) {
					it.remove(); //iterator에서 현재 첨자가 가르키고 있는 객체 제거 
					break;
				}else {
					System.out.println("삭제를 취소합니다!"); break;
				}
			} cnt++;
			if(cnt==list.size()) System.out.println("해당하는 동이 없거나 잘못입력하셨습니다.");
		}
	}
	protected void allAddress(ArrayList<Address2> list) {
		int i=0;
		System.out.println("순번\t"+"시\t"+"구\t"+"동\t"+"번지");
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
//메뉴(사용자에게 보여지는 view)는 굳이 여러개 있을 필요가 없으니..
class Menu extends Address2{
	public static Scanner sc = new Scanner(System.in);
	private static Menu menu = null; //static형태의 menu 객체 초기화, 메모리에 먼저 올린다.

	private Menu(){}
	//밖에서 menu를 사용하려면 getInstance메서드를 사용하는 것 외엔 불가능하다.
	public static Menu getInstance() {
		if(menu == null) { 
			menu = new Menu(); //최초생성자, static을 사용하여 메모리에 먼저 올렸던 menu를 객체로 만들어줌.
		}
		return menu; //menu가 null 이 아니라면, 최초생성은 아니니까 메모리에 이미 올라가있는 객체 menu를 리턴함
	}
	void menu(ArrayList<Address2> list) {
		int tmp = 0;
		ArrayList<Address2> c_List = list;
		while(tmp!=7) {
			System.out.println("=====주소관리시스템=====");
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
					throw new MyException("메뉴에 맞는 번호를 입력해주세요");
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
public class AddressMain_이형준 {

	public static void main(String[] args) {
		ArrayList<Address2> list = new ArrayList<Address2>();
		list.add(new Address2("서울시","강남구","강남동",100));
		Address2 std2 = new Address2("서울시","서초구","서초동",110);
		list.add(std2);

		Menu.getInstance().menu(list);;
		
		
		
		//System.out.println(list); //확인용
	}

}

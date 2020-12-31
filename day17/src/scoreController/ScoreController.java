package scoreController;

import java.util.ArrayList;
import java.util.Scanner;
import score.StdScore;
import user.User;

public class ScoreController {
	static Scanner sc = new Scanner(System.in);
	ArrayList<StdScore> list = new ArrayList<StdScore>();
	//init(���θ޴�)
	public void init() {
		int select = -1;
		list.add(new StdScore("ȫ�浿","abcd","1234",50,78,92));
		list.add(new StdScore("������","gang","5678",66,76,83));
		list.add(new StdScore("�ڹ���","munsu","1357",72,80,92));
		list.add(new StdScore("���缮","jaesuck","2468",67,72,88));
		list.add(new StdScore("������","abcd","9876",82,90,75));
		StdScore tmp = null;
		tmp = new StdScore();
		while(select != 0) {
			System.out.println("���� ��ȸ ���α׷�");
			System.out.println("1.�л� �α���\n2.������ �α���\n3.ȸ�� ����\n0.���� �ϱ�");
			select = sc.nextInt();
			switch(select) {
			case 1: stdLogin(tmp);break;
			case 2: adminLogin();break;
			case 3: signUp(tmp);break;
			}//end select
		}//end while
	}
	//ȸ������ - 1
	void signUp(StdScore std) {
		while(true) {
			try {
				System.out.print("���̵�(����) : "); 
				std.setId(sc.next());
				System.out.print("��й�ȣ : "); 
				std.setPw(sc.next());
			} catch (Exception e) {
				System.out.println("������ �ٽ� �Է����ּ���.");
				continue;
			}
			if(join(std)){
				System.out.println("ȸ�� ���� ����");
				return;
			}else {
				System.out.println(std.getId()+"�� �ߺ� ���̵� �Դϴ�.");
			}
		}
	}
	//ȸ�� ���� - 2
	boolean join(StdScore std) {
		if(checkId(std.getId()) == null) {	
			encrypt(std.getPw());
			list.add(std);	
			return true;	
		}else {								
			return false;	
		} 
	}
	//�ߺ� �˻�
	StdScore checkId(String id) {
		StdScore std = null;
		for (StdScore tmp : list) {
			if(tmp.getId().equals(id)) {
				std = tmp;					
			}//end if
		}//end for
		return std;	
	}
	//��ȣȭ
	public String encrypt(String pw) {
		String enc_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			enc_pw += (char)(pw.charAt(i)*3) ;
		}
		return enc_pw;
	}
	//��ȣȭ
	public String decrypt(String enc_pw) {		
		String dec_pw="";
		for(int i = 0;i<enc_pw.length();i++) {
			dec_pw += (char)(enc_pw.charAt(i)/3);
		}
		return dec_pw;
	}
	//�л� �α���
	void stdLogin(StdScore tmp) {
		while(true) {
			try {
				System.out.print("���̵�(����) : "); 
				tmp.setId(sc.next());
				System.out.print("��й�ȣ : "); 
				tmp.setPw(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("������ �ٽ� �Է����ּ���.");
				continue;	
			}
		}
		StdScore log_Id = checkId(tmp.getId());
		if(log_Id != null) {
			if(list.get(list.indexOf(log_Id)).getPw().equals(tmp.getPw())) {
				System.out.println("�α��� ����");
				stdMenu(tmp);
			}
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���� �ּ���");
			System.out.println(list.get(list.indexOf(log_Id)).getPw().equals(tmp.getPw()));
		}
	}
	//�л� ������
	void stdMenu(StdScore std) {
		int select = -1;
		while(select != 0) {
		System.out.println("�޴�\n1.�� ���� Ȯ��\n2.�� ���� Ȯ��\n3.���� ��� Ȯ��\n4.���� ���� ����\n5.�����ڿ��� ���� ���� ��û\n6.Ż�� �ϱ�\n0.�ڷ� ����");
			select = sc.nextInt();
			switch(select) {
			case 1: System.out.println(std);break;				//1. ���� Ȯ��
			case 2: showMyScore();break;			//2. ���� Ȯ��
			case 3: showMyRank();break;				//3. ��� Ȯ��
			case 4: editMyInfo();break;				//4. ���� ����
			case 5: askAdminEditMyInfo();break;		//5. ���� ���� ��û
			case 6: signOut();break;				//6. Ż�� �ϱ�
			}
		}
	}
	//1. ���� Ȯ��
	void showMyInfo() {
		
	}
	//2. ���� Ȯ��
	void showMyScore() {
		
	}
	//3. ��� Ȯ��
	void showMyRank() {
		
	}
	//4. ���� ����
	void editMyInfo() {
		
	}
	//5. ���� ���� ��û
	void askAdminEditMyInfo() {
		
	}
	//6. Ż�� �ϱ�
	void signOut() {
		
	}
	void adminLogin(){
	}
	//������ ������
	void adminMenu() {

	}
	//�߰�
	//����
	//����
	//����
	//������ ������
	//1. �л� �߰�
	//2. �л� ����
	//3. �л� ����
	//4. ���� ����
	//5. ��û Ȯ��
	//0. �ڷΰ���
}

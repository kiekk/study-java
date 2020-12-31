package user;

import java.util.ArrayList;
import java.util.Scanner;

public class UserField {
	private ArrayList<User> list = new ArrayList<User>();
	private static final int KEY_CODE = 3;	//��ȣȭ, ��ȣȭ �� �� ����� Ű��
	//�ߺ� �˻�
	public User checkId(String id) {
		//����Ʈ ��� �߿��� id�� ������ ��, �Ű����� id�ϰ� ���մϴ�.
		//������ id�� �ִ� ��Ҹ� �߰��ϸ�, �� ��Ҹ� �����ϰ� �˴ϴ�.
		//������ null���� �����մϴ�.
		User user = null;
		for (User tmp : list) {
			//����Ʈ���� �ϳ��� �������⸦ �ݺ��մϴ�. ���� for��
			//��� �ϳ��� �����ö����� tmp�� ���� �ǰ�
			//tmp���� id�� ������ �ڿ�, �Ű����� id�ϰ� ���մϴ�.
			if(tmp.getId().equals(id)) {	//������ id�� �����ϸ�
				user = tmp;					//�� �ν��Ͻ�(tmp)�� ��ȯ�մϴ�.
			}//end if
		}//end for
		return user;	//������ id���� ���ٸ� null���� ��ȯ�˴ϴ�.
	}
	//ȸ�� ����
	public boolean join(User user) {
		//ȸ�������� �ȵǴ� ���
		//1. id�� ���̰ų� �� ���ڿ�
		if(checkId(user.getId()) == null) {	//checkId() �޼���� ������ ���̵� �ִٸ�
			//�� ��ü�� �ְ�, ������ ���̵� ���ٸ�
			//null ��ü�� ��ȯ�մϴ�.
			//null�̱� ������ -> ������ ��ų �� �ֽ��ϴ�. list.add(�ش� �ν��Ͻ�)
			//list.add(user)�ϱ����� pw�� ��ȣȭ �մϴ�. ������ ������ �����ؼ� �˾ƺ��� ���� �������� pw�� ������Ѿ� �մϴ�.
			user.setPw(encrypt(user.getPw()));

			list.add(user);	//���� ������
			return true;	//ȸ������ ����	
		}else {								
			return false;	//ȸ������ ����(ID�� �ߺ�)-checkId�޼��带 ���ؼ� Ȯ��-checkId�� returnŸ���� UserŸ��
			//�ν��Ͻ��� ������ ȸ������ ���� ���θ� Ȯ���ϴ� �� �Դϴ�.
		} 
	}
	//�α���
	public boolean login(String id,String pw) {
		User log_Id = checkId(id);
		if(log_Id != null) {
			//�н����� ��
			//����Ʈ�� �ִ� getPw()�� �Ű����� pw�� ���ؾ� �մϴ�.
			//������ ����Ʈ�� �ִ� getPw()�� enc �� pw�Դϴ�.
			//���� �Ű����� pw�� ���ϱ� ���� ���� pw�� decrypt() �޼��带 ���� ��ȣȭ ����� �մϴ�. 
			
			//1. list���� checkId�� ���� �� ��ü�� ����� �ִ��� �ε��� �� ����
			//2. �� �ν��Ͻ����� pw�� �����ɴϴ�.
			//3. �� pw�� decrypt�մϴ�.
			//4. decrypt�� �����͸� pw�� ���մϴ�.
			//1~4���� �ѹ������� if���� �ۼ��˴ϴ�.
			if(decrypt(list.get(list.indexOf(log_Id)).getPw()).equals(pw))
				return true;
		}
		return false;	//�α��� ���� 1.id�� ���� �� 2.id�� �Է��� pw�� �ٸ� ��
	}
	//��ȣȭ
	public String encrypt(String pw) {
		String enc_pw = "";
		//pw�� ����ִ� ���� pw�� Ư�� ���� �ο��ؼ� ��ȯ��ŵ�ϴ�.
		//pw�� ���ڿ��� ���ڴ����� �߶󳻼�, �� Ư����(key��)�� �����Ű�� �˴ϴ�.
		//���ڴ����̱� ������ �ڵ尪�� �ִµ�, �ڵ尪���� Ű���� ����Ǿ�
		//���ڿ��� �����Ű�� �����ϰ��� �ϴ� ��ȣ������ ó���˴ϴ�.
		//�̶�, key���� "��ȣȭ" �� ���� �ʿ��ϴϱ�
		//�ν��Ͻ� ����� �� �����ϴ�.
		//pw�� ���ڿ��� ���ڴ����� �����ͼ� KEY_CODE�� ���մϴ�.
		//enc_wp�� �����ŵ�ϴ�.
		for (int i = 0; i < pw.length(); i++) {
			enc_pw += (char)(pw.charAt(i)*KEY_CODE) ;
		}
		System.out.println("���� ��ȣ : "+pw+"\tenc��ȣ : "+enc_pw);
		return enc_pw;
	}
	//��ȣȭ
	public String decrypt(String enc_pw) {		
		//		String dec_pw;	dec_pw���� null���� ���µ�, �̶� "1234"���ڿ��� +=������ �� ��� null1234�� null���� �Էµ˴ϴ�.
		String dec_pw="";
		for(int i = 0;i<enc_pw.length();i++) {
			dec_pw += (char)(enc_pw.charAt(i)/KEY_CODE);
		}
		System.out.println("end��ȣ : "+enc_pw+"\tdec��ȣ : "+dec_pw);
		return dec_pw;
	}
	//����, �޴�
	public void init() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		//���ο� ȸ�� ���� �Է�
		//ȸ�� ���̵� �˻� ��
		User user = null;
		while(true) {
			user = new User(); //�ݺ��� �ȿ��� ��� �ν��Ͻ��� �����ϱ� ������ �޸� ���� �߻��մϴ�.
			System.out.println("1.ȸ������\n2.�α���\n3.����");
			choice = sc.nextInt();
			switch(choice) {
			case 1: //ȸ������ - id,pw
				//�Է½� ������ �� �� �ֽ��ϴ�.(NumberFor....)
				//�� ��, ���α׷��� �ߴ� �� �� �ֱ� ������
				//�̿��� �ߴ��� ������ŵ�ϴ�. -> try catch�� �����մϴ�.
				try {
					System.out.print("���̵�(����) : "); 
					user.setId(sc.next());
					System.out.print("��й�ȣ : "); 
					user.setPw(sc.next());
					//					System.out.println(user); ������ ����� �Էµƴ��� Ȯ���ϱ� ���� ��¹�
				} catch (Exception e) {
					System.out.println("������ �ٽ� �Է����ּ���.");
					continue;	//ù �޴��� ���ư���
				}
				//�Էµ� ������ user��ü�� ����ֽ��ϴ�.
				//�� ��ü�� join()�� ������ ȸ�� ���� ���� ���θ� �Ǵ��մϴ�.
				if(join(user)){
					System.out.println("ȸ�� ���� ����");
				}else {
					System.out.println(user.getId()+"�� �ߺ� ���̵� �Դϴ�.");
				}
				break;
			case 2: //�α���
				//1. id pw �Է�
				//2. list�ϰ� ��(login�޼���� ó��)
				//3. login�޼��忡 id,pw�� �Ű������� ����
				//4. list�� id,pw�� �Ű������� id,pw�� equals�� ��
				//5. checkId�޼��� �̿��Ͽ� id�� ��
				//6. pw�� decrypt�Ͽ� ��
				try {
					System.out.print("���̵�(����) : "); 
					user.setId(sc.next());
					System.out.print("��й�ȣ : "); 
					user.setPw(sc.next());
				} catch (Exception e) {
					System.out.println("������ �ٽ� �Է����ּ���.");
					continue;	//ù �޴��� ���ư���
				}
				//�Էµ� ������ user��ü�� ����ֽ��ϴ�.
				//�� ��ü�� join()�� ������ ȸ�� ���� ���� ���θ� �Ǵ��մϴ�.
				if(login(user.getId(),user.getPw())){
					System.out.println("�α��� ����");
				}else {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���� �ּ���");
				}
				break;
			}
			if(choice == 3)break;
		}//end while
		System.out.println("���α׷��� �����մϴ�.");
	}
}

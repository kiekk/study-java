package scanEx;

import java.util.ArrayList;

//��Ʈ�ѷ�
public class ScoreControl {
	ArrayList<Student> stdList = new ArrayList<>();
	int kT = 0,eT = 0,mT = 0, cnt = 0;
	//�߰�
	void add(int bun,String stdName,int kS,int eS,int mS) {
		//student Ÿ������ ��ü ������ ��
		//stdList�� add()��Ű�� �˴ϴ�.
		Student std = new Student(bun,stdName,kS,eS,mS);
		stdList.add(std);
		kT += kS;
		eT += eS;
		mT += mS;
		cnt++;
	}
	//��� ����
	void outputScoreList() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		//stdList�� �ִ� �����͸� ����� �ݴϴ�.
		//�̶�, ���� ������ ��յ� ����մϴ�.
		//���� ���� : 000�� / ��� : 000��
		//���� ���� : 000�� / ��� : 000�� 
		//���� ���� : 000�� / ��� : 000��
		for(Student a : stdList) {
			System.out.println(a);
		}
		System.out.println("���� ���� : "+kT+"��\t���� ��� : "+kT/(double)cnt+"��");
		System.out.println("���� ���� : "+eT+"��\t���� ��� : "+eT/(double)cnt+"��");
		System.out.println("���� ���� : "+mT+"��\t���� ��� : "+mT/(double)cnt+"��");
	}
}

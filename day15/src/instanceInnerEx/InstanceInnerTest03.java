package instanceInnerEx;

import java.io.File;

class InputOut{
	
	File path = new File("C:\\�ٿ�ε�");
	Input in = new Input();
	Output out = new Output();
		
	//���� Ŭ�������� �޼��常 �� �����Ǿ� ������, �޼��� ������ ������� �ֽ��ϴ�.
	//����, ���� Ŭ������ �̿��� �� ��ɺ��� ������ ������ ������,
	//������ Inputout Ŭ������ ���θ� ������ �� �ֽ��ϴ�.
	//�ܺο�(Inputout) ����� ���� path�� ���� Ŭ�������� �������� ������ �� �� �ִ� �����Դϴ�.
	
	//�Էºκ�, ��ºκ� �޼��带 ��Ȯ�ϰ� ������ �� �ֽ��ϴ�.
	class Input{
		void �����Է�() {
			System.out.println("InputŬ������ �����Է¸޼��� ȣ��, ��� : "+path);
		}
		void ����Char�Է�() {}
		void ����Inter�Է�() {}
	}
	class Output{
		void ����Char���() {
			System.out.println("OutputŬ������ ����Char���()�޼��� : " +path+"����Դϴ�.");
		}
		void ����Integer���() {}
		void ����Writer���() {}
	}
}
public class InstanceInnerTest03 {

	public static void main(String[] args) {
		InputOut io = new InputOut();
		io.in.�����Է�();
		io.out.����Char���();
	}
}









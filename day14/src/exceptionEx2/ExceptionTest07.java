package exceptionEx2;

import java.io.IOException;

/*
 	throw ���� �߻�(����)
 	- �޼��� ���ο��� ���ܸ� �߻���Ű���� �� �� ����ϴ� Ű�����Դϴ�.
 	- ����� ���� ���� Ŭ������ ���� throw�� ������� �˾ƺ��ϴ�.
 */
//����� ���� ����Ŭ���� : Exception���κ��� ��� �޾� ����ϴ�.
class MyException extends Exception {
	public MyException(String msg) {
		//�θ𿡰� msg�� �������ݴϴ�. -> �θ� ���� �ִ� getMessage() �޼��尡 msg�� ����� �� �� �ֽ��ϴ�.
		super(msg);
	}
}
public class ExceptionTest07 {

	public static void main(String[] args) /*throws IOException*/ {
		
		try {
			//���ܰ� �߻��� �ҽ� ����
			int a = -1;
			if(a <= 0) {	//�ش� ��Ȳ�� �߻��ϰ� �Ǹ�
				//a�� 0�̰ų� �����̸�, ���ܸ� �߻����� ���ϴ�.
				//���������� ��Ȳ�� ���յǸ�, ���ܸ� �Ϻη� �߻���ŵ�ϴ�.
				throw new MyException("����� �ƴմϴ�.");
			}else {
				throw new IOException();
			}
		}catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException e) {				//catch���� �ۼ��ϸ� main�޼��忡 throws�� �����ص� �ǰ�
											//main�޼��忡 throws�� �ۼ��ϸ� catch���� �����ص� �˴ϴ�.
		}
	}

}

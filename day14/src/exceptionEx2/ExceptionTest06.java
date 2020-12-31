package exceptionEx2;

import java.io.IOException;

/*
 	throws �����̸�
 	-���� ������ �޼��� ���� �� �����غ��ϴ�.
 	-ȣ���ϴ� �ʿ����� ���� �׸� ���� try catch() ���� ����� �ش� �޼��带 �����ϰ� ����� �� �ְ� �˴ϴ�.
 	
 	-���� �߻��� ���� �ҽ� ���簡 �ʿ��� ���� try-catch ���� ���� catch()�� �ʿ��� �ҽ��� �����մϴ�.
 	-���� �߻��� ��ġ������ �ʿ���� ���� throws �� ���ؼ� ���ܻ����� �����ϴ�.
 */
class CharInput{
	int nInput = 0;
	public char getInput() throws IOException {
		
		nInput = System.in.read();	//Scanner ��ſ� System.in ��ü�� �̿��� ���� �Է¹޽��ϴ�. 
		
		return (char)nInput;
	}
}
public class ExceptionTest06 {

	public static void main(String[] args) {
		try {
			System.out.println(new CharInput().getInput());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

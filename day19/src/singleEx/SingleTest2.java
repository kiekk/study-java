package singleEx;

import java.awt.Toolkit;
import java.util.Calendar;

/*
 	�̱��� ����
 	�ν��Ͻ��� �ϳ��� ���� ����ؾ� �� �� �����ϴ� ��
 	"�ν��Ͻ� �������"
 	- �����ڴ� �ܺο� �����Ű�� �ȵ˴ϴ�.
 	 	Type type = new Type();	����
 	 	-private ���� �����ڷ� �����ڸ� ������ �մϴ�.
 	- ����Ÿ���� �ν��Ͻ� ��ü�� static���� ������ �մϴ�.
 	- ���� �޼��带 static public���� ������Ѿ� �մϴ�.
 	- ���� �޼����(Ŭ���� �޼���, ����ƽ �޼���)����
 			��ü�� �ν��Ͻ� ���θ� �Ǵ� �� ��
 			�ν��Ͻ��� ������ ���� �ν��Ͻ��� ���Ͻ�Ű��,
 			�ν��Ͻ��� ������(null) �����ڸ� ����
 			������ �ν��Ͻ��� ���Ͻ��� �ָ� �˴ϴ�.
 */
public class SingleTest2 {

	public static void main(String[] args) {
		//new Toolkit();   //�ν��Ͻ��� �������� ���ϵ��� �����ڸ� ���Ƴ����ϴ�.
						   //abstract �Ǵ� �����ڸ� private������ ���Ƴ����ϴ�.
						   //���, Ư�� �޼��� �ϳ��� ����
						   //�ν��Ͻ��� ������ �� �ֵ��� �մϴ�.
		Toolkit tool = Toolkit.getDefaultToolkit();
		//getDefaultToolkit() �޼��帣 ����, �ν��Ͻ��� ����� �°�,
		//tool ��ü�� ����, Toolkit Ŭ������ �޼��带 ����� �� �ְ� �ƽ��ϴ�.
		Calendar cal = Calendar.getInstance();

	}

}

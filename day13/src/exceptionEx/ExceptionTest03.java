package exceptionEx;
/*
 	���� ��Ȳ�� ����� ���ϴ�.
 	�迭�� ���õ� ����
 */
public class ExceptionTest03 {

	public static void main(String[] args) {
		int [] var = {10, 200, 3000};
		try {
			for(int i = 0;i<var.length+1;i++) {
				System.out.println("var["+i+"] : "+var[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ �Ѿ����ϴ� : "+e.getMessage());
		}

		System.out.println("���α׷� ��ӵ˴ϴ�.");			
	}

}

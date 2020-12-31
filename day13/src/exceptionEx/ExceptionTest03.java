package exceptionEx;
/*
 	예외 상황을 만들어 봅니다.
 	배열과 관련된 예외
 */
public class ExceptionTest03 {

	public static void main(String[] args) {
		int [] var = {10, 200, 3000};
		try {
			for(int i = 0;i<var.length+1;i++) {
				System.out.println("var["+i+"] : "+var[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 넘었습니다 : "+e.getMessage());
		}

		System.out.println("프로그램 계속됩니다.");			
	}

}

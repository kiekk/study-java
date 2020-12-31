package exceptionEx2;

import java.io.IOException;

/*
 	throw 예외 발생(생성)
 	- 메서드 내부에서 예외를 발생시키고자 할 때 사용하는 키워드입니다.
 	- 사용자 정의 예외 클래스를 만들어서 throw의 사용방법을 알아봅니다.
 */
//사용자 정의 예외클래스 : Exception으로부터 상속 받아 만듭니다.
class MyException extends Exception {
	public MyException(String msg) {
		//부모에게 msg를 전달해줍니다. -> 부모가 갖고 있는 getMessage() 메서드가 msg를 출력해 줄 수 있습니다.
		super(msg);
	}
}
public class ExceptionTest07 {

	public static void main(String[] args) /*throws IOException*/ {
		
		try {
			//예외가 발생할 소스 기재
			int a = -1;
			if(a <= 0) {	//해당 상황이 발생하게 되면
				//a가 0이거나 음수이면, 예외를 발생시켜 봅니다.
				//인위적으로 상황에 부합되면, 예외를 일부러 발생시킵니다.
				throw new MyException("양수가 아닙니다.");
			}else {
				throw new IOException();
			}
		}catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException e) {				//catch문을 작성하면 main메서드에 throws를 생략해도 되고
											//main메서드에 throws를 작성하면 catch문을 생략해도 됩니다.
		}
	}

}

package instanceInnerEx;

import java.io.File;

class InputOut{
	
	File path = new File("C:\\다운로드");
	Input in = new Input();
	Output out = new Output();
		
	//내부 클래스없이 메서드만 쭉 나열되어 있으면, 메서드 관리에 어려움이 있습니다.
	//따라서, 내부 클래스를 이용해 그 기능별로 영역을 구분해 놓으면,
	//복잡한 Inputout 클래스의 내부를 정리할 수 있습니다.
	//외부에(Inputout) 만들어 놓은 path는 내부 클래스에서 공통으로 가져다 쓸 수 있는 변수입니다.
	
	//입력부분, 출력부분 메서드를 명확하게 구분할 수 있습니다.
	class Input{
		void 파일입력() {
			System.out.println("Input클래스의 파일입력메서드 호출, 경로 : "+path);
		}
		void 파일Char입력() {}
		void 파일Inter입력() {}
	}
	class Output{
		void 파일Char출력() {
			System.out.println("Output클래스의 파일Char출력()메서드 : " +path+"경로입니다.");
		}
		void 파일Integer출력() {}
		void 파일Writer출력() {}
	}
}
public class InstanceInnerTest03 {

	public static void main(String[] args) {
		InputOut io = new InputOut();
		io.in.파일입력();
		io.out.파일Char출력();
	}
}









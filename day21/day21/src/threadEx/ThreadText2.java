package threadEx;
/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)은 하나의 쓰레드 이상을 가지고 있습니다.
 	
 	병렬처리
 	- 두 작업(메서드, 또는 객체) 이 동시에 실행될 수 있게 합니다.
 */
class ThreadEx1 extends Thread{
	public ThreadEx1(String name) {
		super(name);
	}
	@Override
	public void run() {
		//쓰레드 이름을 붙일 때, 생성자를 통해서 super에게 이름을 알려줍니다.
		System.out.println(this.getName());
		
		//쓰레드는 기본적으로 이름이 없기 때문에, 생성순서별로 숫자를 부여해서 객체단위로 구분합니다. Thread-0
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadText2 {
	public static void main(String[] args) {
		ThreadEx1 th = new ThreadEx1("쓰레드-1");
		th.start();
		
	}
}

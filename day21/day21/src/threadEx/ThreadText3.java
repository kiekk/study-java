package threadEx;
/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)은 하나의 쓰레드 이상을 가지고 있습니다.
 	
 	join()
 	- join() 호출한 쓰레드가 종료할 때까지, 진행하던 쓰레드를 중단하게 됩니다.
 	
 	
 */
class MyThreadJoin implements Runnable{
	@Override
	public void run() {
		System.out.println("run 메서드 실행");
		first();
	}
	private void first() {
		System.out.println("first메서드 실행");
		second();
	}
	private void second() {
		System.out.println("second메서드 실행");
	}
}

public class ThreadText3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" : main이 시작되었습니다.");
		
		//join시킬 객체 생성
		Runnable r =new MyThreadJoin();
		Thread th = new Thread(r);
		//th객체가 main 쓰레드를 종료하기 전에 join이 됩니다.
		th.start();
		//기존 쓰레드를 종료시키지 않고 pause 시키게 됩니다.
	
		System.out.println(Thread.currentThread().getName()+" : main이 종료되었습니다.");
		try {
			//join()을 모두 마친 후에, 기존 Thread가 재시작 합니다.
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

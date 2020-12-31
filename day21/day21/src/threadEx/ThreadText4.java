package threadEx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	프로세스 내부에 작업단위
 	최소한 하나의 프로세스(응용프로그램)은 하나의 쓰레드 이상을 가지고 있습니다.

 	Thread를 이용해서 대화하기! - 병렬처리

 	콘솔창이 대화창
 	A : JOptionPane에서 대화를 입력합니다.
 	B : Scanner를 이용해서 콘솔창에서 입력합니다.

 */
class Host extends Thread {
	public Host(String name) {
		super(name);
	}

	@Override
	public void run() {
		String idA = "";
		System.out.println(this.getName()+"님이 로그인 하였습니다.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			idA = sc.nextLine();
			if(idA.equalsIgnoreCase("q")) break;
			System.out.println(this.getName()+" : "+idA);
		}
		System.out.println(this.getName()+"님이 대화창을 나가셨습니다.");
	}//end run
}//end Host
class Guest extends Thread {
	public Guest(String name) {
		super(name);
	}
	@Override
	public void run() {
		String idB = "";
		System.out.println(this.getName()+"님이 로그인 하였습니다.");
		while(true){
			JOptionPane jop = new JOptionPane();
			idB = jop.showInputDialog(this.getName()+"님 대화");
			if(idB.equalsIgnoreCase("q")) break;
			System.out.println(this.getName()+ " : "+idB);
		}
		System.out.println(this.getName()+"님이 대화창을 나가셨습니다.");
	}//end run
}//end Guest
public class ThreadText4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id1 = "";
		String id2 = "";
		System.out.println("Host의 ID를 입력해 주세요"); id1 = sc.next(); 
		System.out.println("Guest의 ID를 입력해 주세요"); id2 = sc.next();
		new Host(id1).start();
		new Guest(id2).start();
		
	}
}

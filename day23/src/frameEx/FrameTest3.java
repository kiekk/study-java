package frameEx;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
public class FrameTest3 {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		JFrame jf = new JFrame("세번째 - 모니터 중앙 좌표에 프레임 그리기");
//		System.out.println(tk.getScreenSize());
		Dimension di = tk.getScreenSize();
		//모니터의 크기
		int width = di.width;
		int height = di.height;
		//JFrame의 크기
		jf.setSize(400, 300);
		//JFrame의 위치를 모니터 정중앙에 오게 하기
		int x = (width-jf.getWidth())/2;
		int y = (height-jf.getHeight())/2;
		jf.setLocation(x,y);
		jf.setVisible(true);
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

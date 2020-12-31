package frameEx;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
public class FrameTest3 {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		JFrame jf = new JFrame("����° - ����� �߾� ��ǥ�� ������ �׸���");
//		System.out.println(tk.getScreenSize());
		Dimension di = tk.getScreenSize();
		//������� ũ��
		int width = di.width;
		int height = di.height;
		//JFrame�� ũ��
		jf.setSize(400, 300);
		//JFrame�� ��ġ�� ����� ���߾ӿ� ���� �ϱ�
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

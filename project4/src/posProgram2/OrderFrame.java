package posProgram2;
import javax.swing.JFrame;

public class OrderFrame extends JFrame {
	public OrderFrame(Customer tmp) {
		Customer userData = tmp;
		setTitle("Order Page");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setContentPane(new OrderPanel(userData));

		setSize(850,800);
		setVisible(true);
	}
}

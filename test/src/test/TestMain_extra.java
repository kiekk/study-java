package test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyJFrame extends JFrame{
	JPanel jpPlay;
	JButton btnPlay=new JButton("End로 고고");	//end 패널로 가자
	
	final static JPanel jpEnd = new JPanel();
	JButton btnEnd=new JButton("Start로 고고");		//start패널로 가자
	
	
	public MyJFrame() {
		setBounds(200, 200, 500, 500);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.YELLOW);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(btnPlay);
		
		btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("start");
				jpEnd.setBackground(Color.GREEN);
				//jpEnd.set
				jpEnd.setVisible(true);
				
				
				
				
			}
		});
		
		/*jpEnd = new JPanel();
		jpEnd.setBackground(Color.GREEN);
		jpEnd.add(btnPlay);
		//jpEnd.setVisible(true);
		
		jpPlay = new JPanel();
		jpPlay.setBackground(Color.MAGENTA);
		jpPlay.add(btnEnd);
		jpPlay.setVisible(true);
		
		add(jpPlay);
		add(jpEnd);*/
		
		/*btnPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//repaint();
				System.out.println("start 버튼");
				setContentPane(jpEnd);
				jpEnd.setBackground(Color.GREEN);
				System.out.println("start2 버튼");
				jpEnd.setVisible(true);
				
			}
		});*/

		
		
		/*addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getModifiers() == MouseEvent.BUTTON1_MASK) {
					System.out.println("1111");
					jp1=new JPanel();
					JButton btn = new JButton("패널1 버튼");
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("3333");
							jp2=new JPanel();
//							invalidate();
							jp2.setBackground(Color.MAGENTA);
							add(jp2);
							setVisible(true);
							jp2.setVisible(false);
							
							
						}
					});
					jp1.add(btn);
					invalidate();
					jp1.setBackground(Color.GREEN);
					add(jp1);
					setVisible(true);
					
				}else if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					System.out.println("3333");
					jp2=new JPanel();
					JButton btn = new JButton("패널2 버튼");
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("3333");
							jp2=new JPanel();
							invalidate();
							jp2.setBackground(Color.GREEN);
							add(jp1);
							setVisible(true);
							
						}
					});
//					invalidate();
					jp2.add(btn);
					jp2.setBackground(Color.MAGENTA);
					add(jp2);
					setVisible(true);
					
				}
			}
		});
		*/
	}
}
public class TestMain_extra {

	public static void main(String[] args) {
		new MyJFrame();

	}

}

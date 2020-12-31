package componentEx;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

import javax.swing.JOptionPane;

/*
 	TextField : 문장 한줄 입력 - TextListener, KeyListener
 	TextArea  : 문장 여러줄 입력 - 
	Panel : Container - FlowLayout

	------------------------------
			  North : Panel(TextField, button)

			  Center : TextArea

			  South : Panel(저장, reset, 종료 버튼 + 불러오기)
 */
/*
 	부품들(TextField, button등을 먼저 하나의 panel에 추가하여 만들어놓습니다.)
 	그리고 그 panel을 frame에 add합니다.
 */
public class ComponentText {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(500, 100, 600, 400);
		f.setBackground(Color.CYAN);
		Font font = new Font("gulim",Font.PLAIN,20);		//글씨체
		//#1. 북쪽
		Panel p_north = new Panel();		//기본 layout이 FlowLayout
		p_north.setBackground(Color.GREEN);
		//#1-1. 텍스트 필드, 버튼
		TextField tf = new TextField("",10);		//10은 텍스트필드의 길이를 조절할 때 쓰는 매개변수
		//지금은 FlowLayout을 따라가기 때문에 너비를 조절할 수 없습니다.
		//글자의 크기나 폰트 등으로 컬럼갯수가 일정하게 잡히진 않습니다.
		Button btn = new Button("입력");
		btn.setEnabled(false);	//버튼의 click을 비활성화
		p_north.add(tf);
		p_north.add(btn);
		p_north.setFont(font);
		//#2. 중앙
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);	//수직 스크롤바만 지원하겠다.
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false); 		//수정불가능
		//#3. 남쪽
		Panel p_south = new Panel();
		p_south.setFont(font);
		p_south.setBackground(Color.MAGENTA);
		Button btnSave = new Button("저장");
		Button btnReset	= new Button("초기화");
		Button btnClose = new Button("닫기");
		Button btnOpen = new Button("불러오기");
		p_south.add(btnSave);
		p_south.add(btnClose);
		p_south.add(btnReset);
		p_south.add(btnOpen);
		//구성품 붙이기
		f.add(p_north,BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(p_south, BorderLayout.SOUTH);
		f.setVisible(true);
		f.setResizable(false);		//사이즈 조정 불가능
		//#5. 이벤트
		//# TextField에 입력된 값이 없을 경우 입력버튼은 비활성화(false), 입력된 값이 있어야지만 활성화(true)
		// tf에서 getText()로 문자열을 불러온 후, equals("") 빈 문자열과 비교합니다.
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		//#5-2. tf에 엔터값이 감지되면, ta(TextArea)에 내용을 추가합니다.
		//이 때, 엔터값까지 추가를 해야 다음줄로 바뀌게 됩니다.
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//1. 키보드를 누르는 이벤트가 발생이 됩니다.
				//2. 그럼 어떤 키보드를 눌렀는지 e 객체에게 물어봐야 합니다.
				//3. 이후 키보드값으로 매칭되어 있는 상수와, e객체로 가져온 값을 비교합니다.
				// (e객체로 가져온 값 : 엔터 == 엔터와 매칭되어 있는 상수값 비교)
				//4. tf의 문자를 가져와서 ta 객체에 추가 시킵니다.(추가할때 \n까지 포함)
				//5. 그 후, tf에 내용을 지웁니다.
				//한글자 단위로 계속 이벤트가 발생합니다.
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");	//줄바꿈인 개행문자도 같이 추가
					//set -> X
					tf.setText("");				//tf는 다시 초기화
				}
			}
		});
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!tf.getText().equals("")) {
					ta.append(tf.getText()+"\n");	//줄바꿈인 개행문자도 같이 추가
					//set -> X
					tf.setText("");				//tf는 다시 초기화
					//tf로 커서를 다시 옮깁니다.
					tf.requestFocus();
				}
			}
		});
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//닫기 전에 저장여부를 물어봅니다.
				int select = JOptionPane.showConfirmDialog(f, "저장하시겠습니까", "종료", JOptionPane.YES_NO_OPTION);
				if(select == JOptionPane.YES_OPTION) {
					try {
						FileDialog fd = new FileDialog(f,"저장",FileDialog.SAVE);
						fd.setVisible(true);	//먼저 해당 내용을 보여준 뒤, 하위 내용을 시작합니다.
						//상위경로			파일명
						String path = fd.getDirectory() + fd.getFile();
						String msg = ta.getText();
						if(!msg.equals("")) {
							//위에 지정된 path에 쓰기를 해야 하는데
							//한글 깨짐 등의 문제로 char 스트림을 이용해 적습니다.
							FileWriter fw = new FileWriter(path);
							BufferedWriter bw = new BufferedWriter(fw);
							bw.write(msg);
							if(fd.getFile() != null) {
								JOptionPane.showMessageDialog(f, path+"\n경로에 저장 성공");
							}
							bw.flush();	//bw에 있는 모든 내용을 비웁니다.
							//혹시 버퍼 초과 용량 때문에 다 "쓰기"를 못할 수도 있습니다.
							//버퍼에 남아 있다면, 모든 문자를 파일에 "쓰기" 합니다.
							if(bw!=null) bw.close();
							if(fw!=null) fw.close();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(f, "종료 합니다.");
					System.exit(0);					
				}
			}
		});
		//저장 버튼
		//1. ta에 있는 모든 글자를 저장해 놓습니다.
		//2. 저장할 경로를 물어봅니다 -> FileDialog 컨테이너 사용
		//3. 파일입출력 -> 바이트스트림(x) ==> char 스트림(문자열 전용 스트림)
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f,"저장",FileDialog.SAVE);
					fd.setVisible(true);	//먼저 해당 내용을 보여준 뒤, 하위 내용을 시작합니다.
					//상위경로			파일명
					String path = fd.getDirectory() + fd.getFile();
					String msg = ta.getText();
					if(!msg.equals("")) {
						//위에 지정된 path에 쓰기를 해야 하는데
						//한글 깨짐 등의 문제로 char 스트림을 이용해 적습니다.
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(msg);
						if(fd.getFile() != null) {
							JOptionPane.showMessageDialog(f, path+"\n경로에 저장 성공");
						}
						bw.flush();	//bw에 있는 모든 내용을 비웁니다.
						//혹시 버퍼 초과 용량 때문에 다 "쓰기"를 못할 수도 있습니다.
						//버퍼에 남아 있다면, 모든 문자를 파일에 "쓰기" 합니다.
						if(bw!=null) bw.close();
						if(fw!=null) fw.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		//btnReset 이벤트 처리
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int select = JOptionPane.showConfirmDialog(f, "저장하시겠습니까", "종료", JOptionPane.YES_NO_OPTION);
				if(select == JOptionPane.YES_OPTION) ta.setText("");
			}
		});
		//btnOpen 버튼 //trim()메서드 사용
		btnOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileDialog fd = new FileDialog(f, "불러오기", FileDialog.LOAD);
					fd.setVisible(true);
					String path = fd.getDirectory() + fd.getFile();		
					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(f, path+"\n경로의 파일을 불러옵니다.");
					}
					String tmp = "",msg = "";
					while((tmp = br.readLine()) != null) {
						msg += tmp.trim()+"\n";
					}
					ta.setText(msg);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		f.addWindowListener(new WindowAdapter() {
			//X 버튼을 누를 때, 프로그램 종료 --> 이거 하기전 '저장'을 해야 합니다.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

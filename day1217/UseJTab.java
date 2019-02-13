package day1217;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJTab extends JFrame implements MouseListener{
	
	private JTabbedPane jtp;
	private ImageIcon ii2;
	private JLabel jl2;

	public UseJTab() {
		super("Tab");
		
		//1. 탭을 추가할 수 있는 객체 생성
		jtp = new JTabbedPane();
		
		//2. 각 탭에 들어갈 컴포넌트를 생성
		//처음 탭에 들어갈 컴포넌트
		ImageIcon ii = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/어피치.png");
		JLabel jl = new JLabel(ii);
		
		//두번째 탭에 들어갈 컴포넌트
		JPanel jp = new JPanel();
		jp.add(new JLabel("이름"));
		jp.add(new JTextField(30));
		jp.add(new JButton("입력"));
		
		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("입력데이터"));
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("결과창"));
		
		//네번째 탭
		ii2 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/토토로.png");
		jl2 = new JLabel();
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		jtp.add("처음탭", jl);
		jtp.add("두번째 탭", tab2);
		jtp.add("세번째 탭", new JButton("클릭"));
		jtp.add("네번째 탭", jl2);
		
		//배치
		add("Center", jtp);
//		add("Center", );
		
		jtp.addMouseListener(this);
		
		setBounds(100,100,600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent me) {
		
		if(jtp.getSelectedIndex()==3) {
			String password = JOptionPane.showInputDialog("비밀번호를 입력하세요");
			if(password.equals("123")) {
				jl2.setIcon(ii2);
			} else if(!password.equals("123")) {
				jtp.setSelectedIndex(0);
			}
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	public static void main(String[] args) {
		new UseJTab();
	}


}

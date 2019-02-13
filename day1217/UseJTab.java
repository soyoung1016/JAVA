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
		
		//1. ���� �߰��� �� �ִ� ��ü ����
		jtp = new JTabbedPane();
		
		//2. �� �ǿ� �� ������Ʈ�� ����
		//ó�� �ǿ� �� ������Ʈ
		ImageIcon ii = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/����ġ.png");
		JLabel jl = new JLabel(ii);
		
		//�ι�° �ǿ� �� ������Ʈ
		JPanel jp = new JPanel();
		jp.add(new JLabel("�̸�"));
		jp.add(new JTextField(30));
		jp.add(new JButton("�Է�"));
		
		JPanel tab2 = new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("�Էµ�����"));
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("���â"));
		
		//�׹�° ��
		ii2 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/�����.png");
		jl2 = new JLabel();
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		jtp.add("ó����", jl);
		jtp.add("�ι�° ��", tab2);
		jtp.add("����° ��", new JButton("Ŭ��"));
		jtp.add("�׹�° ��", jl2);
		
		//��ġ
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
			String password = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
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

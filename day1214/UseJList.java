package day1214;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseJList extends JFrame implements ActionListener, MouseListener/*ListSelectionListener*/{

	private JList<String> jl; //view
	private DefaultListModel<String> dlm; //model
	
	private JLabel jlOutput;
	private JButton jb;
	
	public UseJList() {
		super("JList���");
		
		dlm = new DefaultListModel<String>();
		dlm.addElement("Java SE");
		dlm.addElement("Oracle");
		dlm.addElement("JDBC");
		dlm.addElement("CSS");
		
		jl = new JList<String>(dlm);
		
		//ScrollBar�� ���� JList���� ScrollBar ����
		JScrollPane jsp = new JScrollPane(jl);
		
		jlOutput = new JLabel("���");
		jlOutput.setBorder(new TitledBorder("���þ�����"));
		
		jb = new JButton("�Է�");
		
		jb.addActionListener(this);
//		jl.addListSelectionListener(this);
		jl.addMouseListener(this);
		
		add("North", jb);
		add("Center", jsp); //������Ʈ�� ���� ��ũ�ѹ� ��ü�� ��ġ
		add("South", jlOutput);
		
		
		
		setBounds(100,100,300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String lang = JOptionPane.showInputDialog("��ǻ�� ���߰��� ��� �Է�");
		//�Է�â���� ��ҳ� xǥ�� ������ �̻��� ��?�� ���°� ���� �ڵ�
		if (lang!=null&&!lang.equals("")) { //!= �ּҺ�, �񱳼����� �տ������� ��
			//��Ҹ� ������ lang�� null�� ���µ� equals�� �ν��Ͻ����� ���ϴ°Ŷ� null���� ���Ҽ� �����Ƿ� ERROR
			//�Էµ������̹Ƿ� Model��ü�� ����Ѵ�.
			dlm.addElement(lang);
		}
		
		//mouse�� Ŭ�������� �ѹ�!
		
	}
	//����

	//////////////////////////////mouseClicked���� ����ǹǷ� �ʿ����//////////////////
//	@Override
//	public void valueChanged(ListSelectionEvent lse) { //Ŭ�� �������� ���ö��� ���� �ٸ��� ���´�.
//		//���õ� ������(JList)�� ��(DefaultListModel)�� ���ͼ�
//		if(flag) {
//			int idx = jl.getSelectedIndex();
//			//��� 2�� ���� if��
//			String value = dlm.get(idx);
//			//JLabel�� �߰�
//			jlOutput.setText(value);
//			//���õ� ���� ����
//			System.out.println(dlm.remove(idx));
//			
//			dlm.remove(idx);
//		}
//		flag=!flag;
//	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
			int idx = jl.getSelectedIndex();
			String value = dlm.get(idx);
			//JLabel�� �߰�
			jlOutput.setText(value);
			//���õ� ���� ����
			dlm.remove(idx);
			System.out.println("����");
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
		new UseJList();
	}



}

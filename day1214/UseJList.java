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
		super("JList사용");
		
		dlm = new DefaultListModel<String>();
		dlm.addElement("Java SE");
		dlm.addElement("Oracle");
		dlm.addElement("JDBC");
		dlm.addElement("CSS");
		
		jl = new JList<String>(dlm);
		
		//ScrollBar가 없는 JList에게 ScrollBar 설정
		JScrollPane jsp = new JScrollPane(jl);
		
		jlOutput = new JLabel("출력");
		jlOutput.setBorder(new TitledBorder("선택아이템"));
		
		jb = new JButton("입력");
		
		jb.addActionListener(this);
//		jl.addListSelectionListener(this);
		jl.addMouseListener(this);
		
		add("North", jb);
		add("Center", jsp); //컴포넌트를 가진 스크롤바 객체를 배치
		add("South", jlOutput);
		
		
		
		setBounds(100,100,300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String lang = JOptionPane.showInputDialog("컴퓨터 개발관련 언어 입력");
		//입력창에서 취소나 x표를 누르면 이상한 줄?이 들어가는거 막는 코드
		if (lang!=null&&!lang.equals("")) { //!= 주소비교, 비교순서는 앞에서부터 뒤
			//취소를 누르면 lang에 null이 들어가는데 equals는 인스턴스끼리 비교하는거라서 null과는 비교할수 없으므로 ERROR
			//입력데이터이므로 Model객체를 사용한다.
			dlm.addElement(lang);
		}
		
		//mouse는 클릭했을때 한번!
		
	}
	//복사

	//////////////////////////////mouseClicked에서 수행되므로 필요없다//////////////////
//	@Override
//	public void valueChanged(ListSelectionEvent lse) { //클릭 했을때와 나올때의 값이 다르게 나온다.
//		//선택된 아이템(JList)의 값(DefaultListModel)을 얻어와서
//		if(flag) {
//			int idx = jl.getSelectedIndex();
//			//출력 2번 방지 if문
//			String value = dlm.get(idx);
//			//JLabel에 추가
//			jlOutput.setText(value);
//			//선택된 값을 삭제
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
			//JLabel에 추가
			jlOutput.setText(value);
			//선택된 값을 삭제
			dlm.remove(idx);
			System.out.println("삭제");
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

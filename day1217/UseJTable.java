package day1217;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * MVC Pattern이 적용된 class
 * @author owner
 */
@SuppressWarnings("serial")
public class UseJTable extends JFrame implements ActionListener{
	
	private JButton btnAdd;
	private DefaultTableModel dtm;
	private JTable jt;
	UseJTable ujt;

	
	//객체를 생성하려면 생성자가 호출된다
	public UseJTable() {
		//자기가 가지고 있는 인스턴스 변수를 heap에 올려놓고 가장 처음 수를 반환
		super("JTable 연습");
		
		//1. 데이터를 관리하는 Model 클래스 생성
		String[] columnNames = {"번호", "이름", "주소", "이메일"};
		String[][] rowData = {
							{"1", "이재찬", "인천시 소래동","chan@test.com"},
							{"2", "정택성", "서울시 구로동","teack@sist.com"},
							{"3", "이재현", "경기도 안양시","hyun@gmail.com"},
							};
							
		//수정 못하게 막으려고 어나니머스 클래스로 코딩수를 줄여서 사용
		dtm = new DefaultTableModel(rowData, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		//2. 데이터를 보여주는 View 클래스 생성
		jt = new JTable(dtm);
		//테이블 컬럼의 크기 변경 : 컬럼은 하나만 넓이를 변경하면 하위 모든 컬럼은 동일한 크기를 적용받는다.
		//컬럼크기변경 1. : 컬럼을 얻는다.
		TableColumn tc = jt.getColumnModel().getColumn(0);
		
		//컬럼크기변경 2. : 컬럼의 크기 변경
		tc.setPreferredWidth(20);
		
		jt.getColumnModel().getColumn(1).setPreferredWidth(100);
		jt.getColumnModel().getColumn(2).setPreferredWidth(200);
		jt.getColumnModel().getColumn(3).setPreferredWidth(170);
		
		//테이블 행의 높이 변경
		jt.setRowHeight(25);
		
		
		btnAdd = new JButton("데이터 추가");
		//Column의 이름과 ScrollBar를 사용할 수 있또록 JScrollPane 배치
		JScrollPane jsp = new JScrollPane(jt);
		JPanel jp = new JPanel();
		jp.add(btnAdd);
		
		//배치
		add("Center", jsp);
		add("South", jp);
		
		//이벤트 등록
		btnAdd.addActionListener(this);
		UseJTable.TableEvt te = this.new TableEvt(); //이너클래스 객체화 하는 법
		jt.addMouseListener(te);
		
		setBounds(100,100,500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String inputData = JOptionPane.showInputDialog("데이터 입력\n예) 번호,이름,주소,이메일");
		
		String[] tempData = inputData.split(",");
		
		if(tempData.length != 4) {
			JOptionPane.showMessageDialog(this, "입력데이터의 형태는 \n번호,이름,주소,이메일 이어야합니다.",
											"입력 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		//입력된 데이터를 화면에 보여주기 위해 DefaultTableModel에 추가(행추가)
		dtm.addRow(tempData); //object이 String의 부모이므로 매개변수가 Object[]이어도 들어간다.
		
	}
	
	////////////////////////////////inner class시작////////////////////////////////
	public class TableEvt extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent me) {
//			System.out.println("행선택 : "+jt.getSelectedRow()+", 열선택 : "+jt.getSelectedColumn());
//			String selectValue0 = (String)jt.getValueAt(jt.getSelectedRow(), 0);
//			String selectValue1 = (String)jt.getValueAt(jt.getSelectedRow(), 1);
//			String selectValue2 = (String)jt.getValueAt(jt.getSelectedRow(), 2);
//			String selectValue3 = (String)jt.getValueAt(jt.getSelectedRow(), 3);
			//아래쪽 for문이 아니라 이렇게 해도 상관없다. for문은 값이 많을때 적절하고 몇개 안된다면 이렇게 명시하는것이 더 나을때도 있다.
			
			//String에 object을 넣으려고 하니 ERROR
			//부모는 자식이 누구인지 모르기 때문에 캐스팅을 해주어야 한다.
			
			StringBuilder viewData = new StringBuilder();
			int selectedRow = jt.getSelectedRow();
			int columnCount = jt.getColumnCount();
			
			int flag = JOptionPane.showConfirmDialog(ujt, "예를 누르면 조회, 아니오를 누르면 삭제를 수행합니다.");
			
			switch(flag) {
			case JOptionPane.OK_OPTION : 
				for(int i =0; i <columnCount; i++) {
					viewData.append(jt.getValueAt(selectedRow, i)).append("\n");
				}
				JOptionPane.showMessageDialog(ujt, viewData);
				//this, 즉 바깥 클래스의 객체를 넣으면 ERROR, 그렇다고 jt를 넣는것은 에러는 나진않지만 올바른 방법이 아니다.
				break;
				
			case JOptionPane.NO_OPTION :
				switch (JOptionPane.showConfirmDialog(ujt, "정말 삭제하시겠습니까?")) {
				case JOptionPane.OK_OPTION :
					dtm.removeRow(selectedRow);
				}
			}
			
			
			
			
		}
	}
	
	////////////////////////////////inner class시작////////////////////////////////
	
	public static void main(String[] args) {
		new UseJTable(); //인스턴스화의 목적 : 객체를 생성하기 위해서~!~!
	}


}

package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

@SuppressWarnings("serial")
public class InfoHome extends Frame{

	private TextField tfName, tfAge, tfAdd;
	private List liInfo;
	private Button btnAdd, btnDel, btnUp, btnClose;
	
	
	public InfoHome() {
	
		Label titleName = new Label("이름");
		Label titleAge = new Label("나이");
		Label titleAdd = new Label("주소");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAdd = new TextField();
		
		liInfo = new List();
		
		btnAdd = new Button("추가");
		btnDel = new Button("삭제");
		btnUp = new Button("변경");
		btnClose = new Button("닫기");
		
		setLayout(null);
		
		titleName.setBounds(30,80,40,15);
		titleAge.setBounds(30,120,40,15);
		titleAdd.setBounds(30,160,40,15);
		
		tfName.setBounds(75,75,80,30);
		tfAge.setBounds(75,115,80,30);
		tfAdd.setBounds(75,155,80,30);
		
		liInfo.setBounds(220,75,170,110);
		
		btnAdd.setBounds(100,220,50,30);
		btnDel.setBounds(165,220,50,30);
		btnUp.setBounds(230,220,50,30);
		btnClose.setBounds(295,220,50,30);
		
		
		add(titleName);
		add(titleAge);
		add(titleAdd);
		add(tfName);
		add(tfAge);
		add(tfAdd);
		add(liInfo);
		add(btnAdd);
		add(btnDel);
		add(btnUp);
		add(btnClose);
		
		//이벤트 등록 - Has a 관계
		InfoHomeEvt ihe = new InfoHomeEvt(this);
		
		tfName.addActionListener(ihe);
		tfAge.addActionListener(ihe);
		tfAdd.addActionListener(ihe);
		
		liInfo.addItemListener(ihe);
		
		btnAdd.addActionListener(ihe);
		btnDel.addActionListener(ihe);
		btnUp.addActionListener(ihe);
		btnClose.addActionListener(ihe);
		
		addWindowListener(ihe);
		
		
		setBounds(200,100,450,280);
		setResizable(false);
		setVisible(true);
	
	}
	
	
	
	public TextField getTfName() {
		return tfName;
	}



	public TextField getTfAge() {
		return tfAge;
	}



	public TextField getTfAdd() {
		return tfAdd;
	}



	public List getLiInfo() {
		return liInfo;
	}



	public Button getBtnAdd() {
		return btnAdd;
	}



	public Button getBtnDel() {
		return btnDel;
	}



	public Button getBtnUp() {
		return btnUp;
	}



	public Button getBtnClose() {
		return btnClose;
	}



	public static void main(String[] args) {
		new InfoHome();
	}
}

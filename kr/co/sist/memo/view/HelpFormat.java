package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.TextArea;

import kr.co.sist.memo.evt.HelpFormatEvt;

@SuppressWarnings("serial")
public class HelpFormat extends Dialog {
	private JavaMemo jm;
	private TextArea tfHelp;
	private Button btnOk;
	
	public HelpFormat(JavaMemo jm) {
		super(jm, "����", true);
		this.jm=jm;
		
		tfHelp = new TextArea("�޸��� ����\n�� �޸����� JAVA�� �����������"+
				"\n������ �ڵ� ���� �� ������ �� �� �ֽ��ϴ�.\n"+
				"��, �� �ڵ带 ����Ͽ� ���� ���� ������\n"+
				"�ҽ� ������ ��Ģ���� �մϴ�. GNU\n"+
				"�ۼ��� : �ڼҿ�\n"+
				"Version : 1.0");
		
		btnOk = new Button("Ȯ��");
		
		setLayout(null);
		
		tfHelp.setBounds(20,40,360,260);
		btnOk.setBounds(175,307,40,30);
		
		add(tfHelp);
		add(btnOk);
		
		//�̺�Ʈ ���
		HelpFormatEvt hfe = new HelpFormatEvt(this);
		btnOk.addActionListener(hfe);
		
		addWindowListener(hfe);
		
		
		setBounds(jm.getX()+150,jm.getX()+80,400,350);
		tfHelp.setEditable(false);
		setResizable(false);
		setVisible(true);
		
	}

	public JavaMemo getJm() {
		return jm;
	}

	public TextArea getTfHelp() {
		return tfHelp;
	}

	public Button getBtnOk() {
		return btnOk;
	}
	
}

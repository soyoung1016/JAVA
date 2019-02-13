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
		super(jm, "도움말", true);
		this.jm=jm;
		
		tfHelp = new TextArea("메모장 정보\n이 메모장은 JAVA로 만들어졌으며"+
				"\n누구나 코드 수정 및 배포를 할 수 있습니다.\n"+
				"단, 이 코드를 사용하여 개선 했을 때에는\n"+
				"소스 공개를 원칙으로 합니다. GNU\n"+
				"작성자 : 박소영\n"+
				"Version : 1.0");
		
		btnOk = new Button("확인");
		
		setLayout(null);
		
		tfHelp.setBounds(20,40,360,260);
		btnOk.setBounds(175,307,40,30);
		
		add(tfHelp);
		add(btnOk);
		
		//이벤트 등록
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

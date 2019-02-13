package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.memo.evt.MemoFormatEvt;

@SuppressWarnings("serial")
public class MemoFormat extends Dialog{
	
	private JavaMemo jm;
	private TextField tfFontText, tfStyleText, tfSizeText;
	private Label lblPreview;
	private Button btnYes, btnNo;
	private List listFont, listStyle, listSize;

	public MemoFormat(JavaMemo jm) {
		super(jm, "�۲�", true);
		this.jm=jm;
		
		//�θ�â(JavaMemo)�� T.A�� �۲� ������ �����ͼ� T.F�� �����Ѵ�.
		Font fontTa = jm.getTaNote().getFont(); //�θ�â�� T.A�۲� ������ ������ ��´�
		
		Label lblFont = new Label("�۲�");
		Label lblStyle = new Label("�۲� ��Ÿ��");
		Label lblSize = new Label("ũ��");
		Label lblSee = new Label("����");
		lblPreview = new Label("AaBbYyZz");
		lblPreview.setFont(fontTa);
		
		//���� �����ִ� �۲��� �������� ����ϴ�... style�� ����
		System.out.println(fontTa.getFamily()+" / "+fontTa.getStyle()+
							"/"+fontTa.getSize());
		
		String[] arrStyle = {"�Ϲ�", "���ϰ�", "����Ӳ�","���� ����Ӳ�"};
		tfFontText = new TextField(fontTa.getFamily()); //.getFont�� ���� �������� �� �ڿ� .���ñⰡ �پ Family�� ���
		tfStyleText = new TextField(arrStyle[fontTa.getStyle()]);
		tfSizeText = new TextField(String.valueOf(fontTa.getSize()));
		
		btnYes = new Button("Ȯ��");
		btnNo = new Button("���");
		
		
		listFont = new List();
		listStyle = new List();
		listSize = new List();
		
		//listFont�� �߰�
		listFont.add("Dialog");
		listFont.add("Serif");
		listFont.add("SansSerif");
		listFont.add("Monospaced");
		listFont.add("DialogInput");
		
		//listStyle�� �߰�
		for(String style : arrStyle) {
			listStyle.add(style);
		}
		
		//listSize�� �߰�
		int i = 0;
		String temp = "";
		
		for(i=2; i<11; i++) {
			temp=String.valueOf(i);
			listSize.add(temp);
			i=i+1;
		}
		
		for(i=11; i<81; i++) {
			temp=String.valueOf(i);
			listSize.add(temp);
		}
		
		
		setLayout(null);
		
		lblFont.setBounds(27,50,80,20);
		tfFontText.setBounds(30,70,90,20);
		
		lblStyle.setBounds(155,50,80,20);
		tfStyleText.setBounds(155,70,90,20);
		
		lblSize.setBounds(280,50,80,20);
		tfSizeText.setBounds(280,70,90,20);
		
		lblSee.setBounds(160,210,80,20);
		lblPreview.setBounds(160,230,120,70);
		
		listFont.setBounds(30,100,90,85);
		listStyle.setBounds(155,100,90,85);
		listSize.setBounds(280,100,90,85);
		
		btnYes.setBounds(230,305,45,30);
		btnNo.setBounds(300,305,45,30);

		
		add(lblFont);
		add(tfFontText);
		add(listFont);
		
		
		add(lblStyle);
		add(tfStyleText);
		add(listStyle);
		
		add(lblSize);
		add(tfSizeText);
		add(listSize);
		
		add(lblSee);
		add(lblPreview);
		
		add(btnYes);
		add(btnNo);
		
		//�̺�Ʈ ���
		MemoFormatEvt mfe = new MemoFormatEvt(this);
		btnYes.addActionListener(mfe);
		btnNo.addActionListener(mfe);
		
		listFont.addItemListener(mfe);
		listStyle.addItemListener(mfe);
		listSize.addItemListener(mfe);
		
		addWindowListener(mfe);
		
		
		setBounds(jm.getX()+150,jm.getX()+80,400,350);
		setResizable(false);
		setVisible(true);
		
	}

	public JavaMemo getJm() {
		return jm;
	}

	public TextField getTfFontText() {
		return tfFontText;
	}

	public TextField getTfStyleText() {
		return tfStyleText;
	}

	public TextField getTfSizeText() {
		return tfSizeText;
	}

	public Label getLblPreview() {
		return lblPreview;
	}

	public Button getBtnYes() {
		return btnYes;
	}

	public Button getBtnNo() {
		return btnNo;
	}

	public List getListFont() {
		return listFont;
	}

	public List getListStyle() {
		return listStyle;
	}

	public List getListSize() {
		return listSize;
	}
	
}

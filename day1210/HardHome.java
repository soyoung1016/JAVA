package day1210;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class HardHome extends Frame {

	public HardHome() {
		super("������ġ");
		
		Label lblFont = new Label("�۲�");
		TextField lblFontText = new TextField();
		Label lblStyle = new Label("�۲� ��Ÿ��");
		TextField lblStyleText = new TextField();
		Label lblSize = new Label("ũ��");
		TextField lblSizeText = new TextField();
		Label lblSee = new Label("����");
		TextField lblSeeText = new TextField("AaBbYyZz");
		lblSeeText.setFont(new Font("Dialog", Font.BOLD,22));
		Button btnYes = new Button("Ȯ��");
		Button btnNo = new Button("���");
		
		
		List listFont = new List();
		listFont.add("Dialog");
		listFont.add("Serif");
		listFont.add("SansSerif");
		listFont.add("Monospaced");
		listFont.add("DialogInput");
		
		List listStyle = new List();
		listStyle.add("�Ϲ�");
		listStyle.add("����");
		listStyle.add("����Ӳ�");
		listStyle.add("���� ����Ӳ�");
		
		List listSize = new List();
		int i = 0;
		String temp = "";
//		while(i<81) {
//			if(i/2==0&&i<11) {
//			} else if(i<81) {
//				temp=String.valueOf(i);
//				listSize.add(temp);
//			}
//			i++;
//		}
		
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
		lblFontText.setBounds(30,70,90,20);
		
		lblStyle.setBounds(155,50,80,20);
		lblStyleText.setBounds(155,70,90,20);
		
		lblSize.setBounds(280,50,80,20);
		lblSizeText.setBounds(280,70,90,20);
		
		lblSee.setBounds(160,210,80,20);
		lblSeeText.setBounds(160,230,120,70);
		
		listFont.setBounds(30,100,90,85);
		listStyle.setBounds(155,100,90,85);
		listSize.setBounds(280,100,90,85);
		
		btnYes.setBounds(230,305,45,30);
		btnNo.setBounds(300,305,45,30);

		
		add(lblFont);
		add(lblFontText);
		add(listFont);
		
		
		add(lblStyle);
		add(lblStyleText);
		add(listStyle);
		
		add(lblSize);
		add(lblSizeText);
		add(listSize);
		
		add(lblSee);
		add(lblSeeText);
		
		add(btnYes);
		add(btnNo);
		
		
		setBounds(200,100,400,350);
		setResizable(false);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new HardHome();
	}

}

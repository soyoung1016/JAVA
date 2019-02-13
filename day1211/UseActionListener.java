package day1211;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ActionListener�� ����� �̺�Ʈ ó��<br>
 * is a ����� �̺�Ʈ�� ó��
 * @author owner
 */
//1. window component ���
@SuppressWarnings("serial")
public class UseActionListener extends Frame implements ActionListener{
	
	
	private TextField tfName;
	private TextArea taDisplay;
	
	public UseActionListener() {
		super("Action Event ���");
		//2. Component ����
		Label lblName = new Label("�̸�");
		tfName = new TextField(20);
		taDisplay = new TextArea();
		Button btnAdd = new Button("�߰�");		
		Button btnClose = new Button("����");
		
		//�Ϲ�������Ʈ�� ��ġ�� �� �ִ� �����̳� ������Ʈ�� ����
		Panel panelNorth = new Panel(); //Flow Layout
		//������ �����̳� ������Ʈ�� �Ϲ� ������Ʈ ��ġ
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnClose);
		
		//3. ��ġ������ ����
		setLayout(new BorderLayout());
		
		//4. ��ġ BorderLayout Ư¡ : �ϳ��� �������� �ϳ��� ������Ʈ�� ���尡��
		add("North", panelNorth);
//		add("North", lblName);
//		add("North", tfName);
//		add("North", btnAdd);
//		add("North", btnClose);
//		add("North", taDisplay);
		add("Center", taDisplay);
		
		//�̺�Ʈ ���
		btnAdd.addActionListener(this);//��ư���� �̺�Ʈ�� ���
		tfName.addActionListener(this);//�ؽ�Ʈ �ʵ忡�� �̺�Ʈ�� ���(����Ű�� �ĵ� �ԷµǴ� �̺�Ʈ!)
		
		//5. ������ ũ�� ����
		setBounds(200,150,400,250);
		
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//������ ���� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new UseActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//TextField�� ���� �޾ƿͼ�
		String name = tfName.getText();
		if(!name.isEmpty()) {	//�Է� ���ڿ��� ������� �ʴٸ� �߰��ϴ� if��
		//TextArea�� �߰�
		taDisplay.append(name + "\n");
		//TextField�� ���� �ʱ�ȭ
		tfName.setText("");
		}
		//Ŀ���� TextField�� �缳��
		tfName.requestFocus(); //�θ����� �ִ�.
		
	}

}

package kr.co.sist.memo.view;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

import kr.co.sist.memo.evt.JavaMemoEvt;

/**
 * ����ڰ� ������ �޸� �ۼ�, ���Ϸ� ����, ���Ͽ��� �о���̴� ����� ������ �޸��� 
 * @author owner
 */
@SuppressWarnings("serial")
public class JavaMemo extends Frame {
	private Menu menuFile, menuEdit, menuHelp;
	private MenuItem miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
	private TextArea taNote;
	
	public JavaMemo(Font font) {
		super("�޸��� - �������");
		
		//�޴� ����
		menuFile = new Menu("����");
		menuEdit = new Menu("����");
		menuHelp = new Menu("����");
		
		//�޴� ������ ����
		miNew = new MenuItem("�� ��");
		miOpen = new MenuItem("����");
		miSave = new MenuItem("����");
		miNewSave = new MenuItem("�ٸ� �̸����� ����");
		miEnd = new MenuItem("����");
		miFormat = new MenuItem("�۲�");
		miHelp = new MenuItem("����");
		
		//TextArea ����
		taNote = new TextArea();
		
		//�Ű������� ������ Font�� �����Ͽ� TextArea�� Font�� �����Ѵ�.
		if(font != null) {
			taNote.setFont(font);
		}
		
		//��ġ
		//�޴������� -> �޴�
		menuFile.add(miNew);
		menuFile.addSeparator();
		menuFile.add(miOpen);
		menuFile.add(miSave);
		menuFile.add(miNewSave);
		menuFile.addSeparator();
		menuFile.add(miEnd);
		
		menuEdit.add(miFormat);
		
		menuHelp.add(miHelp);
		
		//�޴��� �޴��ٿ� ��ġ
		MenuBar mb = new MenuBar();
		mb.add(menuFile);
		mb.add(menuEdit);
		mb.add(menuHelp);
		
		//�޴��� -> Frame ��ġ
		setMenuBar(mb);
		//T.A�� BorderLayout�� Center�� ��ġ
		add("Center", taNote);
		
		//������ �����̺�Ʈ ���
		JavaMemoEvt jme = new JavaMemoEvt(this);//Dialog������ visible�տ� ������ �����̺�Ʈ�� �;߸� ���ᰡ �ȴ�. Frame�� ���� ����
		addWindowListener(jme);
		
		//�޴� ������ �̺�Ʈ ���
		miNew.addActionListener(jme);
		miOpen.addActionListener(jme);
		miSave.addActionListener(jme);
		miNewSave.addActionListener(jme);
		miEnd.addActionListener(jme);
		miFormat.addActionListener(jme);
		miHelp.addActionListener(jme);
		
		//������ ũ�� ����
		setBounds(10,10,900,600);
		setVisible(true);

		
	}

	public MenuItem getMiNew() {
		return miNew;
	}

	public MenuItem getMiOpen() {
		return miOpen;
	}

	public MenuItem getMiSave() {
		return miSave;
	}

	public MenuItem getMiNewSave() {
		return miNewSave;
	}

	public MenuItem getMiEnd() {
		return miEnd;
	}

	public MenuItem getMiFormat() {
		return miFormat;
	}

	public MenuItem getMiHelp() {
		return miHelp;
	}

	public TextArea getTaNote() {
		return taNote;
	}
	
	
}

package kr.co.sist.memo.evt;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import kr.co.sist.memo.view.HelpFormat;
import kr.co.sist.memo.view.JavaMemo;
import kr.co.sist.memo.view.MemoFormat;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String taNoteData; //T.A�� ������ ������ ����
	private String openPath; //������ ���ϸ��� ����
	
	public JavaMemoEvt(JavaMemo jm) { //��ü�� �����ɶ� �ʱ�ȭ���� �־��ִ� ���� �Ѵ�.
		this.jm=jm;
		taNoteData = ""; //taNoteData �ʱ�ȭ
		openPath = "";
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		//T.A�� ����� �о�鿴�� ������ �ٸ��ٸ� ���忩�θ� ���� �۾��� �����Ѵ�.
		TextArea tempTa = jm.getTaNote(); //�ߺ��ڵ尡 ���Ƽ� ������ ����ش�.
						
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?");
								
			switch(flag) {
			case JOptionPane.OK_OPTION :
				if(!openPath.equals("")) {
					//������ �̸��� ����
					saveMemo();
				} else {
					//�ٸ� �̸����� ����
					newSaveMemo();
				}//end else
			case JOptionPane.NO_OPTION :
				jm.dispose();
			default:
				return;
			}//end switch
		} else {
			jm.dispose();	
		}//end if
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻� ���� ��
		if(ae.getSource()==jm.getMiNew()) {
			newMemo();
		}
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻� ���� ��
		if(ae.getSource()==jm.getMiOpen()) {
			try {
				openMemo();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(jm, "������ ������ ���� �� �����ϴ�.", "���� ���� ERROR", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog
				(jm, "������ ������ �о���̴��� ������ �߻��Ͽ����ϴ�.", "���� ���� ERROR", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if(ae.getSource()==jm.getMiSave()) {
			saveMemo();
		}
		
		//�ٸ� �̸����� ���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if(ae.getSource()==jm.getMiNewSave()) {
			newSaveMemo();
		}
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if(ae.getSource()==jm.getMiEnd()) {
			//����������� ������ �ִٸ� �����ϰ� ���� 
			closeMemo();
		}
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if(ae.getSource()==jm.getMiFormat()) {
			formatDialog();
		}
		
		//���� �޴������ۿ��� �̺�Ʈ�� �߻����� ��
		if(ae.getSource()==jm.getMiHelp()) {
			helpDialog();
		}
		
	}
	
	/**
	 * ���� : TextArea�� �ʱ�ȭ�Ѵ�.
	 */
	public void newMemo() {
		
		TextArea tempTa = jm.getTaNote();
		boolean flagNew = false;
		//������ ������ �Ǵ�
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "�ٸ� �̸����� �����Ͻðڽ��ϱ�?");
			
			switch(flag) {
			case JOptionPane.OK_OPTION :
				newSaveMemo();
				
			case JOptionPane.NO_OPTION :
				flagNew = false;
				break;
			default :
				flagNew = true;
			}
		}
		
		if(!flagNew) {
			tempTa.getText(); //���׶����� ���� �޾ƿ��� ���� �ʱ�ȭ
			tempTa.setText("");
			//������ �� ���Ŀ��� �б��� ������ �ʱ�ȭ
			taNoteData = tempTa.getText();
			openPath = ""; //�о���� ������ ��� �ʱ�ȭ
			jm.setTitle("�޸��� - ���� ");
		}
	}
	
	/**
	 * txt���� ����
	 */
	public void openMemo() throws FileNotFoundException, IOException{
		
		//T.A�� ����� �о�鿴�� ������ �ٸ��ٸ� ���忩�θ� ���� �۾��� �����Ѵ�.
		TextArea tempTa = jm.getTaNote(); //�ߺ��ڵ尡 ���Ƽ� ������ ����ش�.
		boolean flagOpen = false;
		
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, openPath+"\n�� �����Ͻðڽ��ϱ�?");
				
			switch(flag) {
			case JOptionPane.OK_OPTION :
				if(!openPath.equals("")) {
					//������ �̸��� ����
					saveMemo();
				} else {
					//�ٸ� �̸����� ����
					newSaveMemo();
				}//end else
			case JOptionPane.NO_OPTION :
				flagOpen = false;
				break;
			default:
				flagOpen = true;
			}//end if
		}//end if
		
		if(!flagOpen) {
			FileDialog fdOpen = new FileDialog(jm, "��������", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String filePath = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			if(filePath != null) { //������ ������ ����
				////////////////////////12-20-2018 �ڵ��߰�///////////////////////
				//�޸��� ���� ��� �߰�
				
				//������ ���Ϸ� ���� ��ü ����
				File file = new File(filePath+fileName);
				
				//16bit stream ���
				BufferedReader br = null;
				
				try {
					br = new BufferedReader(new FileReader(file));
					
					String temp = "";
					//T.A�� �ʱ�ȭ �� �� 
					tempTa.setText("");
					
					while((temp=br.readLine()) != null) {
						//���Ͽ��� �о���� ������ �����Ѵ�.
						tempTa.append(temp+"\r\n"); //\n�� �����Ҽ�����.
					}
					
					//������ �о���� ������ ����
					taNoteData = tempTa.getText();
					//������ ���ϸ��� ����
					openPath = file.getAbsolutePath();
					
				} finally {
					if(br!=null) {
						br.close();
					}
				}
				
				////////////////////////12-20-2018 �ڵ��߰�///////////////////////
				
				//������ ��ο� �̸��� Frame�� TitleBar�� ����
				jm.setTitle("�޸��� - ����"+filePath+fileName);
			}
		}//flagOpen�� end if
	}
	
	
	/**
	 * �ۼ��� �޸� ���� - ������ ���ϸ��� �״�� �����ϴ� ���ϸ� �ݿ�
	 */
	public void saveMemo() {
		//������ ������ �̸��� ���Ͽ� �������
		try {
			if(!openPath.equals("")) {
				createFile(openPath);
			} else {
				newSaveMemo();
			}
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	
	}
	
	private void createFile(String pathName) throws IOException {
		BufferedWriter bw = null;
		
		try {
			//����ڰ� ���丮���� ������� ������ �� ���� ������ File Ŭ������ ����� �ʿ䰡 ����.
			bw = new BufferedWriter(new FileWriter(pathName));
			bw.write(jm.getTaNote().getText()); //T.A�� ������ ��Ʈ���� ���
			bw.flush();//��Ʈ���� ��ϵ� ������ �������� ����
			
			openPath = pathName;
			taNoteData = jm.getTaNote().getText();
		} finally {
			if(bw != null) {
				bw.close();
			}
		}
	}
	
	/**
	 * ���ϸ��� �Է¹޾� ���̸����� ����
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm, "��������", FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String filePath = fdSave.getDirectory();
		String fileName = fdSave.getFile();
		
		if(filePath != null) { //�����ư�� �������� ����
			try {
				createFile(filePath+fileName);
				JOptionPane.showMessageDialog(jm, fileName+" ����Ϸ�", "����", JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//������ ��ο� �̸��� Frame�� TitleBar�� ����
			jm.setTitle("�޸��� - ���� "+filePath+fileName);
		}//end if
	}//end newSaveMemo
	
	/**
	 * �޴�-���� ��ư�� �̿��Ͽ� �����Ҷ� ����������� ������ �ִ��� Ȯ�� �� ����
	 */
	public void closeMemo() {
		//T.A�� ����� �о�鿴�� ������ �ٸ��ٸ� ���忩�θ� ���� �۾��� �����Ѵ�.
		TextArea tempTa = jm.getTaNote(); //�ߺ��ڵ尡 ���Ƽ� ������ ����ش�.
				
		if(!taNoteData.equals(tempTa.getText())) {
			int flag = JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?");
						
			switch(flag) {
			case JOptionPane.OK_OPTION :
				if(!openPath.equals("")) {
					//������ �̸��� ����
					saveMemo();
				} else {
					//�ٸ� �̸����� ����
					newSaveMemo();
				}//end else
			case JOptionPane.NO_OPTION :
				jm.dispose();
			default:
				return;
			}//end switch
		} else {
			jm.dispose();	
		}//end if
	}
	
	/**
	 * �۲��� �����ϴ� ���̾�α׸� �����ϴ� �� 
	 */
	public void formatDialog() {
		new MemoFormat(jm);
	}
	
	/**
	 * �޸��� ������ �����ϴ� ���̾�α׸� ����
	 */
	public void helpDialog() {
		new HelpFormat(jm);
	}
	
	

}

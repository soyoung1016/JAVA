package day1212;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InfoHomeEvt extends WindowAdapter implements ActionListener, ItemListener {

	private InfoHome ih;

	public InfoHomeEvt(InfoHome ih) {
		this.ih = ih;
	}

	// 창닫기
	@Override
	public void windowClosing(WindowEvent e) {
		ih.dispose();
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource()==ih.getLiInfo()) {
			listClick();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//닫기
		if (ae.getSource() == ih.getBtnClose()) {
			popupClose();
		}
		
		//추가
		if (ae.getSource() == ih.getBtnAdd()) {
			if (ih.getTfName() != null && ih.getTfAge() != null && ih.getTfAdd() != null) {
				listAdd();
			}
		}
		
		//삭제
		if (ae.getSource() == ih.getBtnDel()) {
			listDelete();
		}
		
		//변경
		if (ae.getSource() == ih.getBtnUp()) {
			if(ih.getTfName() != null && ih.getTfAge() != null && ih.getTfAdd() != null) {
				listUpdate();
			}
		}
		

	}

	public void popupClose() {
		ih.dispose();
	}

	public void listAdd() {
		StringBuilder infoData = new StringBuilder();
		infoData.append(ih.getTfName().getText()).append("/").append(ih.getTfAge().getText()).append("/").append(ih.getTfAdd().getText());
		ih.getLiInfo().add(infoData.toString());
		
		ih.getTfName().setText("");
		ih.getTfAge().setText("");
		ih.getTfAdd().setText("");
	}
	
	public void listClick() {
		
		String[] listInfo = ih.getLiInfo().getSelectedItem().split("/");
				String name = listInfo[0];
				String age = listInfo[1];
				String add = listInfo[2];
				
				ih.getTfName().setText(name);
				ih.getTfAge().setText(age);
				ih.getTfAdd().setText(add);
	}
	
	public void listDelete() {
		String[] listInfo = ih.getLiInfo().getSelectedItem().split("/");
		String name = listInfo[0];
		String age = listInfo[1];
		String add = listInfo[2];
		
		int selectListIndex = ih.getLiInfo().getSelectedIndex();
		if(!ih.getLiInfo().getSelectedItem().isEmpty()) {
			if(ih.getTfName().getText().equals(name)&&ih.getTfAge().getText().equals(age)&&ih.getTfAdd().getText().equals(add)) {
				ih.getLiInfo().remove(selectListIndex);
			}
		}
		
		ih.getTfName().setText("");
		ih.getTfAge().setText("");
		ih.getTfAdd().setText("");
		
	}
	
	public void listUpdate() {
		int selectListIndex = ih.getLiInfo().getSelectedIndex();
		StringBuilder infoData = new StringBuilder();
		infoData.append(ih.getTfName().getText()).append("/")
				.append(ih.getTfAge().getText()).append("/").append(ih.getTfAdd().getText());
		
		
		if(!ih.getLiInfo().getSelectedItem().isEmpty()) {
			ih.getLiInfo().remove(selectListIndex);
			ih.getLiInfo().add(infoData.toString(), selectListIndex);
		}
			
		ih.getTfName().setText("");
		ih.getTfAge().setText("");
		ih.getTfAdd().setText("");

	}
	
	

}

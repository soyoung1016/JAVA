package kr.co.sist.memo.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.memo.view.HelpFormat;

public class HelpFormatEvt extends WindowAdapter implements ActionListener {
	
	private HelpFormat hf;
	
	public HelpFormatEvt(HelpFormat hf) {
		this.hf=hf;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		hf.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==hf.getBtnOk()) {
			hf.dispose();
		}
	}
	
	
}

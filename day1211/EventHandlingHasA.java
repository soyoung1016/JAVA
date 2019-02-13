package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Has a ����� �̺�Ʈ ó��<br>
 * ���߿� �۾��Ҷ� has a �� ���� ���� ����ϰ� �ȴ�.
 * @author owner
 */

//1. �̺�Ʈ ó�� ��ü�� ����
public class EventHandlingHasA implements ActionListener{
	
	//2. has a �����
	//EventHandlingHasA�� Design�� ������ �ִ�.
	private Design design;
	
	public EventHandlingHasA(Design design) {
		this.design = design;
	}

	@Override
	//3. abstract method Override
	public void actionPerformed(ActionEvent ae) {
		//�̺�Ʈ�� �߻������� ó���� �ڵ�
		System.out.println("���޹��� Design��ü "+design);
		design.dispose(); //dispose�� window�� �ֱ⶧���� has a������ �ܵ����� ����� �� ����.
	}
	
}

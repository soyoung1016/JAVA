package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

/**
 * has a ������ �̺�Ʈ ó��<br>
 * �����ΰ� �̺�Ʈ ó�� �ڵ带 �и��Ͽ� �ڵ��� ���⵵�� ���� �� �ִ�.
 * @author owner
 */
@SuppressWarnings("serial")
public class Design extends Frame{
	
	//2. �̺�Ʈó���� �����ִ� Component(��ü)�� ����
	private Button btn; //��ư�� �޾ư����� ��ư�� �޾ư��� �޼ҵ�, �� Getter�� �������Ѵ�.
	
	public Design() {
		super("������");
		//3. ������Ʈ ����
		btn = new Button("Ŭ��");
		
		//4. ��ġ
		Panel panel = new Panel();
		panel.add(btn);
		
		add("Center", panel);
		
		//5.�̺�Ʈ ���
		//�̺�Ʈ ó�� ��ü �����ϰ� has a ����
		EventHandlingHasA ehha = new EventHandlingHasA(this);
		System.out.println("������ ������ ��ü "+this);
		//������Ʈ�� �̺�Ʈ�� ���
		btn.addActionListener(ehha); //��ư���� �̺�Ʈ�� �߻��ϸ� ehha��ü�� Override�� method���� �̺�Ʈ�� ó��
		
		//6. ������ ũ�� ����
		setBounds(100,100,400,300);
		
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		
	}
	
	public Button getBtn() {
		return btn;
	}
	public static void main(String[] args) {
		new Design();
	}

}

package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design class�� Has a ����� ������ �̺�Ʈ ó�� Ŭ����
 * @author owner
 */
public class FriendsListEvent extends WindowAdapter implements ActionListener, ItemListener{
	
	//�̺�Ʈ�� ó���ϱ� ���� ���Ǵ� ��� ������Ʈ�� has a ������ ��ü�� ����Ͽ� ó���Ѵ�.
	private FriendsList fl;
	
	public FriendsListEvent(FriendsList fl) {
		this.fl=fl;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		fl.dispose();
	}

	@Override
	//List �̺�Ʈ ó��
	public void itemStateChanged(ItemEvent ie) {
		//ģ�� ����Ʈ���� Ŭ���Ǹ� �ش� �������� ���ܵ� ģ���� ������.
		if(ie.getSource()==fl.getListFriends()) { //����Ʈ ����� ���� �񱳰� �ȵǴ� ������ private�����̴�. getter�� �����!
			blockFriend();
		}
		
		//���ܵ� ģ�� ����Ʈ���� Ŭ���� �ش� �������� ģ�� ����Ʈ�� ������.
		if(ie.getSource()==fl.getListBlockFriend()) { //����Ʈ ����� ���� �񱳰� �ȵǴ� ������ private�����̴�. getter�� �����!
			unblockFriend();
		}
	}
	
	@Override
	//Button �̺�Ʈ ó��
	public void actionPerformed(ActionEvent ae) {
		// >> : ��� ģ�� �ϰ� ����
		if(ae.getSource()==fl.getBtnAllBlock()) {
			allBlock();
		}
		
		// << : ��� ģ�� ���� �ϰ� ����
		if(ae.getSource()==fl.getBtnAllUnblock()) {
			allUnblock();
		}
	}
	
	/**
	 * ģ�� ����Ʈ���� ������ ģ���� ���� ����Ʈ�� �̵�
	 */
	private void blockFriend() {
		List tempFriend = fl.getListFriends();
		//������ ģ���� ���ͼ�
		String name = tempFriend.getSelectedItem();
		//�������� ������.
		fl.getListBlockFriend().add(name);
		//������ ģ���� ����
		tempFriend.remove(name);
		
	}
	
	/**
	 * ������ ģ�� ����Ʈ���� ������ ģ���� ģ�� ����Ʈ�� �̵�
	 */
	//�ε����� �̿��Ѵ�.
	private void unblockFriend() {
		//���ܵ� ģ�� ����Ʈ���� ������ �̸��� �޾ƿͼ�
		List tempList = fl.getListBlockFriend();
		int selectedIndex = tempList.getSelectedIndex();
		//ģ�� ����Ʈ�� ������.
		fl.getListFriends().add(tempList.getItem(selectedIndex));
		//���ܵ� ģ�� ����Ʈ���� ����
		tempList.remove(selectedIndex);
	}
	
	/**
	 * &gt;&gt; ��ư�� Ŭ���ϸ� ��� ģ�� ����
	 */
	private void allBlock() {
		//ģ�� ����Ʈ�� ��� �������� �޾ƿͼ�
		String[] arrFriend = fl.getListFriends().getItems();
		//���� ����Ʈ�� ������.
		for(int i=0; i<arrFriend.length; i++) {
			fl.getListBlockFriend().add(arrFriend[i]);
		}
		//ģ�� ����Ʈ�� ��� �������� ����.
		fl.getListFriends().removeAll();
	}
	
	/**
	 * &gt;&gt; ��ư�� Ŭ���ϸ� ���ܵ� ��� ģ���� ģ������Ʈ�� �̵�
	 */
	private void allUnblock() {
		//���ܵ� ��� ģ������� �޾ƿͼ�
		String[] arrBlockList = fl.getListBlockFriend().getItems();
		//ģ����Ͽ� �߰��ϰ�
		for(String name : arrBlockList) {
			fl.getListFriends().add(name);
		}
		//���ܵ� ��� ģ������� ����
		fl.getListBlockFriend().removeAll();
		
	}


}

package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

/**
 * Has a ����� Event ó��
 * @author owner
 */
/**
 * @author owner
 *
 */
@SuppressWarnings("serial")
public class FriendsList extends Frame{
	
	private List listFriends, listBlockFriend;
	private Button btnAllUnblock, btnAllBlock;
	
	public FriendsList() {
		super("ģ�����");
		
		Label titleFriend = new Label("ģ�����");
		Label titleNo = new Label("���ܵ� ģ��");
		
		listFriends = new List();
		listBlockFriend = new List();
		
		btnAllBlock = new Button(">>");
		btnAllUnblock = new Button("<<");
		
		listFriends.add("������");
		listFriends.add("���ü�");
		listFriends.add("������");
		listFriends.add("������");
		listFriends.add("�ڼҿ�");
		
		setLayout(null);
		
		titleFriend.setBounds(30,60,80,15);
		listFriends.setBounds(30,80,80,100);
		
		btnAllBlock.setBounds(150,105,30,20);
		btnAllUnblock.setBounds(150,135,30,20);
		
		titleNo.setBounds(225,60,80,15);
		listBlockFriend.setBounds(225,80,80,100);
		
		add(titleFriend);
		add(listFriends);
		add(btnAllBlock);
		add(btnAllUnblock);
		add(titleNo);
		add(listBlockFriend);
		
		//�̺�Ʈ ���
		//������ Ŭ������ �̺�Ʈ ó�� Ŭ������ Has a ����
		FriendsListEvent fle = new FriendsListEvent(this);
		
		btnAllBlock.addActionListener(fle);
		btnAllUnblock.addActionListener(fle);
		
		listFriends.addItemListener(fle);
		listBlockFriend.addItemListener(fle);
		
		addWindowListener(fle);
		
		setBounds(200,100,340,250);
		setResizable(false);
		
		setVisible(true);
	
	}
	
		
	public List getListFriends() {
		return listFriends;
	}

	public List getListBlockFriend() {
		return listBlockFriend;
	}

	public Button getBtnAllUnblock() {
		return btnAllUnblock;
	}

	public Button getBtnAllBlock() {
		return btnAllBlock;
	}


	public static void main(String[] args) {
		new FriendsList();
	}


}

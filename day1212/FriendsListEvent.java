package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design class와 Has a 관계로 설정된 이벤트 처리 클래스
 * @author owner
 */
public class FriendsListEvent extends WindowAdapter implements ActionListener, ItemListener{
	
	//이벤트를 처리하기 위해 사용되는 모든 컴포넌트는 has a 관계의 객체를 사용하여 처리한다.
	private FriendsList fl;
	
	public FriendsListEvent(FriendsList fl) {
		this.fl=fl;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		fl.dispose();
	}

	@Override
	//List 이벤트 처리
	public void itemStateChanged(ItemEvent ie) {
		//친구 리스트에서 클릭되면 해당 아이템을 차단된 친구로 보낸다.
		if(ie.getSource()==fl.getListFriends()) { //리스트 목록의 값과 비교가 안되는 이유는 private때문이다. getter를 써야함!
			blockFriend();
		}
		
		//차단된 친구 리스트에서 클릭된 해당 아이템을 친구 리스트로 보낸다.
		if(ie.getSource()==fl.getListBlockFriend()) { //리스트 목록의 값과 비교가 안되는 이유는 private때문이다. getter를 써야함!
			unblockFriend();
		}
	}
	
	@Override
	//Button 이벤트 처리
	public void actionPerformed(ActionEvent ae) {
		// >> : 모든 친구 일괄 차단
		if(ae.getSource()==fl.getBtnAllBlock()) {
			allBlock();
		}
		
		// << : 모든 친구 차단 일괄 해제
		if(ae.getSource()==fl.getBtnAllUnblock()) {
			allUnblock();
		}
	}
	
	/**
	 * 친구 리스트에서 선택한 친구를 차단 리스트로 이동
	 */
	private void blockFriend() {
		List tempFriend = fl.getListFriends();
		//선택한 친구를 얻어와서
		String name = tempFriend.getSelectedItem();
		//차단으로 보낸다.
		fl.getListBlockFriend().add(name);
		//선택한 친구를 삭제
		tempFriend.remove(name);
		
	}
	
	/**
	 * 차단한 친구 리스트에서 선택한 친구를 친구 리스트로 이동
	 */
	//인덱스를 이용한다.
	private void unblockFriend() {
		//차단된 친구 리스트에서 선택한 이름을 받아와서
		List tempList = fl.getListBlockFriend();
		int selectedIndex = tempList.getSelectedIndex();
		//친구 리스트에 보낸다.
		fl.getListFriends().add(tempList.getItem(selectedIndex));
		//차단된 친구 리스트에서 삭제
		tempList.remove(selectedIndex);
	}
	
	/**
	 * &gt;&gt; 버튼을 클릭하면 모든 친구 차단
	 */
	private void allBlock() {
		//친구 리스트의 모든 아이템을 받아와서
		String[] arrFriend = fl.getListFriends().getItems();
		//차단 리스트로 보낸다.
		for(int i=0; i<arrFriend.length; i++) {
			fl.getListBlockFriend().add(arrFriend[i]);
		}
		//친구 리스트의 모든 아이템을 삭제.
		fl.getListFriends().removeAll();
	}
	
	/**
	 * &gt;&gt; 버튼을 클릭하면 차단된 모든 친구가 친구리스트로 이동
	 */
	private void allUnblock() {
		//차단된 모든 친구목록을 받아와서
		String[] arrBlockList = fl.getListBlockFriend().getItems();
		//친구목록에 추가하고
		for(String name : arrBlockList) {
			fl.getListFriends().add(name);
		}
		//차단된 모든 친구목록을 삭제
		fl.getListBlockFriend().removeAll();
		
	}


}

package day1123;

/**
 * ��ī���� ������� �����Ͽ�, �߻�ȭ�� �����ϰ� ������� Ŭ����<br>
 * ��ī�� - ����� Ư¡ : ��, ��ü, �Ѳ� =&gt; ����<br>
 * 		   ������ Ư¡ : ���� =&gt; method <br>
 * ����)<br>
 * 		�⺻�����ڸ� ����Ͽ� ��ü�� ������ �� setter method�� ȣ���Ͽ� ���� ������ �� ����Ѵ�.<br>
 * 		Marker m = new.Marker();<br>
 * 		m.set~~~(��);<br>
 * 
 * 
 * class�� ��������� �ڷ���, ������ ���������̴�.<br>
 * 
 * @author owner
 */
public class Marker {
	private String color; //��ī���� ��
	private int body; //��ī���� ��ü�� ����
	private int cap; //��ī���� �Ѳ��� ����
	
	/**
	 * �⺻�����ڷ� ��ī�� ��ü�� �����Ǹ� ������, �Ѳ� 1��, ��ü 1���� ��ī�� ��ü�� �����մϴ�.<br>
	 * 2018-11-26 �⺻������ �����ϸ� �ڵ� �߰�<br>
	 * �ι�° �ڵ�� 2018-11-26 this �����ϸ鼭 �ڵ� �߰�<br>
	 */
	public Marker() {
//		color = "������";
//		body = 1;
//		cap = 1;
		this("������",1,1); //�����ִ� �����ڸ� ȣ���Ͽ� �� ����. �ߺ��ڵ尡 �پ���.
		System.out.println("Marker �⺻ ������");
		
	}//Marker
	
	/**
	 * �����ִ� ������ - ������, �Ѳ��� ��ü�� 1���� �ƴ� ��ī���� ������ �� ����ϴ� ������<br>
	 * ��, �Ѳ��� ��, ��ü�� ���� �Է¹޾� ��ī���� ����(������)<br>
	 * 2018-11-26 ������ �����ϸ� �ڵ� �߰�
	 * @param color ��ī���� ��
	 * @param cap ��ī�� �Ѳ�
	 * @param body ��ī���� ��ü
	 */
	public Marker(String color, int cap, int body) {
		this.color=color;
		this.cap=cap;
		this.body=body;
		System.out.println("Marker �Ű����� �ִ� ������");
	}
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��<br>
	 * ������, �Ķ���, �������� �����Ѵ�. �� �̿��� ���� ���������� ó���Ѵ�.
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		//�ν��Ͻ������� ������ ���� ���� ���� ������ ����
		if(!(color.equals("������") || color.equals("�Ķ���") || color.equals("������"))) {
			color="������";
		}//end if
		this.color=color;
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ��ü�� ������ �����ϴ� ��
	 * @param body ��ü�� ����
	 */
	public void setBody(int body) {
		this.body=body;
	}//set body
	
	/**
	 * ������ ��ī���� ��ü�� �Ѳ� ������ �����ϴ� ��
	 * @param cap �Ѳ��� ��
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �ִ� �Ѳ��� ����
	 * @return �Ѳ� ����
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	/**
	 * ������ ��ī�� ��ü�� ������ �ִ� ��ü�� ����
	 * @return ��ü�� ����
	 */
	public int getBody() {
		return body;
	}//getBody
	
	
	/**
	 * ������ ��ī�� ��ü�� ������ �ִ� �Ѳ��� ����
	 * @return �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	
	/**
	 * �Էµ� �޼����� ������ ��ī������ ĥ�ǿ� ���� ��
	 * @param msg ĥ�ǿ� �� �޼���
	 * @return ���
	 */
	public String write(String msg) {
		return color+"�� ��ī������ ĥ�ǿ� \""+msg+"\"�� ����";
	}

}

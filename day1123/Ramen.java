package day1123;

/**
 * �ʱ���, ��¡��«��, �Ŷ���� �߻�ȭ�Ͽ� ���� Ŭ����<br>
 * �����Ư¡ : ������, ����, Į�θ�, �̸�<br>
 * ������Ư¡ : �Դ´�.<br>
 * <br>
 * 181126 homework �⺻������, �����ִ� ������ ����Ͽ� �����غ���<br>
 * 
 * ��üȭ) Ramen ��ü�� = new Ramen();
 * 		������ ��ü�� �Դ�����  �� �� �ִ�.
 * @author owner
 */
public class Ramen {
	private String make, name; //������, �̸�
	private int price, kcal; //����, Į�θ�
	
	/**
	 * 181126 homework ������ ���� �ڵ� �߰�<br>
	 * �⺻ ������
	 */
	public Ramen() {
		price = 590;
		kcal = 457;
		make = "���";
	}
	
	/**
	 * 181126 homework ������ ���� �ڵ� �߰�<br>
	 * �����ִ� ������
	 * @param price ����� ����
	 * @param kcal ����� Į�θ�
	 * @param make ����� ������
	 */
	public Ramen(int price, int kcal, String make) {
		this.price = price;
		this.kcal = kcal;
		this.make = make;
	}
	
	/**
	 * ������ ��� ��ü�� �����縦 �����Ѵ�.<br>
	 * ������ ����� ������� ����̴�.<br>
	 * ����� �ƴ� �ٸ����� �ԷµǸ� ������� �����ȴ�.
	 * @param make ������
	 */
	public void setMake(String make) {
		if(!(make.equals("���"))) {
			make="���";
		}
		this.make=make;
	}
	
	/**
	 * ������ ��� ��ü�� �̸��� �����Ѵ�.<br>
	 * ������ ����� �̸��� �ʱ���, ��¡��«��, �Ŷ���̴�.<br>
	 * �������� �ƴ� �ٸ� ���� �ԷµǸ� �Ŷ������ �����ȴ�.
	 * @param name ����� �̸�
	 */
	public void setName(String name) {
		if(!(name.equals("�ʱ���")||name.equals("��¡��«��")||name.equals("�Ŷ��"))) {
			name="�Ŷ��";
		}//end if
		this.name=name;
	}
	
	/**
	 * ������ ��� ��ü�� ������ �����Ѵ�.
	 * @param price ����� ����
	 */
	public void setPrice(int price) {
		this.price=price;
	}
	
	/**
	 * ������ ��� ��ü�� Į�θ��� �����Ѵ�.
	 * @param Kcal ����� Į�θ�
	 */
	public void setKcal(int kcal) {
		this.kcal=kcal;
	}
	
	/**
	 * ������ ��� ��ü�� �����縦 ��ȯ�ϴ� ��
	 * @return ������
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * ������ ��� ��ü�� ��� ������ ��ȯ�ϴ� ��
	 * @return ����
	 */
	
	/**
	 * ������ ��� ��ü�� ��� �̸��� ��ȯ�ϴ� ��
	 * @return �̸�
	 */
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	/**
	 * ������ ��� ��ü�� Į�θ��� ��ȯ�ϴ� ��
	 * @return Į�θ�
	 */
	public int getKcal() {
		return kcal;
	}
	
	public String eat() {
		return name+"��(��) ���� �Դ´�.";
	}
	
	public String eat(String plus) {
		return name+"�� �߰��� "+plus+"��(��) �־� ���� �Դ´�.";
	}
	
	
}

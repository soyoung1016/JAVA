package day1129;
/**
 * ����� ���� Ư¡�� person���� �����ٰ� ����ϰ� �ڽŸ��� Ư¡�� ������ Ŭ����
 * @author owner
 */
public final class Clark extends Person {
	public int power;


	/**
	 * �⺻ ������ : ��ü�� �����Ǹ� power�� 9�� �����ȴ�.
	 */
	public Clark() {
		super(3,1,1);
		power=9;
	}
	
	/**
	 * �ԷµǴ� ���� ������ ���� ���� ��ȭ�� �ް��ϰ� ��ȭ�Ѵ�.
	 * @param stone ���� ����
	 * @return ���� ��ȭ
	 */
	public String power(String stone) {
			String result="";
					
			if(stone.equals("Ŭ���䳪��Ʈ")) {
				power=0;
				result="���� ����..";
			} else if(stone.equals("���̾Ƹ��")) {
				power=10;
				result="�����մϴ�";
			} else { 
				power=12;
				result="���޾�!!!";
			}
			return result;
	}
	
	@Override
	public String eat() {
		return getName()+"�� ������ ���� �Դ´�.";
//		return name; ERROR
	}
	//name�� ������ ������ �ڽ��̶� �θ� private���� ������ �߱� ������ ����, �ڿ��̶�� ������ �� �����ִ°��� �ƴϴ�.
	
	public String eat(String menu, int price) {
		return getName()+"�� ����������� "+menu+"�� ������ "+price+"$ ���� ��Ծ���.";
	}
			
}
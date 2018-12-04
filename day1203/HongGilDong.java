package day1203;

/**
 * ����� ���� Ư¡�� �θ�(Person)�� ���� ����ϰ� �ڽŸ��� Ư¡��(�ο��� ���Ѵ�) ����
 * @author owner
 */
public class HongGilDong extends Person {
	private int level; //�ο򷹺�
	
	/**
	 * ȫ�浿�� �ο��� ��κ��� ���ϹǷ� 7�� ����
	 */
	public HongGilDong() {
		super();
		level = 7;
	}
	
	/**
	 * �ο��ϴ� �� : �Էµ� �������� ���ٸ� �й�, �Էµ� �������� ���ٸ� �¸�, �Էµ� ������ ���ٸ� ���<br>
	 * �¸��ϸ� ������ 1����, �й��ϸ� ���� 1 ����, ���� ���� ��ȭ����<br>
	 * ������ �ִ� 10, �ּ� 1�� ������.<br>
	 * @param inputlevel �ο� ������� ����
	 * @return �ο��� ���
	 */
	public String fight(int inputLevel) {
		String result="";
		
		if(level > inputLevel) {//�¸�
			result="�ο� �̰���ϴ�:)";
			level++;
			if(level > 10) {
				level=10;
			}
		} else if(level < inputLevel) {//�й�
			result="�ο򿡼� �����ϴ�.";
			level--;
			if(level < 1) {
				level=1;
			}
		} else {//���
			result="���";
		}
		return result;
		
	}//fight
	
	@Override
	//check!!
	public String toString() {
		return "ȫ�浿 ��ü�� ��, �� : "+getEye()+", �� : "+getNose()+", �� : "+getMouth();
	}//toString
	
	
	/**
	 * �θ�Ŭ������ �����ϴ� method�� ����� �ڽĿ��� ���� �ʾ� ����� �Ĵ��� �ָ����� ����<br>
	 * ȭ������� ���� ������ ����
	 */
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� �ָ����� "+menu+"�� ������ "+price+"�� ���� ��Դ´�.";
	}

	@Override
	public String eat() {
		return getName()+"��(��) ������ ���� �Դ´�.";
	}
	
	@Override
	public String[] language(String lang) {
		return "�ѱ���, �߱���, ��ȭ".split(",");
	}
	
}

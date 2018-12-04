package day1126;

/**
 * method�� �Ű������� �⺻�� ������������ ���ǵȴٸ� �Ű������� �Ҵ� �Ǵ� ��(arguments)�� ����Ǿ� ���޵ȴ�.<br>
 * �Ű������� ���� �����ϴ��� ������ ���� ������� �ʴ´�.<br>
 * call by value
 * @author owner
 */
public class CallByValue {
	public void swap(int i, int j) {	//instance method(���� ��)
		int temp = 0;
		//�ԷµǴ� ������ ���� ���� ����
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap method ������ i = "+i+", j = "+j);
	}
	
	public static void main(String[] args) {	//static method, main method
		int i = 11, j = 26;
		System.out.println("swap���� i = "+i+", j = "+j);
		//��� i=11, j=26;
		
		CallByValue cbv = new CallByValue();
		cbv.swap(i,j);
		System.out.println("swap���� i = "+i+", j = "+j);

	}

}

package day1204;

/**
 * method�ȿ� Ŭ������ �����ϴ� ����class�� ���<br>
 * ������ ��ü�� ��������ó�� ����ϴ� Ŭ����
 * @author owner
 */
public class LocalOuter {
	
	int i;
	
	public LocalOuter() {
		System.out.println("�ٱ� Ŭ������ ������");
	}
	
	public void method(int param_i, final int param_j) {
		//parameter(param)�� �� ���������� ���������̴�. �޼ҵ� �ȿ��� ����ǰ� ���Ǿ����� �����̱� ������.
		int local_i = 0; //������ �з��� ��������. = int param_i
		final int local_j = 0; //������ �з��� ��������. = final int param_i
		
		///////////////////////////����Ŭ���� ����//////////////////////////////
		/*
		 * method�ȿ��� method�� ������ �������� class�� ���� �� �ִ�.�װ��� ����Ŭ����~!
		 * instanceȭ�� ���� ������ �ۿ� �������� �����Ƿ� ������ ���� �͵� �ָ�����İ� ���׶ߴ°�.
		 */
		class Local{
			int loc_i;
			
			public Local() {
				System.out.println("����Ŭ������ ������");
			}
			
			public void locMethod() {
				System.out.println("����Ŭ������ method "+loc_i);
				System.out.println("�ٱ�Ŭ������ �ν��Ͻ����� i = "+i);
				//final�� ���� �Ű������� ����� �� �־���.
				//������ ���� �������� JDK 1.8���� �� �� �ְ� �ٲ����.
				System.out.println("�Ű�����(Parameter) param_i = "+ param_i+", param_j = "+param_j);
				//final�� ���� ���������� ����� �� �־���.
				//������ ���� �������� JDK 1.8���� �� �� �ְ� �ٲ����.
				System.out.println("�������� local_i = "+local_i+", local_j = "+local_j);
				
				//final�� Ư¡ : ������ �Ұ�
//				local_i = 2018; //JDK1.8���ʹ� ����� ���������� �� �Ҵ��� �� �� ����.
			}
			
		}
		///////////////////////////����Ŭ���� ��///////////////////////////////
		
		//����Ŭ������ ��üȭ
		Local lo = new Local();
		//������ ��ü�� Ŭ���� ���� �ڿ��� ����� �� �ִ�.
//		loc_i = 100; //���� ������ ���� ��� �Ұ�, lo�� �ٿ����Ѵ�.
		lo.loc_i = 100;
		lo.locMethod();
		
		System.out.println("�ٱ� Ŭ������ method ȣ��");
		
	}
	
	public static void main(String[] args) {
		//static������ main���� ����Ŭ���� ���� �޼ҵ带 ȣ��
		//�ٱ�Ŭ���� �ν��Ͻ�ȭ
		LocalOuter lo = new LocalOuter();
		lo.method(12, 4); //�޼ҵ带 �ҷ��ٰ� ����Ŭ������ �����ڰ� ȣ������� �ʴ´�.
		//����Ŭ������ ������ ����Ŭ������ �ִ� �޼ҵ� �ȿ��� ����Ŭ������ ��üȭ �ؾ��Ѵ�.
		
	}//main

}//class

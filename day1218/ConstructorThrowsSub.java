package day1218;

public class ConstructorThrowsSub extends ConstructorThrows{
	
	//�θ�Ŭ������ �����ڰ� ������ ���ܸ� ������ �ڽ�Ŭ������ �����ڿ����� ���ܸ� ���� Error�� ���־� �Ѵ�.
	public ConstructorThrowsSub() throws ClassNotFoundException{
		super();
		//error�� ���ַ��� try~catch�� ���� �������� ���� ù�ٿ� �;��ϴ� super�� �׷��� ���ϰ� �Ǵ� ��찡 �����.
		//�θ�Ŭ������ �����ڰ� Compile Exception�� throws�� ������
		//�����ڸ� ȣ���ϴ� �ڽ� Ŭ���������� �ݵ�� ���ܸ� ó���ؾ��ϴ� ������ Error�� �߻��Ѵ�.
	}
	
	public static void main(String[] args) {

	}

}

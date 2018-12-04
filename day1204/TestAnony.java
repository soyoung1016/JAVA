package day1204;

/**
 * �������̽��� method�� �Ű������϶� �����ϰ� ����ϴ� ���<br>
 * @author owner
 */
public class TestAnony {
	
	public void useAnonInter(AnonyInter ai) {
		System.out.println(ai.getMsg()+" "+ai.getName());
	}

	public static void main(String[] args) {
//		AnonyInter ai = new AnonyInter(); //ERROR, �������̽��� ��üȭ �� �� ����.
		//�������̽��� �� �� �ִ°��� ���, �߻�޼ҵ�
		//Ŭ������ �� �� �ִ� �� ����, �޼ҵ�
		
		//�������̽��� �Ű������� ���� ����
		//1. �������̽��� ������ Ŭ������ ����(AnonyInter�� �������̽� ���Ϸ� ����)
		//2. ����Ŭ������ ��ü�� ����
		AnonyImpl ai = new AnonyImpl(); //is a 
		//3. �Ű������� ���� method�� ȣ���ϱ� ���� ��ü����
		TestAnony ta = new TestAnony();
		//4. method ȣ��
		ta.useAnonInter(ai); //�ڽ��̹Ƿ� ȣ�� ����
		
		//�޼ҵ� �ϳ� ȣ���ϰڴٰ� ������ �ʹ� ���!!
		
		System.out.println("=============anonymous innerclass===============");
		//anonymous inner class�� ����ϸ� Ŭ������ ���� ���� �ʿ䰡 ����.
		
		ta.useAnonInter(new AnonyInter() {
			
			@Override
			public String getName() {
				return "������"+test();
			}
			
			@Override
			public String getMsg() {
				return "�´���";
			}
			
			public String test() {
				return "�ڽ� method";
			}
			
		});//anonymous inner class
		//���ϰ������ �����ڵ� �ݺ��Ǿ���Ѵ�. �ѹ��ۿ� ����� �ȵ�.
		
	}

}

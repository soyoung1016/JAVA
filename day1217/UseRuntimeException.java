package day1217;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * JVM�� �ڵ����� ó�����ִ� RuntimeException
 * @author owner
 */
public class UseRuntimeException {

	public static void main(String[] args) {
		
		//1. JTextArea���� (�÷���, ���)
		JTextArea jta = new JTextArea(10,40);
		jta.setEditable(false);
		jta.append("��Ӿ�Ӿ�Ӥ�");
		//2.
		JScrollPane jsp = new JScrollPane(jta);
		//3. MessageDialog�� �ι�° �Ű������� ������Ʈ�� �Ҵ�
		JOptionPane.showMessageDialog(null, jsp);
		
		
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = 0;
			
			result = num1 / num2;
			
			System.out.println(num1+" / "+num2+" = "+result);
		
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("�迭�� �ε����� �߸��Ǿ����ϴ�."); //out�� err�� �ٲٸ� ������! ������ �޼���!
			//�Ϲ� ����ڿ��Դ� ������ ������ �ڼ��ϰ� �����ָ� �ȵȴ�(���Ȼ��� ����)
			System.err.println("������ ���� : "+aioobe.getMessage());
			System.err.println("����ó�� Ŭ������� ���� : "+aioobe);
			aioobe.printStackTrace(); //�ڼ��� ����
		} catch (NumberFormatException nfe) {
			System.err.println("�Է°��� ���� ���°� �ƴմϴ�.");
			System.err.println("������ ���� : "+nfe.getMessage());
			System.err.println("����ó�� Ŭ������� ���� : "+nfe);
			nfe.printStackTrace();
		} catch (ArithmeticException ae) {
			System.err.println("0���� ���� �� �����ϴ�.");
			ae.printStackTrace();
		} catch (Exception e) {
			System.err.println("�����ڰ� �������� ���� �����Դϴ�.");
			e.printStackTrace();
			//Exception �ϳ��� ���� �� ó�����ִµ� �� ���� �Ἥ ó���ұ�? �װ��� �� �� �ùٸ� �����ΰ�?
			//A. ���ܴ� ������� ó�����־�� �ϱ� �����̴�. ���ܿ� ���� �ڵ尡 �� �ֱ� ����(������ syse�Ἥ �׷�..)
		} finally {
			System.out.println("�ݵ�� ����Ǿ�� �� �ڵ�");
		}
	}

}

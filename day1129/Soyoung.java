package day1129;

/**
 * ����� ���� Ư¡�� Person���� ����پ��� �ڽ��� ������ ������ Ŭ����
 * @author owner
 */

public class Soyoung extends Person {
	
	public int octave;
	
	public Soyoung() {
		octave=10;
	}
	
	public String singing(String drink) {
		String Song = "";
		
		if(drink.equals("���ް�")) {
			octave=30;
			Song = "���� ���� �Ƹ���";
		} else if (drink.equals("��")) {
			octave=15;
			Song = "think of me";
		} else if (drink.equals("����")) {
			octave=1;
			Song = "��縮";
		} else {
			octave=10;
			Song = "�ֱ���";
		}
		return Song;
	}
		
	
	
	
	
	
}

package day1130;

import java.awt.Dialog;
import java.awt.Frame;

public class Test extends Dialog { //부모클래스인 Dialog에 기본생성자가 없어서 ERROR

	public Test() {
		super(new Frame(), "다이얼로그", true);

	}
}

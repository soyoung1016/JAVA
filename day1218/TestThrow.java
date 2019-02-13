package day1218;

import java.util.Random;

/**
 * 森須研 悪薦稽 降持
 * @author owner
 */
public class TestThrow {

	public void teacksung() throws Exception {
		String[] grade = {"段去俳持","掻俳持","壱去俳持"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if(randomGd.equals("段去俳持")) {
			throw new Exception(randomGd+" 楳還級 榎尻背醤馬澗 採歳 焼艦畏柔艦猿? しじ? ししじ");
		} else {
			System.out.println(randomGd+"戚 眼壕研 杷酔檎 乞献担 走蟹娃陥.");
		}
		
	}
	
	/**
	 * 掩聖 亜陥亜 眼壕研 杷酔澗 俳持聖 左檎 舛税紫噺研 姥薄廃陥.
	 * @throws Exception 
	 */
	public void teacksung2() {
		String[] grade = {"段去俳持","掻俳持","壱去俳持"};
		String randomGd = grade[new Random().nextInt(grade.length)];
		
		if(randomGd.equals("段去俳持")) {
				throw new TobaccoException(/*randomGd+" 楳還級 榎尻背醤馬澗 採歳 焼艦畏柔艦猿? しじ? ししじ"*/);
		} else {
			System.out.println(randomGd+"戚 眼壕研 杷酔檎 乞献担 走蟹娃陥.");
		}
		
	}
	
	public static void main(String[] args) {
		TestThrow tt = new TestThrow();
		try {
			tt.teacksung();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------");
		try {
			tt.teacksung2();
		} catch (TobaccoException e) {
			e.printStackTrace();
		}
		
	}

}

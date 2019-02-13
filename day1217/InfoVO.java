package day1217;

public class InfoVO {
	private int javaScore, oracleScore;
	private String name;
	private int num;
	
	public InfoVO() {
		name = "";
		num = 0;
		javaScore = 0;
		oracleScore = 0;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int tempNum) {
		this.num = tempNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public int getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}

}

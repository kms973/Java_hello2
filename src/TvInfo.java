
public class TvInfo {
	String Str;
	int YEAR, INCH;
	
	TvInfo(String Str, int YEAR, int INCH) {
		this.Str = Str;
		this.YEAR = YEAR;
		this.INCH = INCH;
	}
	void show() {
		System.out.println(Str + " 에서 만든 " + YEAR + "년형 " + INCH + "인치 TV");
	}
}

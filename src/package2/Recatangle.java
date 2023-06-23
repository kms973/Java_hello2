package package2;
// 사각형의 넓이를 구하는 클래스
public class Recatangle {
	private double width, height;
	
	public Recatangle() {}
	
	public double RecatangleArea(double width, double height) {
		this.width = width;
		this.height = height;
		
		return width * height;
	}

}



class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {

		System.out.println(super.getSize() + "인치" + this.color + "컬러");
	}

}

class IPTV extends ColorTV {
	private String IP;

	public IPTV(String IP, int size, int color) {
		super(size, color);
		this.IP = IP;
	}

	public void printProperty() {

		System.out.print(this.IP + " ");
		super.printProperty();
	}

}

public class Java30 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();

	}
}

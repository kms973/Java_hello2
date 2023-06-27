class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("dd~" + number);
	}
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
		
	}
	public void playApp() {
		System.out.println("app is running in " + androidVer);
	}
}
public class Java31 {
	public static void main(String[] args) {
	SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
	MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
	
	ph1.answer();
	ph1.playApp();
	System.out.println();
	ph2.answer();
	//ph2.playApp();
	
	}
}

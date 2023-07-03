package package3;

class DBox<L, R>{
	private L Left;
	private R Right;
	
	public void set(L l, R r) {
		this.Left = l;
		this.Right = r;
	}

	@Override
	public String toString() {
		return Left + "&" + Right;
		
	}
	
}

public class Javatest02 {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);

	}

}

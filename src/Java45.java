
class DBox<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + "&" + right;
	}
}

class DDBox<L, R> {
	private L box1;
	private R box2;

	public void set(L l, R r) {
		box1 = l;
		box2 = r;
	}

	public String toString() {
		return box1 + "\n" + box2;
	}
}

public class Java45 {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);

		System.out.println(ddbox);
	}
}

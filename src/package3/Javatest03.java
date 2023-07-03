package package3;

class BoxFactory extends Box {
	public static <T> Box<T> makeBox(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;

	}
}

public class Javatest03 {

	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());

		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		System.out.println(dBox.get());
	}

}

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class Java43 {
	public static void main(String[] args) {
//		Box<Apple> aBox = new Box<Apple>();
//		Box<Orange> oBox = new Box<Orange>();
		
		Box<Integer> iBox = new Box<>();
		iBox.set(24);
		
		Box<Double> dBox = new Box<>();
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());

//		aBox.set(new Apple());
//		oBox.set(new Orange());
//
//		Apple ap = aBox.get();
//		Orange og = oBox.get();
//
//		System.out.println(ap);
//		System.out.println(og);
	}
}

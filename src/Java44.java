class BoxFactory{
	public static <T> Box<T> makeBox(T o){
		Box<T>	box = new Box<T>();
		box.set(o);
		return box;
	}
}
public class Java44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(9.56);
		System.out.println(dBox.get());
	}

}

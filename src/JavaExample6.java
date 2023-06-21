
public class JavaExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song affa = new Song();
		Song abba = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		affa = new Song("Let it be, Hey Jude", "비틀즈", 1963, "영국");
		
		affa.show();
		abba.show();
	}

}

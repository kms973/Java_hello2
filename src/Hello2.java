public class Hello2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num = 10;
		num = (short)(num + 77L);
		int rate = 3;
		rate = (int)(rate * 3.5);
		System.out.println(num); //87
		System.out.println(rate); //10
		
		num = 10;
		num += 77L;
		rate = 3;
		rate *= 3.5;
		System.out.println(num); //87
		System.out.println(rate); // 10
		
		System.out.println(3 >= 2);
		System.out.println(3 <= 2);
		System.out.println(7.0 == 7);
		System.out.println(7.0 != 7);
		
		
	}

}

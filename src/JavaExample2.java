
public class JavaExample2 {

	public static void main(String[] args) {
		int num;
		
		num = 7;
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			i++;
			System.out.println();
		}
		
		for(int i = 2; i < 10; i++) {
			if(i % 2 == 1)
			for(int j = 1; j < 10; j++) {
				if(j % 2 == 1)
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}

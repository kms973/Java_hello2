


public class Javatest01 {
	
	void Gugudan(){}
	
	void printGugu(int n){
		for(int i = 1; i <=n; i++) {
			for(int j =1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		gugudan.printGugu(20); //1단부터 20단까지 출력
	}

}

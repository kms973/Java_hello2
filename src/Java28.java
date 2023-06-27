
public class Java28 {
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		int[][] arr = new int[3][4];
		int num = 1;
		int[] arr2 = {(int) Math.random()};
		
//		for(int i = 0 ; i < 3 ; i++) {
//			for (int j = 0 ; j < 4 ; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
		
		for (int i = 0 ; i < arr.length; i++) {
			for ( int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
//
//		int[] ar = { 1, 2, 3, 4, 5 };
//		int sum;
//		sum = 0;
//		for (int e : ar) {
//			System.out.print(e + " ");
//			sum += e;
//		}
//		System.out.println();
//		System.out.println(sum);
	}
}

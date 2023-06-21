
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StarPrint strPrint = new StarPrint();
//
//		strPrint.printTriangle(3);
//		System.out.println();
//		strPrint.printReverseTriangle(3);
		
//		GetSum getsum = new GetSum();
//		int num;
//		
//		num = 100;
//		
//		getsum.setNum(num);
//		
//		num = getsum.sum();
//		System.out.println(num);
		
//		Gugudan gugudan = new Gugudan();
//		gugudan.printGugu(10);
//		gugudan.printGugu(20);
		
		Grade grade = new Grade();//Grade.class를 메모리에 올림.
		
		
		grade.setGrade(90, 90, 100);
		grade.getAvg();
		grade.getGrade();
		
		Grade kim = new Grade();
		
		kim.setGrade(80, 50, 30);
		kim.getAvg();
		kim.getGrade();
		
		Grade ppp = new Grade();
		
		ppp.setGrade(70, 50, 30);
		ppp.getAvg();
		kim.getGrade();
	}

}

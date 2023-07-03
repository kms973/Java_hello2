import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyLinkedList{
	int num;
	MyLinkedList myLinkedList;
//	linkedlist는 구현방법이 정해져있다.
}
public class Java46 {

	public static void main(String[] args) {
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		
		my1.myLinkedList = my2;
		
		my2.myLinkedList = new MyLinkedList(); 
		
		
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("Robot");
		
		
		
		for (String str : list) {
			System.out.print(str + '\t');
		}
		System.out.println();
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
			
		}	
		System.out.println();
		
		
		list.remove(0);
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		
	}

}


public class Java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
		
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 +" "+ str2);
	}

	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}

}

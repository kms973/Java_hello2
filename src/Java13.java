	
public class Java13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		BankAccount ref3 = new BankAccount(3232);
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		ref3.checkMyBalance();
	}

}

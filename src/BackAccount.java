class BankAccount {
	int balance = 0; // 예금 잔액
	
	BankAccount(){
		System.out.println("우후후후훟후후");
	}
	BankAccount(int balance){
		this.balance = balance;
		System.out.println("어예우예어예이예");
	}
//	BankAccount(){} 생성자 함수는 기본으로 생성됨. 
	

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
package prob5;

public class Account {
	private String accountNo;
	private int balance;
	
	public void save(int money) {
		balance += money;
		System.out.println(accountNo + "계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		balance -= money;
		System.out.println(accountNo + "계좌에 " + money + "만원이 출금되었습니다.");
	}
	
	public void balance() {
		System.out.println(accountNo + "계좌의 잔고는 " + balance + "만원입니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(this.accountNo + "계좌가 개설되었습니다.");
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
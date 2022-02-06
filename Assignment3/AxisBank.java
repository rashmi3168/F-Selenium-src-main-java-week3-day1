package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit Amount is 1000");
		
	}
	public void superDeposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo bnk = new BankInfo();
	    AxisBank ax = new AxisBank();
	    bnk.deposit();
	    bnk.fixed();
	    bnk.saving();
	    ax.deposit();
	    ax.superDeposit();

	}

}

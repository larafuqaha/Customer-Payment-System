/*Name: Lara Foqaha
  ID: 1220071
  lab section: 10
 */
package project;

public class Check extends CustomerPayment implements Payable {
	private int accountNumber;
	private double accountBalance;
	private int type;
	
	public static final int CASHIER=1; //constants
	public static final int CERTIFIED=2; 
	public static final int PERSONAL=3;
	
	public Check () {}
	public Check (String customerName, int customerId, double amount, int accountNumber, double accountBalance, int type)
	{
		super(customerName,customerId,amount);
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		this.type=type;
	}
		
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type=type;
	}
	public void deductAmountFromBalance()
	{
		if (type!=CASHIER) //type = CERTIFIED or type = PERSONAL
			accountBalance = accountBalance - amount;
	}
	@Override 
	public double calculatePayment()
	{
		return amount;
	}
	@Override
	public boolean isAuthorized()
	{
		if ((type == CASHIER) || (amount <= accountBalance))
		{   deductAmountFromBalance();
			return true; }
			
		return false;
	}
	@Override
	public String toString() {
		return "Check [accountNumber= " + accountNumber + ", accountBalance= " + accountBalance + ", type= " + type +super.toString();
	}
	@Override
	void printPaymentInfo()
	{
		System.out.println(this.toString()+ " calculated payment: "+calculatePayment());
	}
	

}

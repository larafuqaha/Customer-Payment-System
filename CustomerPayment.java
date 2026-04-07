/*Name: Lara Foqaha
  ID: 1220071
  lab section: 10
 */
package project;

public abstract class CustomerPayment implements Comparable<CustomerPayment>{
	protected String customerName;
	protected int customerId;
	protected double amount;
	
	public CustomerPayment() {}
	
	public CustomerPayment(String customerName, int customerId, double amount) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return " customerName= " + customerName + ", customerId= " + customerId + ", amount= " + amount
				+ "]";
	}

	@Override 
	public int compareTo(CustomerPayment a)
	{
		if (calculatePayment()> a.calculatePayment()) //descending order
			return -1;
		else if (calculatePayment() < a.calculatePayment())
			return 1;
		else return 0;
	}
	
	protected abstract double calculatePayment();
	
	void printPaymentInfo()
	{
		System.out.println(this.toString()+" calculated payment: "+calculatePayment());
	}
	
}

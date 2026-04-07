/*Name: Lara Foqaha
  ID: 1220071
  lab section: 10
 */
package project;

public class Cash extends CustomerPayment {
	private double discountRate;
	
	public Cash()
	{
		
	}
	public Cash(String customerName, int customerId, double amount, double discountRate) {
		super(customerName, customerId, amount);
		this.discountRate = discountRate;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	public double calculatePayment()
	{
		return amount-((discountRate/100)*amount);
	}
	@Override
	public String toString() {
		return "Cash [discountRate= " + discountRate + super.toString();
	}
	/*@Override
	void printPaymentInfo()
	{
		System.out.println(this.toString()+ " calculated payment: "+calculatePayment());
	}*/

}

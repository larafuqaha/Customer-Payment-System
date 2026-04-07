/*Name: Lara Foqaha
  ID: 1220071
  lab section: 10
 */
package project;
import java.util.*;

public class CreditCard extends CustomerPayment implements Payable{
	private double chargingFee;
	private Date expiryDate=new Date();
	
	public CreditCard()
	{
		
	}
	public CreditCard(String customerName, int customerId, double amount,double chargingFee, Date expiryDate)
	{
		super(customerName, customerId, amount);
		this.chargingFee = chargingFee;
		this.expiryDate = expiryDate;
	}
	public double getChargingFee() {
		return this.chargingFee;
	}
	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}
	public Date getExpiryDate() {
		return this.expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public double calculatePayment()
	{
		return amount+chargingFee;
	}
	@Override
	public boolean isAuthorized()
	{
		if (expiryDate.compareTo(new Date())>=0) //if = 0 ---> they are equal, if = 1---> expiry date > current date
			return true;
		return false;
			
	}
	@Override
	public String toString() {
		return "CreditCard [chargingFee= " + chargingFee + ", expiryDate= " + expiryDate +super.toString();
	}
	@Override
	void printPaymentInfo()
	{
		System.out.println(this.toString()+" calculated payment: "+calculatePayment());
	}
}

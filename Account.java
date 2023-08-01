public abstract class Account
{
	private String accNo;
	private int balance;
	
	public abstract int calculateInterest(int rate);
	
	
	
	public Account()
	{
		this("",0000);
	}
	
	public Account(String no, int bal)
	{
		setNo(no);
		setBal(bal);
	}
	
	public void setBal(int bal)
	{
		this.balance = bal;
	}
	
	public int getBal()
	{
		return balance;
	}
	
	
	
	public void setNo(String no)
	{
		this.accNo = no;
	}
	
	public String getNo()
	{
		return accNo;
	}
	
	
	
	
	
	public String toString()
	{
		return "Account Number: " + getNo() + "\n" 
			 + "Balance: " + getBal();
	}
	
	
	
}
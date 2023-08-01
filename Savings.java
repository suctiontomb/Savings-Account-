public class Savings extends Account
{
	private int minBalance;
	
	
	
	public Savings()
	{
		this("",0000, 0000);
	}

	
	public Savings(String no, int bal, int minBal)
	{
		super(no,bal);
		
		setMinBal(minBal);
	}
	
	
	public int calculateInterest(int rate)
	{
		if(getBal() > getMinBal())
		{
			return 0;
		}
		else
		{
			return getBal() * rate / 100;
		}
	}
	
	
	public void setMinBal(int minBal)
	{
		this.minBalance = minBal;
	}
	
	public int getMinBal()
	{
		return minBalance;
	}
	
	
	public String toString()
	{
		return super.toString() + "\n" + "minimum balance: " + getMinBal();
	}
	
	public static void main(String[] args)
	{
		Savings s1 = new Savings("832 3432 2343", 5000, 100);
		
		System.out.println(s1);
	}
}
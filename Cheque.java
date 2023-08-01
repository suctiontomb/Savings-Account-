public class Cheque extends Account
{
	private int oLimit;
	
	
	
	public Cheque()
	{
		this("",0000, 0000);
	}

	
	public Cheque(String no, int bal, int lim)
	{
		super(no,bal);
		
		setOLim(lim);
	}
	
	
	public int calculateInterest(int rate)
	{
		
		if(getBal() < getOLim())
		{
			return getBal() * 4 * rate / 100;
		}
		
		if( getBal() < 0 && getBal() >= getOLim())
		{
			return getBal() * 2 * rate / 100;
		}

		if(getBal() >= 0)
		{
			return getBal() * rate / 100;
		}
		else 
			
		return 0;
	}

	
	public void setOLim(int lim)
	{
		this.oLimit = lim;
	}
	
	public int getOLim()
	{
		return oLimit;
	}
	
	
	public String toString()
	{
		return super.toString() + "\n" + "Overdraft limit: " + getOLim();
	}
	
	public static void main(String[] args)
	{
		Cheque c1 = new Cheque("832 3432 2343", 5000, -500);
		
		System.out.println(c1);
	}
	
	
	
}
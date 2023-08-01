public class TestAccounts
{

public static void main(String[] args)
{
	Account a1 = new Savings("12345679",500, 450);
	System.out.println("a1: "+a1);
	System.out.println("The interest for: "+a1.getNo()+" is "+ a1.calculateInterest(10));

	Account a2 = new Cheque("123456",-500, -10000);
    System.out.println("a2: "+a2);
	System.out.println("The interest for: "+a2.getNo()+" is "+ a2.calculateInterest(10));
	
	}
}
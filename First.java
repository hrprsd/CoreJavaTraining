class Account
{
	void withdraw()
	{
		System.out.println("Withdraw here");
	}
	void deposit()
	{
		System.out.println("Deposit here");
	}
}
class Magician
{
	void doTrick()
	{
		System.out.println("Here's a trick for you");
	}

	void performMagic(String mName)
	{
		System.out.println(mName + " is performing magic");
	}
}
class Dancer 
{
	void dance()
	{
		System.out.println("I am dancing");
	}
	void jump()
	{
		System.out.println("I am jumping");
	}
}
class First
{
	public static void main(String args[]) {
	System.out.println("Hello First");
	
	Dancer d1 = new Dancer();
	Magician m1 = new Magician();
	Magician m2 = new Magician();
	Account a1 = new Account();
	d1.dance();
	d1.jump();
	a1.withdraw();
	a1.deposit();
	m1.doTrick();
	m1.performMagic("This");
	m2.performMagic("That");
	}
}
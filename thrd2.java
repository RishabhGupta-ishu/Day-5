class thrd2 extends Thread
{
thrd2(String s)
{
super(s);
}
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(getName());
		try
		{
			Thread.sleep(1000);
		}catch(Exception e){}	
	}
System.out.println(getName()+"dead");
}
}
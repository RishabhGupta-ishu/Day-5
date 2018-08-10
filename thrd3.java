class thrd3 extends Thread
{
thrd3(String s)
{
super(s);
}
public void run()
{
	for(int i=1;i<=10;i++)
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
import java.lang.*;
import java.awt.*;
public class ShutDownHooks implements Runnable
{
public ShutDownHooks()
{

}

public void run()
{
System.out.println("***shut down hook started");
System.out.println("***Application Shutting Down***");
try
{
Thread.sleep(1000*5);
}catch(Exception e){}
}
public static void main(String aap[])
{
Runtime runtime=Runtime.getRuntime();
ShutDownHooks hook=new ShutDownHooks();
Thread t1=new Thread(hook);
//runtime.addShutdownHook(new thrd2("thread1"));
runtime.addShutdownHook(t1);
int x=10/0 ;
Frame testframe=new Frame("Test Frame");
testframe.setSize(100,100);
testframe.setVisible(true);
}
}
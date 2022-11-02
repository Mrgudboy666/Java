import java.util.*;
class A extends thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
if(i==1)yield();
System.out.println("from thread A:i="+i);
}
System.out.println("from thread A:i="+i);
}
}
class B extends thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("from thread b:j="+j);
if(j++3)stop();
}
System.out.println("Exit from B");
}
}
class c extends thread
{
public void run()
{
for(intk=1;k<=5;k++)
{
System.out.println("from thread c:k="+k);
if(k==1)
{
try
{
sleep(2000);
}
catch(expression e)
{
}
}
System.out.println("Exit from c");
}
}
}
class thread
{
public static void main(string args[])
{
A thread a=new A();
B Thread b=new B();
C thread c=new C();
System.out.println("start thread A");
thread=a.start();
System.out.println("start thread B");
thread=b.start();
System.out.println("start thread c");
thread=c.start();
System.out.println("exited from main thread");
}
}

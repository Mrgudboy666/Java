import java.io.*;
import java.util.*;
interface A
{
 void putdata(int dp);
}
interface B
{
 void getdata(int wd);
}
class C implements A,B
{
 int bal;
 C(int b)
 {
  bal=b;
 }
 public void putdata(int dp)
 {
  int cb;
  cb=bal+dp;
  System.out.println("Deposited amount="+dp);
  System.out.println("Current balance="+cb);
 }
 public void getdata(int wd)
 {
  int wb;
  wb=bal-wd;
  System.out.println("Withdrawing amount="+wd);
  System.out.println("Current balance="+wb);
 }
}
class bankk
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Informations");
 System.out.println("Enter the balance=");
 int balance=s.nextInt();
 C obj=new C(balance);
 System.out.println("Deposited by the holder=");
 int dp=s.nextInt();
 obj.putdata(dp);
 System.out.println("Amount withdrawing by the holder=");
 int wd=s.nextInt();
 obj.getdata(wd);
 }
}
 

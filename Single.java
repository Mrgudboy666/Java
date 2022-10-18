import java.util.*;
class Employee
{
    int empcode;
    String name;
    Employee(int e,String n)
    {
        empcode=e;
        name=n;
    }
    void putdata()
    {
        System.out.println("Empcode: " +empcode);
        System.out.println("Name: " +name);
    }
}
class Salary extends Employee
{
    float bp,da,hra,grosspay;
    Salary(int e,String n,float b,float d,float h)
    {
        super(e,n);
        bp=b;
        da=d;
        hra=h;
        grosspay=bp+hra+da;
    }
    void putsalary()
    {
        System.out.println("Basic pay: " +bp);
        System.out.println("DA: " +da);
        System.out.println("HRA: " +hra);
        System.out.println("Grosspay: " +grosspay);
    }
}
class Single
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee code, Name, Basicpay, DA and HRA");
        int e=s.nextInt();
        String n=s.next();
        float b=s.nextInt();
        float d=s.nextInt();
        float h=s.nextInt();
        Salary s1=new Salary(e,n,b,d,h);
        s1.putdata();
        s1.putsalary();
    }
}
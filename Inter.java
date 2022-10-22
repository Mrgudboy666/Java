import java.util.*;
interface A
{
    void display();
    void mark();
}
class B implements A 
{
    String name;
    int rollno;
    int m1,m2,m3,total;
    public void mark()
    {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=p.next();
        System.out.println("Enetr Roll no: ");
        rollno=p.nextInt();
        System.out.println("Enter Marks: ");
        m1=p.nextInt();
        m2=p.nextInt();
        m3=p.nextInt();
        total=m1+m2+m3;
    }
    public void display()
    {
        System.out.println("TOTAL: " +total);
    }
}
class Inter
{
    public static void main(String args[])
    {
        B st1=new B();
        st1.mark();
        st1.display();
    }
}
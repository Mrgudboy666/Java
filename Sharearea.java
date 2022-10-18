import java.util.*;
import java.lang.*;
class Shape
{
	int area (int a)
	{
		return a*a;
	}
	int area (int l,int b)
	{
		return l*b;
	}
	double area(double a,double b,double c)
	{
		double s=(a+b+c)/2;
		return(Math.sqrt(s*(s-a)*(s-c)));
	}
}

class Sharearea
{
	public static void main(String args[])
	{
		Shape sh=new Shape();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of square");
		int a=s.nextInt();
		int ar1=sh.area(a);
		System.out.println("Area = " +ar1);
		System.out.println("Enter the side of rectangle");
		int l=s.nextInt();
		int b=s.nextInt();
		int ar2=sh.area(l,b);
		System.out.println("Area of rectangle = " +ar2);
		System.out.println("Enter the side of traingle");
		double p=s.nextInt();
		double q=s.nextInt();
		double r=s.nextInt();
		double ar3=sh.area(p,q,r);
		System.out.println("Area of triangle = " +ar3);
	}
}
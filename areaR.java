import java.util.*;
class Rectangle
{
	int length,breadth;
	void getdata(int x,int b)
	{
		length=x;
		breadth=b;
	}
	int area()
	{
		return length*breadth;
	}
}
class RectangleArea
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		int l=s.nextInt();
		int b=s.nextInt();
		Rectangle r=new Rectangle();
		r.getdata(l,b);
		int a=r.area();
		System.out.println("Area is" +a);
	}
}

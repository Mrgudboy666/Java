import java.util.*;
class Box
{
	int l,b,h;
	Box(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	int volume()
	{
		return(l*b*h);
	}
	void putdata()
	{
		System.out.println("Length=" +l);
		System.out.println("Breadth=" +b);
		System.out.println("Height=" +h);
	}
}
class volume
{
	public static void main(String args[]){
		System.out.println("Enter the length,breadth,height");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		Box b=new Box(x,y,z);
		b.putdata();
		int v=b.volume();
		System.out.println("Volume of box=" +v);
	}
}

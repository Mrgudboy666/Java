import java.io.*;
import java.util.Scanner;
class bubblesort
{
	void sort(int array[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int s=i;
			for(int j=0;j<(n-1);j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	void print(int array[],int n)
	{
		for(int i=0;i<n;i++)
		System.out.print(array[i]+" ");
		System.out.println();
	}
	public static  void main(String args[])
	{
		bubblesort obj=new bubblesort();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		array[i]=s.nextInt();
		System.out.println("Array before sort :");
		obj.print(array,n);
		obj.sort(array,n);
		System.out.println("Array after sort :");
		obj.print(array,n);
	}
}

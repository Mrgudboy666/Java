import java.io.*;
import java.util.Scanner;
class selection
{
   public static void main(String args[])
   {
      System.out.println("enter the no of elements");
      Scanner s=new Scanner(System.in);
      int n =s.nextInt();
      int [] array=new int[n];
      System.out.println("enter elements ");
      for(int i=0;i<n;i++)
      {
         array[i]=s.nextInt();
      }
      for(int i=0;i<n-1;i++)
      {
         for(int j=i+1;j<n;j++)
         {
            if(array[i]>array[j])
            {
               int temp = array[i];
               array[i]=array[j];
               array[j]=temp;   
            } 
         }
     }
     System.out.println("after sorting the array");
     for(int i=0;i<n;i++)
     {
         System.out.print(array[i]+" ");
     }
   }
}
import java.util.*;
import java.io.*;

public class Array
{
	public static void main(String args[]) 
  	{
	
		int row, col, i, j;
       		int arr[][] = new int[10][10];
       		
		

	    	PrintWriter pw1=new PrintWriter(System.out,true);
		Scanner scan = new Scanner(System.in);
       		pw1.print("Enter Number of Row for Array (max 10) : ");
       		row = scan.nextInt();

       		pw1.print("Enter Number of Column for Array (max 10) : ");
       		col = scan.nextInt();
	   
		pw1.print("Enter " +(row*col)+ " Array Elements : ");
		pw1.flush();
		pw1.close();

       		for(i=0; i<row; i++)
      		{
       	    		for(j=0; j<col; j++)
           		{
              			 arr[i][j] = scan.nextInt();
           		}
      		}

	  	PrintWriter pw2=new PrintWriter(System.out);
       		pw2.print("The Array is :\n");
       		for(i=0; i<row; i++)
       		{
          		 for(j=0; j<col; j++)
          		 {
              			 pw2.print(arr[i][j]+ "  ");
           		 }
           	pw2.println();
 		
       		}

	pw2.flush();
	pw2.close();
	
   
  }
}


























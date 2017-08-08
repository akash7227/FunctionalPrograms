import java.util.*;
class Power{
	public static void main(String...arg)
	{
		int num=Integer.parseInt(arg[0]);
		if(num>=0 && num<31)
		{
			for(int i=0;i<num;i++)
			{
				System.out.println("pow of 2^"+i+"  "+(int)Math.pow(2,i));
			}
		}
		else
		{
			System.out.println("number is out of range ");

		}



	}


}	

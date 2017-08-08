import java.util.*;
class LeapYear{
	public static void main(String...args)
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year ");
		year=sc.nextInt();
		if(year>999)
		{
			if(year%400==0 || (year%4==0 && year%100!=0))
			{

				System.out.println(year+" is leap year");
			}


			else 
			{
				System.out.println(year+" is not leap year");

			}
		}

		else 
		{
		System.out.println("enter a valid year");
		}
	}

}

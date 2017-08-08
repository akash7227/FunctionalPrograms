import java.util.*;
class Harmonic{
	public static void main(String...args)
	{
		double data=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num!=0)
		{

			for(int i=1;i<=num;i++)
			{
				System.out.print("1/"+i+" + ");
				data=data+(double)1/i;


			}	
			System.out.println();
			System.out.print("Nth harmonic value is :"+data);

		}

		else
		{
			System.out.println("does not exit");
		}
	}
}

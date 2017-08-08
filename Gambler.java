import java.util.*;
class Gambler{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int stack,goal,time,win=0,lose=0;
		double win_per,loss_per;

		System.out.println("enter amount of money ");
		stack=sc.nextInt();

		System.out.println("enter amount of money to reach goal ");
		goal=sc.nextInt();

		System.out.println("enter number of time ");
		time=sc.nextInt();


		if(time>=0)
		{

			for(int i=1;i<time;i++)
			{
				System.out.println("no .of chance "+i);

				if(stack==goal)
				{
					System.out.println("reached goal");
					break;
				}

				else if(stack==0)
				{
					System.out.println("sorry you dont have money");
					break;
				}

				double r=Math.random();
				if(r<0.4)
				{
					lose++;
					System.out.println("you loss "+lose+ "times");
				}
				else
				{
					win++;
					System.out.println("you win "+win+ "times");
				}

			}
		}


		loss_per=(double)lose/time*100;
		win_per=(double)win/time*100;
		System.out.println("% loss"+loss_per);
		System.out.println("% win"+win_per);
	}

}

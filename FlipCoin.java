import java.util.*;
class FlipCoin{
	public static void main(String...args)
	{
	

	int tail=0,head=0;
	double per_tail,per_head;

	Random r=new Random();
	float max=1.0f,min=0.0f;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter  number   of   times   to   Flip   Coin");
	int a =sc.nextInt();
	if(a>0)
	{
		for(int i=0;i<a;i++)
		{
			float result = r.nextFloat() *(max - min) + min;
		
			if(result<0.5)
			{
			//System.out.println("tail");
			tail++;
			

			}
			else
			{ 
			//System.out.println("head");
				head++;
		
		
			}
		}
		System.out.println("total no of tail :"+tail);

		System.out.println("total no of head :"+head);
		per_tail=(double)tail/a*100;

		System.out.println("total tail in % :"+per_tail);
		per_head=(double)head/a*100;

		System.out.println("total head in % :"+per_head);

 
	}

	}
}

import java.util.*;
class SumofthreeInteger{
	public static void main(String...args)
	{
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("how many integer you want to enter");
	int N=sc.nextInt();

	int[] sum=new int[N];
	System.out.println("enter the value of integer");
	for(int l=0;l<N;l++)
	{
	sum[l]=sc.nextInt();
	}
	



	for(int i=0;i<N-2;i++)
	{
		for(int j=i+1;j<N-1;j++)
		{
			for(int k=j+1;k<N;k++)	
			{
				int data=sum[i]+sum[j]+sum[k];	
				if(data==0)
				{ 
				count++;
				System.out.println("[ "+sum[i]+" "+sum[j]+" "+sum[k]+"]");
				break;	
				}
			}
		}
	}
	System.out.println("total "+count);

}
}

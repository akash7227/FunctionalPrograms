import java.util.*;
class Replace{
	public static void main(String...args)
	{
		System.out.println("Enter a name");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String var="hello <<username>> how are you";
		if(a.length()>=3)
		{

			String aa=var.replace("<<username>>",a);
			System.out.println(aa);
		}
		else
		{
			System.out.println("min length is 3");
		}


	}	

}

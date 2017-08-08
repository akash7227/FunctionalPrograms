import java.util.*;
class Distance{
	public static void main(String...args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double x1=Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0),2));
		System.out.println("Euclidean   distance   from   the   point   (x,   y) ("+x+" "+y+")  to   the   origin   (0,   0) is "+x1);
}
}

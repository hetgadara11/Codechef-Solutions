import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    if(p+q==0 || p+q<=2 || p+q%2==0)
		    {
		        System.out.println("ALICE");
		    }
		    else
		    {
		        System.out.println("BOB");
		    }
		}
		

	}
}
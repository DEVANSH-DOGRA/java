/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Blockgame
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		// your code goes here
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int temp=n;
		    int rem,rev=0;
		    while(n!=0){
		        rem=n%10;
		        rev=rev*10+rem;
		        n=n/10;
		    }
		    if(temp==rev)
		    System.out.println("wins");
		    else
		        System.out.println("loses");
		    
		}
	}
}

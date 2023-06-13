/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class twodolist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int N=sc.nextInt();
		    int c=0;
		      int D[]=new int[N];
		    for(int i=0;i<N;i++){
		     D[i]=sc.nextInt(0); 
		    }
		    for(int i=0;i<N;i++){
		        if(D[i]>1000){
		            c++;
		        }
		    }
		    System.out.println(N-c);
		}
	}
}

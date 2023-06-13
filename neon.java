import java.util.*;
public class neon
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.:");
		int n=sc.nextInt();
		int sq=n*n;
		//int temp=sq;
		int rem,sum=0;
		while(sq!=0){
		    rem=sq%10;
		    sum=sum+rem;
		    sq=sq/10;
		}
		if(sum==n){
		    System.out.println("Yes");
		    
		}
		else{
		    System.out.println("No");
		}
		
	}
}

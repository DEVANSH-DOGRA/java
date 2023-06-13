import java.util.*;
 class armstrong
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	for(int i=100;i<=999;i++){
	    int temp=i;
	    int rem,sum=0;
	    while(temp!=0){
	       // temp=i;
	        rem=temp%10;
	        sum+=rem*rem*rem;
	        temp=temp/10;
	    }
	    if(sum==i){
	        System.out.println(i);
	    }
	}
	}
}

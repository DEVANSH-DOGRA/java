/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class maxonesinbinaryarr
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int count=0,max;
		int arr[]=new int[len];
		for(int i=0;i<len;i++){
		    arr[i]=sc.nextInt();
		    
		}
		for(int i=0;i<len-1;i++){
		    if(arr[i]==1 && arr[i+1]==1){
		        count++;
		    }
		    else{
		        max=count;
		        count=0;
		    }
		}
		System.out.println(count+1);
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class asciistr1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c1=s.charAt(0);
		int a1= (int)c1;
		int count=1;
        	for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==' '){
		    
		        count++;
		    }   
			}
            	    System.out.println(count);
		System.out.println(c1+" "+a1);
		
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==' '){
		       
		        char ch=s.charAt(i+1);
		        int a= (int)ch;
		        System.out.println(ch+" "+a);   
		        
		    }
		}
		
	}
}

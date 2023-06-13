/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class reverseword
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		String str1="";
        String ans ="";
		
		for(int i=0;i<str.length();i++)
        {
		    if(str.charAt(i)==' ')
            {
                if(ans != "")
                {
                ans = ans + " " + str1;
                }
                else
                {
                    ans =str1;
                }
                str1="";
		    }
            else
            {
                str1 = str.charAt(i) + str1;
            }
		    // System.out.println(str1);
		}
                ans = ans + " " + str1;

		    System.out.println(ans);
	}
}

 /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList <Integer> ls=new ArrayList<Integer>();
		ls.add(sc.nextInt());
		ls.add(sc.nextInt());
		ls.add(sc.nextInt());
	/*	ls.add(63);
		ls.add(43);
		ls.add(34);
		ls.add(31);*/
		for(int i=0;i<ls.size();i++){
		    if(ls.get(i)==37)
		    System.out.print("true");
		}
		
	}
}

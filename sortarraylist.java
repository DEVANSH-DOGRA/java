import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList <Integer> ls=new ArrayList<Integer>();
		ls.add(0);
		ls.add(10);
		ls.add(3);
		ls.add(5);
		ls.add(22);
		ls.add(10);
	/*	ArrayList<Integer> ls1=new ArrayList<Integer>();
		int n=ls.size()-1;
		while(n>=0){
		    ls1.add(ls.get(n));
		    n--;
		}*/
		int temp,i=0,j=ls.size()-1;
		while(i<j){
		    temp=ls.get(i);
		    ls.set(i,ls.get(j));
		    ls.set(j,temp);
		    i++;
		    j--;
		}
		System.out.print(ls);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.sort(ls,Collections.reverseOrder());
		System.out.print(ls);
	}
}

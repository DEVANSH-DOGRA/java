import java.util.*;
class noofwords{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int c=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                c++;
            }
        }
        System.out.println(c);
    }
}
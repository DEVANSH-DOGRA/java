import java.util.*;
class checkletter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean per=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                per= true;
            }

        }
        System.out.println(per);
    }
}
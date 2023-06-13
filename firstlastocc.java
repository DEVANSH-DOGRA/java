import java.util.*;
class firstlastocc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int e1=s.indexOf('e');
        int el=s.lastIndexOf('e');
        System.out.println("1st index="+e1+"last index="+el);
    }
}
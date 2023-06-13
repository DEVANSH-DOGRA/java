import java.util.*;
class caple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String stru="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                stru=stru+ch;
            }
            else{
                continue;
            }
        }
        System.out.println(stru);
    }
}

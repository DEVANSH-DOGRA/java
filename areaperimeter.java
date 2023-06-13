import java.util.*;
class areaperimeter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b;
        System.out.println("Enter l,b");
        l=sc.nextInt();
        b=sc.nextInt();
        int p=2*(l+b);
        int a=l*b;
        if(a>b){
            System.out.println("Greater");
        }
        else{
            System.out.println("Not Greater");
        }
    }
}
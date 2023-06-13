import java.util.Scanner;
class threedig{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=0,rem;
        n=sc.nextInt();
        while(n!=0){
            rem=n%10;
            c++;
            n=n/10;
        }
        if(n==3){
            System.out.println("Three digit");
        }
        else{
            System.out.println(c+"digit");
        }
    }
}
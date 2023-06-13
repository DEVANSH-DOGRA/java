import java.util.*;
class seriessum{
    public static void main(String[] args) {
        
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum-i;
            }
            else{
                sum=sum+i;
            }
            
        }
        System.out.println("The sum is: "+sum);
    }
}
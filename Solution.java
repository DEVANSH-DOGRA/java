import java.util.*;
class divisor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,rem,div=0;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            int temp=n;
            while(n!=0)
            {
                rem=n%10;
                if(rem==0){
                    continue;
                }
                else if(temp%rem==0)
                {
                    div++;
                }   
                    
                    
                    n=n/10;
                
            }
            System.out.print(div);
        }
        
    }
}
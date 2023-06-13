import java.util.*;
class throwkeyword {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("you must be at least 18");

        }
        else{
            System.out.println("You are good to go");
        }
        
        }
        }
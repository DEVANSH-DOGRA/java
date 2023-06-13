import java.util.*;
class trycatchblock {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
     try{
        int arr[]={1,2,3};
        System.out.print(arr[5]);
    }
    catch(Exception e){
        System.out.print("wrong");
    }
    }
}
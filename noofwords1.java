import java.util.*;
class noofwords1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);{
         String s=sc.nextLine();
         int c=0;
         char arr[]=s.toCharArray();
         for(int i=0;i<arr.length;i++){
         if(arr[i]==' ' || arr[i]=="\t" || arr[i]=="\n"){
            c++;
         }

         }
         System.out.print(c+1);

         }
         }
         }
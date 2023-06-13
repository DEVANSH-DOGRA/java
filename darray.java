import java.util.Scanner;

public class darray {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //int ans=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
      int anss=0;

        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    count++;
                }

            }
            if(count>max){
                max=count;
                anss=i;
            }
        }
        System.out.println(anss);
    }
}
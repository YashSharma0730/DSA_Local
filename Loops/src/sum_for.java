import java.util.Scanner;

public class sum_for {
    public static void main (String [] args){
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            sum = sum + i ;
        }
        System.out.println(sum);
    }
}

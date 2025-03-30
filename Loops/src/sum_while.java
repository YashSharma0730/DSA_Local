import java.util.Scanner;

public class sum_while {
    public static void main(String[] args) {
        System.out.println("Enter your Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int n=1;
        while(n<=num){
            sum = sum +n;
            n++;
        }
        System.out.println(sum + " " + "is the sum of Numbers");
    }
}

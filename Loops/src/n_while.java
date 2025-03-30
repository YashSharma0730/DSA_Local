import java.util.Scanner;

public class n_while {
    public static void main(String[] args) {
        System.out.println("Enter your Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        while(num <= n){
            System.out.println(num +" "+"is the number");
            num=num+1;
        }
    }
}

import java.util.Scanner;

public class sum_stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while(num != -1){
            sum = sum +num;
            num++;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}

public class mul_5_7 {
    public static void main(String[] args) {
        int num = 1;
        while(true){
            if((num % 5 ==0)&&(num % 7 ==0)){
                System.out.println("Number Found" + " " + num);
                break;
            }
            num++;
        }
    }
}

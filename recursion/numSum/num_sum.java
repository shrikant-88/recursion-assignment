package numSum;
import java.util.Scanner;

public class num_sum {
    public static int Num_sum(int num){
        if(num <10){
            return num;
        }
        return num%10 + Num_sum(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        sc.close();
        int digit_sum = Num_sum(num);
        System.out.println("digit sum of number = "+ (digit_sum));
    }

}

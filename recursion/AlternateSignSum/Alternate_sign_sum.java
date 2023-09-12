package AlternateSignSum;
import java.util.Scanner;

public class Alternate_sign_sum { 
    // n=5 : 
    // output : 1 - 2 + 3 - 4 + 5 = 3;
    public static int print_alternate_sum(int n)
    {
     if(n==0){
        return 0;
     }   
     else if(n%2==0){
        return print_alternate_sum(n-1) - n;
     }
     else{
        return print_alternate_sum(n-1) + n;
     }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
    
        int result = print_alternate_sum(n);
        System.out.println("alternate sum = "+ result);
        
    }
}

package findSum;

import java.util.Scanner;

public class find_sum {
    public static int find_SUM(int arr[],int n){
        if(n == 0){
            return 0;
        }
        else{
            return arr[n-1]+find_SUM(arr, n-1);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        // taking size of array from user
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element of array ----------------------");
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int sum = find_SUM(arr, n);
        System.out.println("sum = "+sum);
    }
}

package maxElement;
import java.util.Scanner;

public class max_ele {

    static int maxEle = 0;
    // loop -- iterative approch
    public static void find_max(int arr[]){
        
        for(int i = 0;i<arr.length;i++){
            maxEle = Math.max(maxEle, arr[i]);
        }
    }
    // recursive approch
    public static void find_max(int arr[],int n){
        if(n == 0){
            return;
        }
        maxEle = Math.max(maxEle, arr[n-1]);
        find_max(arr, n-1);
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
        find_max(arr, n);
        System.out.println("max = "+maxEle);
        
    }
}

import java.util.Scanner;

public class LargestSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int maxSoFar = arr[0];
        int currentSum = 0;

        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(maxSoFar < currentSum)
                maxSoFar = currentSum;
            if(currentSum < 0)
                currentSum = 0;
        }
        System.out.print(maxSoFar);
    }
    
}

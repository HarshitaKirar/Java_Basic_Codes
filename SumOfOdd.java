import java.util.Scanner;

public class SumOfOdd {
    public static int OddSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
            
        }
        System.out.println("the sum of all odd numbers:"+ sum);
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any natural number");
        int n=sc.nextInt();
        OddSum(n);

    }
}

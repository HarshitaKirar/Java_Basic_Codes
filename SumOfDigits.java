import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no.");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
           
            int rem=num%10;
            sum=sum+rem;
             num=num/10;

        }
        System.out.println("the sum of digits of a number:"+ sum);
    }
    
}

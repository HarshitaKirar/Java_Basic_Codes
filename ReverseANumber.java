import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any no.");
        int num=sc.nextInt();
        int pow=10;
        int revNum=0;
        while(num>0){
         int rem=num%10;
         revNum=revNum*pow+rem;
         num=num/10;
        }
        System.out.println("reverse of no.:"+revNum);

    }
    
    
}

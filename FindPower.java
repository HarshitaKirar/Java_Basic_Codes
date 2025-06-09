import java.util.Scanner;
public class FindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int num1= sc.nextInt();
        System.out.println("enter another no.");
        int num2= sc.nextInt();
        int ans=1;
        for (int i=1;i<=num2;i++){
            ans=ans*num1;

        }System.out.println("a to power b is:"+ ans);

    }
}
//a^b=ans

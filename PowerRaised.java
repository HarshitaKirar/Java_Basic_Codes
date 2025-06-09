import java.util.Scanner;

public class PowerRaised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter the power");
        int pow=sc.nextInt();
        int ans=1;
        for(int i=1;i<=pow;i++){
              ans=ans*num;
        }
        
        System.out.println("the ans is:"+ ans);
    }
}

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any decimal no.");
        int binary_num=sc.nextInt();
        int ans=0;
        int pow=1;

        while(binary_num>0){
            int rem=binary_num % 10;
            ans=rem*pow+ans;
            binary_num=binary_num/10;
            pow=pow*2;

            
        }
        System.out.println("the number in decimal is:"+ans);
        sc.close();
    }
}

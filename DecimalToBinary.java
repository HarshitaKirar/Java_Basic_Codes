import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any decimal no.:");
        int decimal_num=sc.nextInt();
        int pow=1;
        int ans=0;
        
        if(decimal_num==0){
            System.out.println("the binary conversion is 0");
        }else{
        while(decimal_num>0){
            int rem=decimal_num % 2;
            ans= rem*pow+ans;
            decimal_num=decimal_num/2;
            pow=pow*10;
        }
        System.out.println("the binary conversion is:"+ans);
        }
    }
}

import java.util.Scanner;

public class SumOfstream{
   public static void main(String[] args) {
    System.out.println("enter any natural number");
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    
    int sum=0;
    while(num!=-1){
        sum=sum+num;
        num = sc.nextInt();
    }
    System.out.println(sum);
} 
}

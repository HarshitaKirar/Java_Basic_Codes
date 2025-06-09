import java.util.Scanner;

public class SumNaturalNumber {
   public static void main(String[] args) {
    System.out.println("enter any natural number");
    Scanner sc =new Scanner(System.in);
    int num = sc.nextInt();
    int i=1;
    int sum=0;
    while(num>=i){
        sum=sum+i;
        i++;
    }
    System.out.println(sum);
} 
}

//sum of n natural number
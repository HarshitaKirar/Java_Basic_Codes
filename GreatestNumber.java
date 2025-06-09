import java.util.Scanner;
public class GreatestNumber {
    public static void GreaterNumber(int a,int b) {
        if(a>b){
            System.out.println("a is greater than b");

        }
        else{
            System.out.println("b is greater than a");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers");
        int firstNum=sc.nextInt();
        int secondNum=sc.nextInt();
        GreaterNumber(firstNum, secondNum);

    }
}

import java.util.Scanner;

public class EligiblePerson {
    public static void toVote(int age) {
        if(age<18 && age>0){
            System.out.println("not eligible for voting");
        }else if(age>=18){
            System.out.println("eligible for voting");
        }else if(age<0 || age>100){
            System.out.println("not a valid age");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        toVote(age);
    }
}

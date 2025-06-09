// import java.util.Scanner;

// public class EvenAndDivisible {
//     public static void main(String[] args) {
//         System.out.println("enter any no.");
//         Scanner sc=new Scanner(System.in);
//         int num =sc.nextInt();
//         if(num%2==0 && num%3==0){
//             System.out.println("no.is divisible by 2 and 3");
//         }else{
//             System.err.println("not divisible by 2 and 3 both");
//         }
         
//     }
// }

// ternary operator
import java.util.Scanner;

public class EvenAndDivisible {
    public static void main(String[] args) {
        System.out.println("enter any no.");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        String ans;
        ans =(num%2==0 && num%3==0) ? "no.is divisible by 2 and 3":"not divisible by 2 and 3 both";
        System.out.println(ans);

        
         
    }
}

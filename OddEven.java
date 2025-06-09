// import java.util.Scanner;

// public class OddEven {
//     public static void main(String[] args) {
//        System.out.println("enter any no.");
//        Scanner sc = new Scanner (System.in);
//        int num =sc.nextInt();
//        if(num%2==0){
//         System.out.println("no.is even");
//        }
//        else{
//         System.out.println("no. is odd");
//        }
//     }
// }

 import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
       System.out.println("enter any no.");
       Scanner sc = new Scanner (System.in);
       int num =sc.nextInt();
       if((num^1)==num+1){
        System.out.println("no.is even");
       }
       else{
        System.out.println("no. is odd");
       }
    }
}
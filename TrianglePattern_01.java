import java.util.Scanner;

public class TrianglePattern_01 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
    System.out.println("enter no. of rows and columns");
    int r=sc.nextInt();
    int c=sc.nextInt();
    for (int i=1;i<=r;i++){
        for(int j=1;j<=i;j++) {
        System.out.print("* ");
    }
    System.out.println();
}
sc.close();
}}

// 4
// 5
// * 
// * * 
// * * * 
// * * * * 
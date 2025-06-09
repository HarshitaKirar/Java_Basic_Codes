import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int rowNum=sc.nextInt();
        int colNum=sc.nextInt();
        for (int r=1;r<=rowNum;r++){
            for(int c=1;c<=colNum;c++){
                System.out.print("* ");
            }
        System.out.println("");
        }
    }
}

// 3
// 6
// * * * * * *
// * * * * * *
// * * * * * *
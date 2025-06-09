import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any no.");
        int num= sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
            
        }
        System.out.println("the total digits in this number"+ ":"+count);
    }
    
}

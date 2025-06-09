import java.util.Scanner;

public class NumbersAverage {
    
    public static float averageOfNumbers(int a,int b,int c) {
        float avg=(a+b+c)/3;
        System.out.println("the average is:"+ avg);
        return avg;
    }
    public static void main(String[] args) {
        System.out.println("eneter 3 no.s");
        Scanner sc=new Scanner(System.in);
        int firstnum=sc.nextInt();
        
        int secondnum=sc.nextInt();
        
        int thirdnum=sc.nextInt();
        
        averageOfNumbers(firstnum, secondnum,thirdnum);

    }
}
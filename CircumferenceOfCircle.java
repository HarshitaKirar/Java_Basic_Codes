import java.util.Scanner;

public class CircumferenceOfCircle {
    public static double circumference(float radius) {
        double perimeter=2*3.14* radius;
        System.out.println("the circumference of the circle is:"+perimeter);
        return perimeter;
    }
    public static void main(String[] args) {
        System.out.println("enter the radius");
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        circumference(radius);

        sc.close();
    }
}

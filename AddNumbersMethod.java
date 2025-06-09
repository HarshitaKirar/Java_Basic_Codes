import java.util.Scanner;

class AddingNumbers{
    int addNumbers(int a,int b){
        int ans= a+b;
        System.out.println("the addition of numbers:"+ans);
        return ans;

    }
}

public class AddNumbersMethod {
    public static void main(String[] args) {
      AddingNumbers obj=new AddingNumbers();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter two numbers:");
      int x=sc.nextInt();
      int y=sc.nextInt();
      obj.addNumbers(x, y);

    }
}

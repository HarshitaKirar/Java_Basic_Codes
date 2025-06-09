import java.util.Scanner;

public class Count {
    public static void counting() {
        Scanner sc=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        String choice;

        do{
        System.out.println("enter any number");
        int num=sc.nextInt();
        
        if(num>0){
            positive=positive+1;
        }
        else if(num==0){
            zero=zero+1;
        }
        else{
            negative=negative+1;
        }
        System.out.println("want to add more number y or n");
        choice=sc.next();
        }while(choice=="y"||choice=="Y");
       
       System.out.println("total no. of positive number:"+positive);
       System.out.println("total no. of negative number:"+negative);
       System.out.println("total no. of zeros:"+zero);

}
    public static void main(String[] args) {
        counting();
    }
}

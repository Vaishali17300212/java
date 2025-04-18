import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the first element = "+a);
        System.out.println("enter the second elements ="+b);
        
        System.out.println("addition: 10+3= "+(a+b));
        System.out.println("subration: 10-3= "+(a-b));
        System.out.println("multiplication: 10*3= "+(a*b));
        System.out.println("division: 10/3= "+(a/b));
        System.out.println("modulus: 10%3= "+(a%b));
    }
}

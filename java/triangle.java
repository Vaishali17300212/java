import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==b && b==c){
            System.out.println("equilateral triangle");
        }else if(a==b || b==c || c==a){
            System.out.println("isosceles triaangle");
        }else{
            System.out.println("scalene triangle");
        }
    }
}

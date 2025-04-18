import java.util.Scanner;
public class quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double d=b*b - 4*a*c;
        System.out.println(d);
        if(d>0){
            double r1= -b + Math.sqrt(d)/2*a;
            double  r2= -b - Math.sqrt(d)/2*a;
            System.out.println(r1);
            System.out.println(r2);
        }else if(d==0){
            double r1= -b /2*a;
            double r2= -b /2*a;
            System.out.println(r1);
            System.out.println(r2);
        }else if(d<0){
            double r1= -b /2*a;
            double r2=b*b -4*a*c/2*a;
            System.out.println(r1);
            System.out.println(r2);
        }
        
        
    }
}

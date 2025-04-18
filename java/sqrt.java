import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)Math.cbrt(n);
        System.out.println(a);
        if((a*a*a)==n){
            System.out.println("perfect cube"+a);
        }else{
            System.out.println("not perfect cube"+a);
        }
    }
}

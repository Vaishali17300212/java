import java.util.Scanner;
public class loop {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum =0;
    for(int i=2;i<=50;i+=2){
        sum += i;
    }
    System.out.println("sum of the even number 1 to 50:"+sum);
   } 
}

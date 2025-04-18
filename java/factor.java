import java.util.*;
public class factor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //factor finding
         int i;
         int count =0;
         for(i=1;i<=n;i++){
            if(n%i==0){
                count ++;
            }
         }
         //prime or not
         if(count==2){
            System.out.println("prime");
         }else{
            System.out.println("not prime");
         }
    }
}

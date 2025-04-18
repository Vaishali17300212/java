import java.util.*;
public class electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        double a=0;
        if(u<=50){
            a=u*0.25;
        }
        else if(u<50 && u<=150){
            a=12.5+((u-50)*0.75);
           
        }
        else if(u<=150 && u<=250){
            a=87.5+((u-150)*1.2);
        }
        else if(u>250){
            a=207.5+((u-250)*1.9);
        }
        System.out.println(a);
    }
}

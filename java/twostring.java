import java.util.*;
public class twoloop {
    public static void main(String[] args) {
        Scanner vaishu =new Scanner(System.in);
        System.out.print("enter any number:");
        int a=vaishu.nextInt();
        int i,j;
        for(i=499,j=1 ; i>=j ; i-- , j++){
            System.out.println(i);
            System.out.println(j);
        }
    }
}


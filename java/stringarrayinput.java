import java.util.Scanner;
public class stringarrayinput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the elements:");
        int size=sc.nextInt();
        sc.nextLine();

        String[] names=new String[size];

        System.out.println("enter" + size + " names:");
        for(int i =0;i<size;i++){
             names[i]=sc.nextLine();
        }

        System.out.println(" array names are:");
        for(String name:names){
             System.out.println(name +" ");
        }
    }
}

import java.util.Scanner;
public class teninteger {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the elements:");
      int size=sc.nextInt();
      
      int[]numbers= new int[size];

      System.out.println("enter" + size + "elements:");
      for(int i =0;i<size;i++){
         numbers[i]=sc.nextInt();
      }

      System.out.println("array elements are:");
      for(int num:numbers){
        System.out.print(num + " ");
      }
    }
}
